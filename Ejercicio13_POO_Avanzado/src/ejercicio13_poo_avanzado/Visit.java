package ejercicio13_poo_avanzado;

import java.util.Date;

public class Visit {
    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;
    
    public Visit(Customer c, Date date){
        customer = c;
        this.date = date;
    }
    
    public Visit(String name, Date date){
        this.customer = new Customer(name);
        this.date = date;
    }
    
    public String getName(){
        return customer.getName();
    }
    
    public double getServiceExpense(){
        return serviceExpense;
    }
    
    public void setServiceExpense(double ex){
        serviceExpense = ex;
    }
    
    public double getProductExpense(){
        return productExpense;
    }
    
    public void setProductExpense(double ex){
        productExpense = ex;
    }
    
    public double getTotalExpense(){
       
       if (customer.isMember()){ 
        return (productExpense-productExpense*DiscountRate.getProductDiscountRate(customer.getMemberType())) + 
                (serviceExpense-serviceExpense*DiscountRate.getServiceDiscountRate(customer.getMemberType()));
       } else return productExpense+serviceExpense;
    }
    
    @Override
    public String toString(){
        return "ORDEN DE COMPRA\n"
                + "\n"
                + "Total=" + getTotalExpense()
                + "\nMembresia=" + customer.isMember()
                + "\nFecha " + date;
    }
}
