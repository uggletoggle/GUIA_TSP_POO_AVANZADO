package ejercicio8_poo_avanzado;

public class Circle {
    
    private double radius = 1;
    private String color = "red";
    
    public Circle(){}
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    public Circle(double radius, String color){
        this(radius);
        this.color = color;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    public double getArea(){
        return Math.PI*Math.pow(radius, 2);
    }
    
    @Override
    public String toString(){
        return "Circle [radius=" + radius + ",color=" + color + ']';
    }
    
}
