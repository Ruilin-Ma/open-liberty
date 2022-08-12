/*******************************************************************************
 * Copyright (c) 2022 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package io.openliberty.checkpoint.fat;

import static org.junit.Assert.fail;

import java.net.URL;

import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.ibm.websphere.simplicity.ShrinkHelper;
import com.ibm.websphere.simplicity.config.ServerConfiguration;

import componenttest.annotation.Server;
import componenttest.annotation.SkipIfCheckpointNotSupported;
import componenttest.custom.junit.runner.FATRunner;
import componenttest.custom.junit.runner.Mode.TestMode;
import componenttest.rules.repeater.MicroProfileActions;
import componenttest.rules.repeater.RepeatTests;
import componenttest.topology.impl.LibertyServer;
import componenttest.topology.impl.LibertyServer.CheckpointInfo;
import componenttest.topology.utils.HttpUtils;
import componenttest.topology.utils.HttpUtils.HTTPRequestMethod;
import io.openliberty.checkpoint.spi.CheckpointPhase;
import restClient.AlternateApp;
import restClient.AlternateEndpoint;
import restClient.ClientApp;
import restClient.ClientEndpoints;
import restClient.ClientEndpointsEarlyStart;
import restClient.RESTclient;
import restClient.ServerApp;
import restClient.ServerEndpoint;

@RunWith(FATRunner.class)
@SkipIfCheckpointNotSupported
public class RESTclientTest {
    public static final String SERVER_NAME = "restClientServer";
    @ClassRule
    public static RepeatTests r = MicroProfileActions.repeat(SERVER_NAME, TestMode.LITE, MicroProfileActions.MP41, MicroProfileActions.MP50);

    public static final String APP_NAME = "restClient";

    @Server(SERVER_NAME)
    public static LibertyServer server;

    @BeforeClass
    public static void copyAppToDropins() throws Exception {

        WebArchive webappWar = ShrinkWrap.create(WebArchive.class, "webappWAR.war")
                        .addClass(AlternateApp.class)
                        .addClass(AlternateEndpoint.class)
                        .addClass(ClientApp.class)
                        .addClass(ClientEndpoints.class)
                        .addClass(ClientEndpointsEarlyStart.class)
                        .addClass(RESTclient.class)
                        .addClass(ServerApp.class)
                        .addClass(ServerEndpoint.class);

        ShrinkHelper.exportAppToServer(server, webappWar);
    }

    @Test
    public void testConfigureRestClient() throws Exception {

        server.startServer();
        HttpUtils.findStringInUrl(server, "webappWAR/app/client/properties", "{\'property\':\'value\'}");
        HttpUtils.findStringInUrl(server, "webappWAR/app/client/early/properties", "{\'property\':\'value\'}");
        server.stopServer();

        server.setCheckpoint(CheckpointPhase.APPLICATIONS, false, null);
        server.startServer();

        ServerConfiguration config = server.getServerConfiguration();
        config.getVariables().getById("testClient").setValue("http://localhost:" + server.getHttpDefaultPort() + "/webappWAR/alternate");
        server.updateServerConfiguration(config);

        server.checkpointRestore();

        HttpUtils.findStringInUrl(server, "webappWAR/app/client/properties", "{\'property\':\'alternate value\'}");
        HttpUtils.findStringInUrl(server, "webappWAR/app/client/early/properties", "{\'property\':\'alternate value\'}");

        URL postURL = new URL("http://localhost:" + server.getHttpDefaultPort() + "/webappWAR/app/client/setHost/endpoint");
        int responseCode = HttpUtils.getHttpConnection(postURL, 5000, HTTPRequestMethod.POST).getResponseCode();

        if (responseCode < 200 || responseCode >= 300) {
            fail("SetHost POST request did not return a 200 HTTP response code");
        }

        HttpUtils.findStringInUrl(server, "webappWAR/app/client/properties", "{\'property\':\'value\'}");
    }

    @AfterClass
    public static void stopServer() throws Exception {

        ServerConfiguration config = server.getServerConfiguration();
        config.getVariables().getById("testClient").setValue("http://localhost:" + server.getHttpDefaultPort() + "/webappWAR/endpoint");
        server.updateServerConfiguration(config);

        server.stopServer();
        server.setCheckpoint((CheckpointInfo) null);
    }

}