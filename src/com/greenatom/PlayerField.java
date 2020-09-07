package com.greenatom;

public class PlayerField extends Field {
    PlayerField(){
        super();
    }

    public void setShip(Ship ship) throws IllegalArgumentException{
        int x1;
        int y1;
        int x2;
        int y2;
        if(ship.getX()!=0) x1=ship.getX()-1;
        else x1=0;
        if(ship.getY()!=0) y1=ship.getY()-1;
        else y1=0;
        if(ship.isDirection()) {
            if (ship.getX() != 9) x2 = ship.getX() + ship.getSize() + 1;
            else x2 = 9;
            if (ship.getY() != 9) y2 = ship.getY() + 1;
            else y2 = 9;
        }
        else{
            if (ship.getX() != 9) x2 = ship.getX() + 1;
            else x2 = 9;
            if (ship.getY() != 9) y2 = ship.getY() + ship.getSize()+ 1;
            else y2 = 9;
        }

        for (int i=x1; i<x2; i++){
            for (int j=y1; j<y2; j++){
                if (field[i][j].getCode()==1) throw new IllegalArgumentException ("Ships can not be so close");
            }
        }

        field[ship.getX()][ship.getY()].setCell(1);
        for (int i=1; i< ship.getSize(); i++){
            if (ship.isDirection()){
                field[ship.getX()+i][ship.getY()].setCell(1);
            }
            else {
                field[ship.getX()][ship.getY()+i].setCell(1);
            }
        }
    }


    public void setEnemyShot(int x, int y) {
        switch (field[x][y].getCode()) {
            case 0:
                setMiss(x, y);
                break;
            case 1:
                setHit(x, y);
                break;
        }
    }

}
