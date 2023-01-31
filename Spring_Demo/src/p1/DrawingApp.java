package p1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("Spring.xml"));
		Triangle t1= (Triangle)factory.getBean("triangl");
		t1.draw();

	}

}
