/*******************************************************************************
 * Copyright (c) 2017 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vIBM 2.2.3-11/28/2011 06:21 AM(foreman)-
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2014.06.11 at 05:49:00 PM EDT
//

package com.ibm.jbatch.jsl.model.v1;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for Partition complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Partition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="mapper" type="{http://xmlns.jcp.org/xml/ns/javaee}PartitionMapper"/>
 *           &lt;element name="plan" type="{http://xmlns.jcp.org/xml/ns/javaee}PartitionPlan"/>
 *         &lt;/choice>
 *         &lt;element name="collector" type="{http://xmlns.jcp.org/xml/ns/javaee}Collector" minOccurs="0"/>
 *         &lt;element name="analyzer" type="{http://xmlns.jcp.org/xml/ns/javaee}Analyzer" minOccurs="0"/>
 *         &lt;element name="reducer" type="{http://xmlns.jcp.org/xml/ns/javaee}PartitionReducer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Partition", propOrder = {
                                           "mapper",
                                           "plan",
                                           "collector",
                                           "analyzer",
                                           "reducer"
})
@Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2014-06-11T05:49:00-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
public class Partition extends com.ibm.jbatch.jsl.model.Partition {

    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2014-06-11T05:49:00-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    protected PartitionMapper mapper;
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2014-06-11T05:49:00-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    protected PartitionPlan plan;
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2014-06-11T05:49:00-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    protected Collector collector;
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2014-06-11T05:49:00-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    protected Analyzer analyzer;
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2014-06-11T05:49:00-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    protected PartitionReducer reducer;

    /** {@inheritDoc} */
    @Override
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2014-06-11T05:49:00-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public PartitionMapper getMapper() {
        return mapper;
    }

    /** {@inheritDoc} */
    @Override
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2014-06-11T05:49:00-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public void setMapper(com.ibm.jbatch.jsl.model.PartitionMapper value) {
        this.mapper = (PartitionMapper) value;
    }

    /** {@inheritDoc} */
    @Override
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2014-06-11T05:49:00-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public PartitionPlan getPlan() {
        return plan;
    }

    /** {@inheritDoc} */
    @Override
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2014-06-11T05:49:00-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public void setPlan(com.ibm.jbatch.jsl.model.PartitionPlan value) {
        this.plan = (PartitionPlan) value;
    }

    /** {@inheritDoc} */
    @Override
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2014-06-11T05:49:00-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public Collector getCollector() {
        return collector;
    }

    /** {@inheritDoc} */
    @Override
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2014-06-11T05:49:00-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public void setCollector(com.ibm.jbatch.jsl.model.Collector value) {
        this.collector = (Collector) value;
    }

    /** {@inheritDoc} */
    @Override
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2014-06-11T05:49:00-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public Analyzer getAnalyzer() {
        return analyzer;
    }

    /** {@inheritDoc} */
    @Override
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2014-06-11T05:49:00-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public void setAnalyzer(com.ibm.jbatch.jsl.model.Analyzer value) {
        this.analyzer = (Analyzer) value;
    }

    /** {@inheritDoc} */
    @Override
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2014-06-11T05:49:00-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public PartitionReducer getReducer() {
        return reducer;
    }

    /** {@inheritDoc} */
    @Override
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2014-06-11T05:49:00-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public void setReducer(com.ibm.jbatch.jsl.model.PartitionReducer value) {
        this.reducer = (PartitionReducer) value;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(100);
        buf.append("Partition:");

        if (mapper != null)
            buf.append("Contains mapper=" + mapper);
        if (collector != null)
            buf.append("Contains collector=" + collector);
        if (analyzer != null)
            buf.append("Contains analyzer=" + analyzer);
        if (reducer != null)
            buf.append("Contains reducer=" + reducer);

        return buf.toString();
    }

}
