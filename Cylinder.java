import java.util.* ;

public class Cylinder{
    private double radius;
    private double height;
    private String name;

    public Cylinder(String name, double radius, double height){
        this.radius = radius;
        this.height = height;
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public double area(){
        return((this.radius * 2) * height);
    }

    public double volume(){
        double base = Math.pow((this.radius * Math.PI), 2);
        return(this.height * base);
    }

    public void setHeight(double height){
        this.height = height;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getHeight(){
        return this.height;
    }

    public double getRadius(){
        return this.radius;
    }
}