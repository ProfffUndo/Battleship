package com.greenatom;

import java.util.Scanner;

public class Game {
    Player player1;
    Player player2;
    boolean turn=true; //true-player1; false-player-2;
    static Scanner in=new Scanner(System.in);

    Game(String player1, String player2){
        this.player1=new Player(player1);
        this.player2=new Player(player2);
    }

    public void createShips(Player player) {
        for (int i = 0; i < 3; i++) {
            for (int j = 4-i; j > 0; j--) {
                System.out.println("Please, set Ship. Size=" + (i+1));
                createShip(i+1,player);
            }
        }
    }

    public static void createShip(int size, Player player){
        System.out.print("x=");
        int x =in.nextInt()-1;
        System.out.print("y=");
        int y =in.nextInt()-1;
        System.out.print("direction (true=left-right; false=down-up)");
        boolean direction = in.nextBoolean();
        player.setShip(new Ship(size,x,y,direction));
    }

    public void newTurn(){
        if (turn) System.out.println(player1.getName()+" turn");
        else System.out.println(player2.getName()+" turn");
        int x = in.nextInt();
        int y = in.nextInt();
        if (turn){
            if (!player1.makeShot(player2.getPlayerField(), x,y)) {
                turn = !turn;
                player2.enemyShot(x, y);
                System.out.println("Miss");
                player1.printFields();
            }
        }
        else {
            if (!player2.makeShot(player1.getPlayerField(), x, y)) {
                turn = !turn;
                player1.enemyShot(x, y);
                System.out.println("Miss");
                player2.printFields();
            }
        }
    }

    public void playGame(){
        System.out.println("Welcome to Battleship");
        System.out.println("Player 1, please write your username");
        player1.setName(in.nextLine());
        System.out.println("Player 2, please write your username");
        player2.setName(in.nextLine());
        createShips(player1);
        createShips(player2);
        while(player1.getScore() != 20 || player2.getScore() != 20){
            newTurn();
        }
        if (player1.getScore() == 20) System.out.println(player1.getName()+" is a winner!");
        else System.out.println(player2.getName()+" is a winner!");
    }
}
