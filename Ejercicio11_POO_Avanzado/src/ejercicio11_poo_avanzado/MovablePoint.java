package ejercicio11_poo_avanzado;

public class MovablePoint implements Movable{
    
    int x;
    int y;
    int xSpeed;
    int ySpeed;
    
    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    
    @Override
    public String toString(){
        return "Point[x=" + x +",y=" + y +"]";
    }

    @Override
    public void moveUp() {
        
    }

    @Override
    public void moveDown() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void moveLeft() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void moveRight() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
