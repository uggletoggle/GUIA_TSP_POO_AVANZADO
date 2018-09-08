package ejercicio11_poo_avanzado;

/*
  Crear una clase Circulo que usa como centro otra Clase Punto
  Ambas heredan de una interface Movable que le brinda movimiento.
*/

public class Ejercicio11_POO_Avanzado{
    
    public static void main(String[] args) {
        
        MovableCircle c = new MovableCircle(100, 100, 5, 5, 10);
        
        System.out.println(c);
        c.moveDown();
        c.moveLeft();
        System.out.println(c);
        c.moveRight();
        c.moveRight();
        c.moveUp();
        System.out.println(c);
    }
    
}
