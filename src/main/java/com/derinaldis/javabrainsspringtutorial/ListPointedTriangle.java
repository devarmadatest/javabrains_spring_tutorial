package com.derinaldis.javabrainsspringtutorial;

import java.util.List;

public class ListPointedTriangle implements Triangle {

private List<Point> points;

public void setPoints(List points){
        this.points=points;
}

public List<Point> getPoints(){
        return points;
}

public void draw(){
        int i=0;
        for(Point point : getPoints()) {
                System.out.println("Point# " + (++i) + " (" + point.getX() + ", " + point.getY() + ")");
        }
}

}
