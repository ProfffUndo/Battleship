package com.greenatom;

public interface Shooter {
    public boolean makeShot(PlayerField enemy, int x, int y);
    public void enemyShot(int x,int y);
}
