package com.greenatom;

public class PlayerField extends Field {
    PlayerField(){
        super();
    }

    public void setShip(Ship ship){
        field[ship.getX()][ship.getY()].setCode(1);
        for (int i=1; i< ship.getSize(); i++){
            if (ship.isDirection()){
                field[ship.getX()+i][ship.getY()].setCode(1);
            }
            else {
                field[ship.getX()][ship.getY()+i].setCode(1);
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
