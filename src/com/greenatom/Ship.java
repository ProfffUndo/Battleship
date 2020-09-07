package com.greenatom;

public class Ship {
    private int size;
    private int x;
    private int y;
    private boolean direction; //true=left-right false=down-up

    Ship(int size, int x, int y, boolean direction) throws IllegalArgumentException{
        if (direction) {
            if (x + size < 10 && x >= 0)
                setX(x);
            else {
                throw new IllegalArgumentException("Illegal argument x=" + (x+1));
            }
            if (y < 10 && y >= 0)
                setY(y);
            else {
                throw new IllegalArgumentException("Illegal argument y=" + (y+1));
            }
        }
        else{
            if (y + size < 10 && y >= 0)
                setY(y);
            if (x < 10 && x >= 0)
                setX(x);
        }

        setDirection(direction);
        setSize(size);
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

}
