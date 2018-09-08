package ejercicio8_poo_avanzado;

/*
  Crear una clase cilindro que herede de otra llamada círculo.
  Implementar métodos para setear y mostrar sus atributos
 */
public class Ejercicio8_POO_Avanzado {

    public static void main(String[] args) {

        Cylinder cilindro = new Cylinder(10, 20, "blue");
        
        System.out.println(cilindro);
        System.out.println(cilindro.getVolume());
    }
    
}
