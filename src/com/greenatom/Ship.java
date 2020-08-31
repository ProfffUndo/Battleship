package com.greenatom;

public class Ship {
    private int size;
    private boolean[] status = new boolean[size];
    private int x;
    private int y;
    private boolean direction; //true=left-right false=down-up

    Ship(int size, int x, int y, boolean direction) throws IllegalArgumentException{
        if (direction) {
            if (x + size <= 10 && x > 0)
                setX(x);
            else {
                throw new IllegalArgumentException("Illegal argument x=" + x);
            }
            if (y <= 10 && y > 0)
                setY(y);
            else {
                throw new IllegalArgumentException("Illegal argument y=" + y);
            }
        }
        else{
            if (y + size <= 10 && y > 0)
                setY(y);
            if (x <= 10 && x > 0)
                setX(x);
        }

        setStatus();
        setDirection(direction);
        setSize(size);
    }

    public void showStatus() {
        for (int i=0; i<getSize(); i++){
            System.out.println(status[i]);
        }
    }

    public boolean isAlive(){
        for (int i=0; i<getSize(); i++){
           if (status[i] = true) return true;
        }
        return false;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isDirection() {
        return direction;
    }

    public int getSize() {
        return size;
    }

    public void setDirection(boolean direction) {
        this.direction = direction;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setStatus() {
        for (int i=0; i<getSize(); i++){
            this.status[i] = true;
        }
    }
}
