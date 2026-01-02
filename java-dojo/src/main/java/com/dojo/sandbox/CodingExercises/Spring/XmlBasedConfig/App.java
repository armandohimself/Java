package com.dojo.sandbox.CodingExercises.Spring.XmlBasedConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // Load Spring configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        // Retrieve the bean from the IoC container
        Vehicle obj = (Vehicle) context.getBean("vehicle"); // Spring injects this bean into the App class when we called getBean()
        // And create a Bike Bean for the vehicle ID

        //? Why do we care to create objects this way?
        // * This allows us to let go of control of object creation, dependency injection, & lifecycle management over to Spring. 
        // You don't see it know but imagine having 50 objects in this app. Going through one by one to change them would be more time consuming rather than just changing it in one place, the XML file. The other pro is that you can let others edit the config who may not be developers and make changes to the "rules" of the game. 
        
        Vehicle vehicle = new Bike();
        
        obj.drive();
        vehicle.drive();
    }
}

// You can easily change the depedency by changing the bean in the spring-config.xml file
// <bean id="vehicle" class="Revature.Car" />
// Spring would now inject car instead of a Bike, without any Java code.
