package com.derinaldis.javabrainsspringtutorial;;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class DrawingApp {
  public void draw(){
    BeanFactory factory = new XmlBeanFactory(new ClassPathResource("spring.xml"));
    Triangle triangle = (Triangle)factory.getBean("triangle");
    triangle.draw();
  }

  public static void main(String[] args){
    new DrawingApp().draw();
  }
}
