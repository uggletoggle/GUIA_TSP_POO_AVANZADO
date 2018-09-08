package ejercicio5_poo_avanzado;


public class Book {

    private String name ;
    private Author[] authors;
    private double price;
    private int qty;
    
    public Book(String name, Author[] authors, double price){
        this.name = name;
        this.authors = authors;
        this.price = price;
    }
    
    public Book(String name, Author[] authors, double price, int qty){
        this(name, authors, price);
        this.qty = qty;
    }
    
    public String getName(){
        return name;
    }
    
    public Author[] getAuthors(){
        return authors;
    }
    
    public double getPrice(){
        return price;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    public int getQty(){
        return qty;
    }
    
    public void setQty(int qty){
        this.qty = qty;
    }
    
    @Override
    public String toString(){
        
        String autores = "";
        
        for(Author a: authors){
            autores += a.toString() + ',';
        }
        
        return "Book[name=" + name + ",authors={" + autores + "\b},price=" + 
                price + ",qty=" + qty + ']';
    }
    
    public String getAuthorNames(){
        
        String result = "";
        
        for(Author a: authors){
            result += a.getName() + ",";
        }
        
        return result + "\b";
    }
}
