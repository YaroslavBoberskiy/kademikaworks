package com.kademika.yboberskiy;

/**
 * Created by YB on 11.06.2015.
 */
public class Tank {
    private int speed = 10;
    private int x;
    private int y;
    private int direction;

    private ActionField af;
    private BattleField bf;

    public Tank (ActionField af, BattleField bf) {
        this(af, bf, 128, 512, 1);
    }

    public Tank (ActionField af, BattleField bf, int x, int y, int direction) {
        this.af = af;
        this.bf = bf;
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getDirection() {
        return direction;
    }

    public void turn(int direction) throws  Exception {
        this.direction = direction;
        af.processTurn(this);
    }

    public void fire () throws  Exception {
        Bullet bullet = new Bullet((x + 25), (y + 25), direction);
        af.processFire(bullet);
    }

    public void move() throws Exception {
        af.processMove(this);
    }

    public void moveRandom () throws Exception {
    }

    public void clean () throws Exception {

    }

    public void updateX (int x) {
        this.x += x;
    }

    public void updateY (int y) {
        this.y += y;
    }

    public void moveToQuadrant(int v, int h) throws Exception {
    }
}

