package ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarTest {
	public static void main(String[] args) {

		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/car.xml");

		
	}
}
