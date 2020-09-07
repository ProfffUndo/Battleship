package com.greenatom;

import org.w3c.dom.ls.LSOutput;

public class Player implements Shooter, Shipper {
    private PlayerField playerField;
    private EnemyField enemyField;
    private String name;
    private int score;

    Player(String name){
        playerField = new PlayerField();
        enemyField = new EnemyField();
        this.name=name;
        score=0;
    }

    public boolean makeShot(PlayerField enemy, int x, int y){
        if (enemyField.setShot(enemy,x,y)){
            score++;
            return true;
        }
        else return false;
    }

    public void setShip(Ship ship){
        playerField.setShip(ship);
    }


    public void enemyShot(int x,int y){
        playerField.setEnemyShot(x,y);
    }

    public void printFields(){
        System.out.println("Your Field");
        playerField.printField();
        System.out.println("Enemy Field");
        enemyField.printField();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayerField getPlayerField() {
        return playerField;
    }

    public EnemyField getEnemyField() {
        return enemyField;
    }

    public int getScore() {
        return score;
    }
}
