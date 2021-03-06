/*
 * Copyright 2012 Shared Learning Collaborative, LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.04.20 at 03:09:04 PM EDT 
//


package org.slc.sli.sample.entities;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CohortYearType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CohortYearType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Eighth grade"/>
 *     &lt;enumeration value="Eleventh grade"/>
 *     &lt;enumeration value="Fifth grade"/>
 *     &lt;enumeration value="First grade"/>
 *     &lt;enumeration value="Fourth grade"/>
 *     &lt;enumeration value="Ninth grade"/>
 *     &lt;enumeration value="Second grade"/>
 *     &lt;enumeration value="Seventh grade"/>
 *     &lt;enumeration value="Sixth grade"/>
 *     &lt;enumeration value="Tenth grade"/>
 *     &lt;enumeration value="Third grade"/>
 *     &lt;enumeration value="Twelfth grade"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CohortYearType")
@XmlEnum
public enum CohortYearType {

    @XmlEnumValue("Eighth grade")
    EIGHTH_GRADE("Eighth grade"),
    @XmlEnumValue("Eleventh grade")
    ELEVENTH_GRADE("Eleventh grade"),
    @XmlEnumValue("Fifth grade")
    FIFTH_GRADE("Fifth grade"),
    @XmlEnumValue("First grade")
    FIRST_GRADE("First grade"),
    @XmlEnumValue("Fourth grade")
    FOURTH_GRADE("Fourth grade"),
    @XmlEnumValue("Ninth grade")
    NINTH_GRADE("Ninth grade"),
    @XmlEnumValue("Second grade")
    SECOND_GRADE("Second grade"),
    @XmlEnumValue("Seventh grade")
    SEVENTH_GRADE("Seventh grade"),
    @XmlEnumValue("Sixth grade")
    SIXTH_GRADE("Sixth grade"),
    @XmlEnumValue("Tenth grade")
    TENTH_GRADE("Tenth grade"),
    @XmlEnumValue("Third grade")
    THIRD_GRADE("Third grade"),
    @XmlEnumValue("Twelfth grade")
    TWELFTH_GRADE("Twelfth grade");
    private final String value;

    CohortYearType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CohortYearType fromValue(String v) {
        for (CohortYearType c: CohortYearType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
