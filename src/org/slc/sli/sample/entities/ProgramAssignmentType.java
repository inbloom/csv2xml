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
 * <p>Java class for ProgramAssignmentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProgramAssignmentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Regular Education"/>
 *     &lt;enumeration value="Title I-Academic"/>
 *     &lt;enumeration value="Title I-Non-Academic"/>
 *     &lt;enumeration value="Special Education"/>
 *     &lt;enumeration value="Bilingual/English as a Second Language"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProgramAssignmentType")
@XmlEnum
public enum ProgramAssignmentType {

    @XmlEnumValue("Regular Education")
    REGULAR_EDUCATION("Regular Education"),
    @XmlEnumValue("Title I-Academic")
    TITLE_I_ACADEMIC("Title I-Academic"),
    @XmlEnumValue("Title I-Non-Academic")
    TITLE_I_NON_ACADEMIC("Title I-Non-Academic"),
    @XmlEnumValue("Special Education")
    SPECIAL_EDUCATION("Special Education"),
    @XmlEnumValue("Bilingual/English as a Second Language")
    BILINGUAL_ENGLISH_AS_A_SECOND_LANGUAGE("Bilingual/English as a Second Language");
    private final String value;

    ProgramAssignmentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProgramAssignmentType fromValue(String v) {
        for (ProgramAssignmentType c: ProgramAssignmentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
