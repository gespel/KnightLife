package com.gespel.sten.knightlife;

public class Player {
    private static int level = 1;
    private static int exp = 0;
    private static int gold = 0;
    private static int ruhm = 0;
    private static int posX = 1;
    private static int posY = 1;

    public Player() {

    }

    private void levelup() {
        level++;
    }
    private void checklevel() {
        if(level == 1 && exp >= 100) {
            levelup();
            exp -= 100;
        }
        if(level == 2 && exp >= 175) {
            levelup();
            exp -= 175;
        }
        if(level == 3 && exp >= 250) {
            levelup();
            exp -= 250;
        }
        if(level == 4 && exp >= 400) {
            levelup();
            exp -= 400;
        }
    }

    //Getter's ;) classics
    public int getLevel() {
        return level;
    }

    public void addExp(int i_exp) {
        exp += i_exp;
        checklevel();
    }
    public void moveNorth() {
        posY--;
    }
    public void moveSouth() {
        posY++;
    }
    public void moveWest() {
        posX--;
    }
    public void moveEast() {
        posX++;
    }

    public int getExp() {
        return exp;
    }
    public void addGold(int i_gold) {
        gold += i_gold;
    }
    public int getGold() {
        return gold;
    }
    public int getRuhm() {
        return ruhm;
    }
    public int getPosX() {
        return posX;
    }
    public int getPosY() {
        return posY;
    }
}
