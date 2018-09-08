package ejercicio3_poo_avanzado;

public class Author {
    
    //Sin valor por defecto para las variables
    private String name;
    private String email; 
    private char gender; // 'm' or 'f' - ingreso inválido genera constructor con 'm'
    
    public Author(String name, String email, char gender){
        this.name = name;
        if(validaMail(email)){
            this.email = email;
        } else {
            this.email = "miMail@xxx.com";
        }
        
        if (gender == 'm' || gender == 'f'){
            this.gender = gender;
        } else this.gender = 'm';
    }
    
    public String getName(){
        return name;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        if (validaMail(email)){
            this.email = email;
        } else System.out.println("Ingrese una dirección de email válida");
    }
    
    public char getGender(){
        return gender;
    }
    
    @Override
    public String toString(){
        return "Author[name=" + name + ",email=" + email + ",gender=" + gender + ']';
    }
    
    private boolean validaMail(String email){ //Validación de email - invisible al usuario se ejecuta cuando setea email
        int len = email.length();
        int contador_arroba = 0;
        int contador_punto = 0;
        
        for (int i = 0; i < len; i ++){
            if (email.charAt(i) == '@'){
                contador_arroba ++;
                if (contador_arroba > 1){
                    break;
                }
            }
            
            if (email.charAt(i) == '.'){
                if(contador_arroba == 1){
                    contador_punto ++;
                }
            }
        }
        
        return contador_arroba == 1 && contador_punto == 1;
    }
    
}
