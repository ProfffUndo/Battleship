package com.greenatom;

public interface Shooter {
    public void makeShot(PlayerField enemy, int x, int y);
    public void enemyShot(int x,int y);
}
