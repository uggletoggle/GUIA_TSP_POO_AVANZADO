package ejercicio10_poo_avanzado;

public class Square extends Rectangle{
   
    public Square(){}
    
    public Square(double side){
        width = side;
        length = side;
    }
    
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }
    
    public double getSide(){
        return width;
    }
    
    public void setSide(double side){
        width = side;
        length = side;
    }
    
    @Override
    public void setWidth(double side){
        setSide(side);
    }
    
    @Override
    public void setLength(double side){
        setSide(side);
    }
            
    @Override
    public String toString(){
        return "Square[side=" + width + ",area=" + this.getArea() + "]";
    }
}
