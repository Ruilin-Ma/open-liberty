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
package com.ibm.ws.messaging.repeatedAnnotations.fat;

import org.junit.ClassRule;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import componenttest.custom.junit.runner.AlwaysPassesTest;
import componenttest.rules.repeater.JakartaEE10Action;
import componenttest.rules.repeater.RepeatTests;

// AlwaysPassesTest is required because RepeatedAnnotations are supported for JakartaEE10 and above.
@RunWith(Suite.class)
@SuiteClasses({ AlwaysPassesTest.class,
                RepeatedAnnotationsTest.class
})
public class FATSuite {

    @ClassRule
    public static RepeatTests r = RepeatTests.with(new JakartaEE10Action());

}