package mx.com.softtek.ws;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {

	  @Bean
	  public ServletRegistrationBean messageDispatcherServlet(ApplicationContext context) {
	    MessageDispatcherServlet messageDispatcherServlet = new MessageDispatcherServlet();
	    messageDispatcherServlet.setApplicationContext(context);
	    messageDispatcherServlet.setTransformWsdlLocations(true);
	    return new ServletRegistrationBean(messageDispatcherServlet, "/ws/*");
	  }

	  @Bean(name = "empleados")
	  public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema empleadoSchema) {
	    DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
	    definition.setPortTypeName("EmpleadosPort");
	    definition.setTargetNamespace("http://softtek.com.mx/empleados");
	    definition.setLocationUri("/ws");
	    definition.setSchema(empleadoSchema);
	    return definition;
	  }
	  
	  @Bean
	  public XsdSchema empleadoSchema() {
	    return new SimpleXsdSchema(new ClassPathResource("empleados.xsd"));
	  }

}
