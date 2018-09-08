package ejercicio12_poo_avanzado;

public class Ejercicio12_POO_Avanzado {

    public static void main(String[] args) {
        
        ResizableCircle c = new ResizableCircle(10);
        
        System.out.println(c.getArea());
        System.out.println(c.getPerimeter());
        c.resize(10); //incrementa el radio un 10 por ciento
        System.out.println(c.radius);
    }
    
}
