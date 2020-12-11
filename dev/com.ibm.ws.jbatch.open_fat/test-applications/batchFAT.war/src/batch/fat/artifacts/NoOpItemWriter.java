/*******************************************************************************
 * Copyright (c) 2015, 2020 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM Corporation - initial API and implementation
 *******************************************************************************/
package batch.fat.artifacts;

import java.util.List;

import javax.batch.api.chunk.AbstractItemWriter;

public class NoOpItemWriter extends AbstractItemWriter {

    @Override
    public void writeItems(List<Object> items) throws Exception {
    }

}
