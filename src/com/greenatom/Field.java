package com.greenatom;

abstract public class Field {
    Cell[][] field;

    Field() {
        field = new Cell[10][10];
        for (int i = 0; i < 10; i++)
            for (int j = 0; j < 10; j++)
            field[i][j] = new Cell();

    }


    public Cell[][] getField() {
        return field;
    }

    public void setMiss(int x, int y){
        field[x][y].setCell(3);
    }
    public void setHit(int x,int y){
        field[x][y].setCell(2);
    }

    public void printField(){
        for (int i=0; i<10; i++) {
            System.out.print(i+1+"\t");
            for (int j = 0; j < 10; j++) {
                System.out.print(field[i][j].getImage()+"\t");
            }
            System.out.println();
        }
        System.out.print("\t");
        for (int i=1; i<=10; i++){
            System.out.print(i+"\t");
        }
        System.out.println();
    }
}
