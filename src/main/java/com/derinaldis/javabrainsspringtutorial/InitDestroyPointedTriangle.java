package com.derinaldis.javabrainsspringtutorial;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.DisposableBean;

public class InitDestroyPointedTriangle implements Triangle, InitializingBean, DisposableBean {

private Point pointA;
private Point pointB;
private Point pointC;

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

public void afterPropertiesSet(){
        System.out.println("Triangle.afterPropertiesSet()");
}

public void destroy(){
        System.out.println("Triangle.destroy()");
}

public void myInit(){
        System.out.println("Triangle.myInit()");
}

public void myDestroy(){
        System.out.println("Triangle.public void myDestroy()");
}

public void draw(){
        System.out.println("PointA( " + getPointA().getX() + ", " + getPointA().getY() + ")");
        System.out.println("PointB( " + getPointB().getX() + ", " + getPointB().getY() + ")");
        System.out.println("PointC( " + getPointC().getX() + ", " + getPointC().getY() + ")");
}

}
