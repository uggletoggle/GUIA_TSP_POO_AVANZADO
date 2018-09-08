package ejercicio5_poo_avanzado;

public class Ejercicio5_POO_Avanzado {

    public static void main(String[] args) {

        Author a1 = new Author();
        Author a2 = new Author();
        
        a1.setName("Carlos");
        a1.setGender('H');
        a1.setEmail("allow@gmail.com");
        
        a2.setName("Lauro");
        a2.setGender('H');
        a2.setEmail("allow@hotmail.com");
        
        Author[] autores = {a1,a2};
        
        Book libro = new Book("Silencio", autores, 300);
        
        System.out.println(libro);
        System.out.println(libro.getAuthorNames());
        
    }
    
}
