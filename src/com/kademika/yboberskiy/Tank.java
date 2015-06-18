package com.kademika.yboberskiy;

import java.util.Random;

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

        this(af, bf, 128, 128, 1);
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

    public int getSpeed() {
        return speed;
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

    public void clean () throws Exception {
        moveToQuadrant(0, 0);

        for (int i = 0; i < bf.getDimensionX(); i ++) {
            turn(4);
            if (bf.scanQuadrant(0, i).equals("B")) {
                fire();
            }
        }

        for (int i = 0; i < bf.getDimensionX(); i ++) {
            turn(2);
            for (int j = 0; j < bf.getDimensionY(); j ++) {
                if (bf.scanQuadrant(j, i).equals("B")) {
                    fire();
                }
            }
            turn(4);
            move();
        }
    }

    public void updateX (int x) {
        this.x += x;
    }

    public void updateY (int y) {
        this.y += y;
    }

    public void moveToQuadrant(int localY, int localX) throws Exception {

        if (this.x < localX*64) {
            while (this.x != localX*64) {
                turn(4);
                fire();
                move();
            }
        } else {
            while (this.x != localX*64) {
                turn(3);
                fire();
                move();
            }
        }

        if (this.y < localY*64) {
            while (this.y != localY*64) {
                turn(2);
                fire();
                move();
            }
        } else {
            while (this.y != localY*64) {
                turn(1);
                fire();
                move();
            }
        }
    }

    public void moveRandom () throws Exception {
        Random r = new Random();
        int i;
        while (true) {
            i = r.nextInt(5);
            if (i > 0) {
                turn(i);
                move();
            }
        }
    }
}

