package ejercicio3_poo_avanzado;

public class Ejercicio3_POO_Avanzado {

    public static void main(String[] args) {
        
        Author autor = new Author("Stephen King", "stepehenking@gmail.com", 'm');
        Author autor2 = new Author ("Adrian Perez", "asñdka.s@lñdka", 't'); //Valores que no pasan la validación
        
        System.out.println(autor);
        System.out.println(autor2); // Imprime valores genéricos para email y género por ingreso inválido
    }
    
}
