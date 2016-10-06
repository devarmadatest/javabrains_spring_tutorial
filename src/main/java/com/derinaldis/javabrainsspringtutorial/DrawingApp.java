package com.derinaldis.javabrainsspringtutorial;;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class DrawingApp {
public void draw(){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        context.registerShutdownHook();
        Triangle triangle = (Triangle)context.getBean("triangle");
        triangle.draw();
        // Triangle triangle2 = (Triangle)factory.getBean("triangle2");
        // triangle2.draw();
        // AwarePointedTriangle triangle2 = (AwarePointedTriangle)factory.getBean("triangle");
        // triangle2.getPointA().setX(100);
        // triangle.draw();
}

public static void main(String[] args){
        new DrawingApp().draw();
}
}
