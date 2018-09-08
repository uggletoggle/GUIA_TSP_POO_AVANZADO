package ejercicio12_poo_avanzado;

public class ResizableCircle extends Circle implements Resizable{
    
    public ResizableCircle(double radius){
        super(radius);
    }

    @Override
    public void resize(int percent){
        radius += radius*percent/100;
    }
}
