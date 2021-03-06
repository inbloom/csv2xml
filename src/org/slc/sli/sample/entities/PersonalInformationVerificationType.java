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
 * <p>Java class for PersonalInformationVerificationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PersonalInformationVerificationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Baptismal or church certificate"/>
 *     &lt;enumeration value="Birth certificate"/>
 *     &lt;enumeration value="Drivers license"/>
 *     &lt;enumeration value="Entry in family Bible"/>
 *     &lt;enumeration value="Hospital certificate"/>
 *     &lt;enumeration value="Immigration document/visa"/>
 *     &lt;enumeration value="Life insurance policy"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Other non-official document"/>
 *     &lt;enumeration value="Other official document"/>
 *     &lt;enumeration value="Parents affidavit"/>
 *     &lt;enumeration value="Passport"/>
 *     &lt;enumeration value="Physicians certificate"/>
 *     &lt;enumeration value="Previously verified school records"/>
 *     &lt;enumeration value="State-issued ID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PersonalInformationVerificationType")
@XmlEnum
public enum PersonalInformationVerificationType {

    @XmlEnumValue("Baptismal or church certificate")
    BAPTISMAL_OR_CHURCH_CERTIFICATE("Baptismal or church certificate"),
    @XmlEnumValue("Birth certificate")
    BIRTH_CERTIFICATE("Birth certificate"),
    @XmlEnumValue("Drivers license")
    DRIVERS_LICENSE("Drivers license"),
    @XmlEnumValue("Entry in family Bible")
    ENTRY_IN_FAMILY_BIBLE("Entry in family Bible"),
    @XmlEnumValue("Hospital certificate")
    HOSPITAL_CERTIFICATE("Hospital certificate"),
    @XmlEnumValue("Immigration document/visa")
    IMMIGRATION_DOCUMENT_VISA("Immigration document/visa"),
    @XmlEnumValue("Life insurance policy")
    LIFE_INSURANCE_POLICY("Life insurance policy"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Other non-official document")
    OTHER_NON_OFFICIAL_DOCUMENT("Other non-official document"),
    @XmlEnumValue("Other official document")
    OTHER_OFFICIAL_DOCUMENT("Other official document"),
    @XmlEnumValue("Parents affidavit")
    PARENTS_AFFIDAVIT("Parents affidavit"),
    @XmlEnumValue("Passport")
    PASSPORT("Passport"),
    @XmlEnumValue("Physicians certificate")
    PHYSICIANS_CERTIFICATE("Physicians certificate"),
    @XmlEnumValue("Previously verified school records")
    PREVIOUSLY_VERIFIED_SCHOOL_RECORDS("Previously verified school records"),
    @XmlEnumValue("State-issued ID")
    STATE_ISSUED_ID("State-issued ID");
    private final String value;

    PersonalInformationVerificationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PersonalInformationVerificationType fromValue(String v) {
        for (PersonalInformationVerificationType c: PersonalInformationVerificationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
