public class Sphere {
    //We hide the internal state of the object
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }



    public double calculateVolume(){
        return (4.0/3.0)*Math.PI*Math.pow(radius,3);
    }

    public double calculateSurfaceArea(){
        return 4*Math.PI*Math.pow(radius,2);
    }



}
