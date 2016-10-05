package com.derinaldis.javabrainsspringtutorial;

import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.BeanNameAware;

public class AwarePointedTriangle implements Triangle, ApplicationContextAware, BeanNameAware {

private Point pointA;
private Point pointB;
private Point pointC;

private ApplicationContext context;

public void setPointA(Point point){
        this.pointA=point;
}

public Point getPointA(){
        return pointA;
}

public void setPointB(Point point){
        this.pointB=point;
}

public Point getPointB(){
        return pointB;
}

public void setPointC(Point point){
        this.pointC=point;
}

public Point getPointC(){
        return pointC;
}

public void draw(){
        System.out.println("PointA( " + getPointA().getX() + ", " + getPointA().getY() + ")");
        System.out.println("PointB( " + getPointB().getX() + ", " + getPointB().getY() + ")");
        System.out.println("PointC( " + getPointC().getX() + ", " + getPointC().getY() + ")");
}

public void setApplicationContext(ApplicationContext context){
        this.context = context;
}

public void setBeanName(String name){
        System.out.println("bean name: " + name);
}
}
