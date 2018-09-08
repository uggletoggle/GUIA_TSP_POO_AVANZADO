package ejercicio13_poo_avanzado;

import java.util.Date;

/*
 Se pide que se escriba un sistema de descuentos para un salón de belleza,
 que ofrece servicios y vende productos de belleza. Ofrece 3 tipos de suscripciones
 con un 20%, 15%, 10% de descuento respectivamente en los servicios adquiridos.
 Todos los miembros tiene un 10% de descuento en los productos comprados(podría cambiar).
 Los clientes sin membresía no reciben ningún descuento.

 Escriba un programa que permita probar todas las clases para verificar si funcionan
 los distintos tipos de membresía.
*/

public class Ejercicio13_POO_Avanzado {

    public static void main(String[] args) {

        Customer c1 = new Customer("Juan");
        Customer c2 = new Customer("Laura");
        Customer c3 = new Customer("Alicia");
        
        c1.setMember(true);
        c1.setMemberType("PREMIUM");
        
        c2.setMember(true);
        c2.setMemberType("GOLD");
        
        c3.setMember(true);
        c3.setMemberType("SILVER");
        
        Visit visita = new Visit(c1, new Date());
        Visit visita2 = new Visit(c2, new Date());
        Visit visita3 = new Visit(c3, new Date());
        Visit visita4 = new Visit("Marta", new Date());
        
        visita.setProductExpense(1000);
        visita.setServiceExpense(2000);
        
        visita2.setProductExpense(1000);
        visita2.setServiceExpense(2000);
        
        visita3.setProductExpense(1000);
        visita3.setServiceExpense(2000);
        
        visita4.setProductExpense(1000);
        visita4.setServiceExpense(2000);
        
        System.out.println(visita.toString());
        System.out.println(visita2.toString());
        System.out.println(visita3.toString());
        System.out.println(visita4.toString());
    }
    
}
