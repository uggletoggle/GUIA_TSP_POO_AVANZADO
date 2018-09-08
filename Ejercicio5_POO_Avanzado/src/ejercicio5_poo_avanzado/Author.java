package ejercicio5_poo_avanzado;

class Author {

    private String name;
    private String email;
    private char gender;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    
    
    public String getName(){
        return name;
    }
    
    @Override
    public String toString(){
        return "[name=" + name + ",email=" + email + ",gender=" + gender + ']';
    }
}
