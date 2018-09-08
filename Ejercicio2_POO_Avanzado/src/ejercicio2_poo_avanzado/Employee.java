package ejercicio2_poo_avanzado;

public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private int salary;
    
    public Employee(int id, String firstName, String lastName, int salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    
    public int getId(){
        return id;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public String getName(){
        return firstName + " " + lastName;
    }
    
    public int getSalary(){
        return salary;
    }
    
    public void setSalary(int salary){
        this.salary = salary;
    }
    
    public int getAnnualSalary(){
        return salary * 12;
    }
    
    public int raiseSalary(int percent){
        if(percent < 1 && percent > 100){
            System.out.println("Ingrese un porcentaje válido");
            return Integer.MAX_VALUE;
        } else {
            salary += salary * percent / 100;
            return salary;
        }
    }
    
    @Override
    public String toString(){
        return "Employee[id=" + id + ",name=" + firstName + " " + lastName +",salary=" 
                + salary + ']';
    }
    
}
