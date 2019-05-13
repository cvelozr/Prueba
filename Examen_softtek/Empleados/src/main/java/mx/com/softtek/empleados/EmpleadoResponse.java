//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.05.11 a las 06:07:07 PM CDT 
//


package mx.com.softtek.empleados;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aviso" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "aviso"
})
@XmlRootElement(name = "empleadoResponse")
public class EmpleadoResponse {

    @XmlElement(required = true)
    protected String aviso;

    /**
     * Obtiene el valor de la propiedad aviso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAviso() {
        return aviso;
    }

    /**
     * Define el valor de la propiedad aviso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAviso(String value) {
        this.aviso = value;
    }

}
