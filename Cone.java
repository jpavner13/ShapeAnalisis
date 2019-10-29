import java.util.* ;

public class Cone{
    private double radius;
    private double height;
    private String name;

    public Cone(String name, double radius, double height){
        this.radius = radius;
        this.height = height;
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public double area(){
        return(((this.radius * 2) * height) / 2);
    }

    public double volume(){
        double base = Math.pow((this.radius * Math.PI), 2);
        double oneThird = (1.0 / 3.0) ;
        return(oneThird * this.height * base);
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

    public double slantHeight(){
        return Math.sqrt(Math.pow(this.radius, 2) + (Math.pow(this.height, 2)));
    }

    public double angle(){
        double degreesPerRadian = 57.2958 ;
        return Math.atan(this.radius/ this.height) * degreesPerRadian;
    }
}