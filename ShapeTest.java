public class ShapeTest{
    public static void main(String[] args){

        Cone cone1 = new Cone("Cone 1", 2.0, 5.0);
        Cone cone2 = new Cone("Cone 2", 5.23, 234.23);

        Cylinder cylinder1 = new Cylinder("Cylinder 1", 2.0, 5.0);
        Cylinder cylinder2 = new Cylinder("Cylinder 2", 5.23, 234.23);

        coneSummary(cone1);
        coneSummary(cone2);

        cylinderSummary(cylinder1);
        cylinderSummary(cylinder2);
    }

    public static void coneSummary(Cone cone){
        System.out.println(cone.getName() + ": \nArea: " + cone.area() + "\nVolume:" +
            cone.volume() + "\nSlant Height: " + cone.slantHeight() + "\nTop Angle: " +
            cone.angle() + "\n");
    }

    public static void cylinderSummary(Cylinder cylinder){
        System.out.println(cylinder.getName() + ": \nArea: " + cylinder.area() + "\nVolume:" +
            cylinder.volume() + "\n");
    }
}