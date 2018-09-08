package ejercicio6_poo_avanzado;

public class MyComplex {

    private double real;
    private double imag;
    
    public MyComplex(){}
    public MyComplex(double real, double imag){
        this.real = real;
        this.imag = imag;
    }
    
    public double getReal(){
        return real;
    }
    
    public void setReal(double real){
        this.real = real;
    }
    
    public double getImag(){
        return imag;
    }
    
    public void setImag(double imag){
        this.imag = imag;
    }
    
    public void setValue(double real, double imag){
        this.real = real;
        this.imag = imag;
    }
    
    @Override
    public String toString(){
        if(this.imag >= 0) return "(" + real + " + " + imag + "i)";
        else return "(" + real + " " + imag + "i)";
    }
    
    public boolean isReal(){
        return (imag == 0);
    }
    
    public boolean isImaginary(){
        return (real == 0);
    }
    
    public boolean equals(double real, double imag){
        return (this.real == real && this.imag == imag);
    }
    
    public boolean equals(MyComplex c){
        return this.equals(c.getReal(), c.getImag());
    }
    
    public double magnitude(){
        return Math.sqrt(Math.pow(real,2) + Math.pow(imag,2));
    }
    
    public double argument(){
        return Math.atan(imag/real);
    }
    
    public MyComplex add(MyComplex right){
        
        this.setReal(right.getReal() + this.real);
        this.setImag(right.getImag() + this.imag);
       
        return this;
    }
    
    public MyComplex addNew(MyComplex right){
        
        double real = (right.getReal() + this.real);
        double imag = (right.getImag() + this.imag);
        
        return new MyComplex(real, imag);
    }
    
    public MyComplex subtract(MyComplex right){
        
        this.setReal(this.real - right.getReal() );
        this.setImag(this.imag - right.getImag() );
       
        return this;
    }
    
    public MyComplex substractNew(MyComplex right){
        
        double real = (this.real - right.getReal());
        double imag = (this.imag - right.getImag());
        
        return new MyComplex(real, imag);
    }
    
    public MyComplex multiply(MyComplex right){
        
        double real = right.getReal()*this.getReal() - right.getImag()* this.getImag();
        double imag = right.getReal()*this.getImag() + right.getImag() * this.getReal();
        
        this.setReal(real);
        this.setImag(imag);
        
        return this;
    }
    
    public MyComplex divide(MyComplex right){
       
        double a = this.getReal();
        double b = this.getImag();
        double c = right.getReal();
        double d = right.getImag();
        
        double real = (a*c + b*d) / (c*c + d*d);
        double imag = (b*c- a*d)/(c*c + d*d);
        
        this.setReal(real);
        this.setImag(imag);
        
        return this;
    }
   
   public MyComplex conjugate(){
       
       this.setImag(-this.getImag());
       return this;
   } 
}
