package com.greenatom;

public class Cell {
   // ISEMPTY(0), SHIPALIVE(1), SHIPDEAD(2), MISS(3);
    private int code;
    private char image;

     Cell(){
        setCode(0);
        setImage('□');
    }

     Cell(int code){
        if (code<0 || code>3) throw new IllegalArgumentException("Illegal code = " + code);
        setCode(code);
        switch (code){
            case 0: setImage('□');
            break;
            case 1: setImage('■');
            break;
            case 2: setImage('✖');
            break;
            case 3: setImage('*');
            break;
        }
    }


    public char getCode() {
        return image;
    }

    public void setCode(int code) {
        this.code = code;
    }

    private void setImage(char image) {
        this.image = image;
    }

    public char getImage() {
        return image;
    }

    public void setEmptyCell(){this.code=0; this.image=' ';}
}
