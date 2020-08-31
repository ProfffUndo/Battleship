package com.greenatom;

public class Player implements Shooter, Shipper {
    PlayerField playerField;
    EnemyField enemyField;
    String name;
    int score;

    Player(String name){
        playerField = new PlayerField();
        enemyField = new EnemyField();
        this.name=name;
        score=0;
    }

    public void makeShot(PlayerField enemy, int x, int y){
        if (enemyField.setShot(enemy,x,y)) score++;
    }

    public void setShip(Ship ship){
        playerField.setShip(ship);
    }

    public void enemyShot(int x,int y){
        playerField.setEnemyShot(x,y);
    }

    public void printPlayer(){

    }





}
