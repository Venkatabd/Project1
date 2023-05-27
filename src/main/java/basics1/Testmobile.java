package basics1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Testmobile {
	public static void main(String[] args) {
//		ClassPathResource resource=new ClassPathResource("ioc1.xml");
//		BeanFactory beanFactory=new XmlBeanFactory(resource);
//		Mobile m=(Mobile) beanFactory.getBean("mymobile");
//		m.mxplayer();
		
		ApplicationContext context=new ClassPathXmlApplicationContext("ioc1.xml");
	    Mobile mobile= (Mobile) context.getBean("mymobile")	;
	    mobile.mxplayer();
		
	}
	
	

}
