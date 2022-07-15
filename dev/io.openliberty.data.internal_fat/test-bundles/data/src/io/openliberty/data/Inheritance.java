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
package io.openliberty.data;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.enterprise.inject.Stereotype;

/**
 * Copied from jakarta.nosql.mapping.Inheritance to investigate how well the
 * JNoSQL repository-related annotations work for relational database access.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Stereotype
public @interface Inheritance {
}
