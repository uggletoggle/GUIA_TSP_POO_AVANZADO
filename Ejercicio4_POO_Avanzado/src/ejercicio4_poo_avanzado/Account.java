package ejercicio4_poo_avanzado;

public class Account {

    private String id;
    private String name;
    private int balance;
    
    public Account(String id, String name){
        this.id = id;
        this.name = name;
    }
    
    public Account (String id, String name, int balance){
        this(id, name);
        if (balance >= 0){
            this.balance = balance;
        } else this.balance = 0;
    }
    
    public String getID(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public int getBalance(){
        return balance;
    }
    
    public int credit(int amount){
        if (amount > 0){
            balance += amount;
        } else {
            System.out.println("Debe ingresar un importe mayor a 0 para acreditar");
        }
        
        return balance;
    }
    
    public int debit (int amount){
        
        if (amount <= 0){
            System.out.println("Debe ingresar un importe mayor a 0 para debitar");
            return balance;
        }
        
        if (amount <= balance){
            balance -= amount;
        } else{
            System.out.println("No dispone de fondos suficientes para realizar la transaccion.");
        }
        
        return balance;
    }
    
    public int transferTo(Account another, int amount){
        if(amount <= 0){
            System.out.println("Debe ingresar un importe mayor a 0 para debitar");
            return balance;
        }
        
        if (amount <= balance){
            this.debit(amount);
            another.credit(amount);
        }
        
        return balance;
    }
    
    @Override
    public String toString(){
        return "Account[id=" + id + ",name=" + name + ",balance=" + balance + ']';
    }
    
}
