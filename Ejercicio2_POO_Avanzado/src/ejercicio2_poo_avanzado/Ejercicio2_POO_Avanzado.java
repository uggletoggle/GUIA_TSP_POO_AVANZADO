package ejercicio2_poo_avanzado;

public class Ejercicio2_POO_Avanzado {

    public static void main(String[] args) {
        
        Employee e1 = new Employee(1, "Fernando", "Ayala", 10000);
        
        System.out.println(e1.getAnnualSalary());
        System.out.println(e1.getName());
        System.out.println("Aumentamos el sueldo 50%...");
        e1.raiseSalary(50);
        System.out.println(e1);
    }
    
}
