package org.example.point;

public class Point implements Movable {
    private double x;
    private double y;

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public void moveUp(double yMoveUp){
        setY(this.y += yMoveUp);
    }

    @Override
    public void moveDown(double yMoveDown){
        setY(this.y -= yMoveDown);
    }

    @Override
    public void moveLeft(double xMoveleft){
        setX((this.x -= xMoveleft));

    }

    @Override
    public void moveRight(double xMoveRight){
        setX((this.x += xMoveRight));
    }

    @Override
    public void pointCore(){
        System.out.println("\nCoordination: (" + getX() + "," + getY() + ")" + '\n');
    }
}
