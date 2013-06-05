/**
 * SPINdle (version 2.2.2)
 * Copyright (C) 2009-2013 NICTA Ltd.
 *
 * This file is part of SPINdle project.
 * 
 * SPINdle is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * SPINdle is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with SPINdle.  If not, see <http://www.gnu.org/licenses/>.
 *
 * @author H.-P. Lam (oleklam@gmail.com), National ICT Australia - Queensland Research Laboratory 
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.30 at 12:44:15 PM EST 
//


package spindle.io.xjc.dom2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ctSuperiority complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ctSuperiority">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="superior" use="required" type="{http://spin.nicta.org.au/spindle/spindleDefeasibleTheory2.xsd}stRuleLabel" />
 *       &lt;attribute name="inferior" use="required" type="{http://spin.nicta.org.au/spindle/spindleDefeasibleTheory2.xsd}stRuleLabel" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctSuperiority", namespace = "http://spin.nicta.org.au/spindle/spindleDefeasibleTheory2.xsd")
public class CtSuperiority {

    @XmlAttribute(required = true)
    protected String superior;
    @XmlAttribute(required = true)
    protected String inferior;

    /**
     * Gets the value of the superior property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuperior() {
        return superior;
    }

    /**
     * Sets the value of the superior property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuperior(String value) {
        this.superior = value;
    }

    /**
     * Gets the value of the inferior property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInferior() {
        return inferior;
    }

    /**
     * Sets the value of the inferior property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInferior(String value) {
        this.inferior = value;
    }

}
