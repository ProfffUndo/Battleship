package com.greenatom;

public class EnemyField extends Field {
    EnemyField(){
        super();
    }

    public boolean setShot(PlayerField enemyField, int x, int y){
        switch (enemyField.getField()[x][y].getCode()){
            case 0:
                setMiss(x, y);
                return false;
            case 1:
                setHit(x, y);
                return true;
        }
        return false;
    }
}
