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
 *         &lt;element name="cveEmpleado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="paterno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="materno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cveArea" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "cveEmpleado",
    "nombre",
    "paterno",
    "materno",
    "cveArea"
})
@XmlRootElement(name = "empleadoRequest")
public class EmpleadoRequest {

    @XmlElement(required = true)
    protected String cveEmpleado;
    @XmlElement(required = true)
    protected String nombre;
    @XmlElement(required = true)
    protected String paterno;
    @XmlElement(required = true)
    protected String materno;
    @XmlElement(required = true)
    protected String cveArea;

    /**
     * Obtiene el valor de la propiedad cveEmpleado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCveEmpleado() {
        return cveEmpleado;
    }

    /**
     * Define el valor de la propiedad cveEmpleado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCveEmpleado(String value) {
        this.cveEmpleado = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad paterno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaterno() {
        return paterno;
    }

    /**
     * Define el valor de la propiedad paterno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaterno(String value) {
        this.paterno = value;
    }

    /**
     * Obtiene el valor de la propiedad materno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterno() {
        return materno;
    }

    /**
     * Define el valor de la propiedad materno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterno(String value) {
        this.materno = value;
    }

    /**
     * Obtiene el valor de la propiedad cveArea.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCveArea() {
        return cveArea;
    }

    /**
     * Define el valor de la propiedad cveArea.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCveArea(String value) {
        this.cveArea = value;
    }

}
