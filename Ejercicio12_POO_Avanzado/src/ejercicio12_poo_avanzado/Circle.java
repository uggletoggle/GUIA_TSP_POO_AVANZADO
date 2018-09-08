package ejercicio12_poo_avanzado;

public class Circle implements GeometricObject {

    protected double radius = 1;
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(radius,2);
    }
    
}
