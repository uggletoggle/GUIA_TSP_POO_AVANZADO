package ejercicio7_poo_avanzado;

/*  Creacion de la clase MyDate. supone que el año calendario
    comienza el dia 1 para calcular el dia de la semana y no
    se basa en el calendario real.
    Encontramos métodos para saber el día, mes o año previo y   
    posterior,
*/

public class Ejercicio7_POO_Avanzado {

    public static void main(String[] args) {
        
        MyDate fecha = new MyDate(2004, 6, 2);
        
        System.out.println(fecha.nextYear());
        
    }
    
}
