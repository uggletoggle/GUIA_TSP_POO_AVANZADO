package ejercicio4_poo_avanzado;

public class Ejercicio4_POO_Avanzado {

    public static void main(String[] args) {
        
        Account a1 = new Account ("1-01", "Caja de Ahorros", 10000);
        Account a2 = new Account ("1-02", "Cuenta Corriente");
        System.out.println(a1.getBalance());
        System.out.println(a2.getBalance());
        a2.debit(1000);
        System.out.println("Se acreditan 5000 a la cuenta a2...");
        a2.credit(5000);
        System.out.println(a2.getBalance());
        System.out.println("Se realiza transferencia de la cuenta a1 a a2...");
        a1.transferTo(a2, 2000);
        System.out.println("Nuevo estado de las cuentas");
        System.out.println("----------------------------");
        System.out.println(a1.getBalance());
        System.out.println(a2.getBalance());
    }
    
}
