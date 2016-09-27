package com.derinaldis.javabrainsspringtutorial;

public class PointedTriangle implements Triangle {

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

public void draw(){
        System.out.println("PointA( " + getPointA().getX() + ", " + getPointA().getY() + ")");
        System.out.println("PointB( " + getPointB().getX() + ", " + getPointB().getY() + ")");
        System.out.println("PointC( " + getPointC().getX() + ", " + getPointC().getY() + ")");
}

}
