package com.derinaldis.javabrainsspringtutorial;

public class SimpleTriangle implements Triangle {

private String type;
private int height;

public SimpleTriangle(String type){
        this.type=type;
}

public SimpleTriangle(int height){
        this.height=height;
}

public SimpleTriangle(String type, int height){
        this.type=type;
        this.height=height;
}

public String getType(){
        return type;
}

public int getHeight(){
        return height;
}

public void draw(){
        System.out.println(String.format("%s triangle.draw of height %s", getType(), getHeight()));
}

}
