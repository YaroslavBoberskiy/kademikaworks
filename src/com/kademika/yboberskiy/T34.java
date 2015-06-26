package com.kademika.yboberskiy;

import java.util.Random;

/**
 * Created by YB on 18.06.2015.
 */
public class T34 extends Tank {

    private int speed = 22;
    private String color;
    private int crew;
    private int maxSpeed;
    private int x;
    private int y;
    private Direction direction;
    private ActionField af;
    private BattleField bf;


    public T34 (ActionField af, BattleField bf, String color, int crew, int maxSpeed) {
        super(af, bf, 64, 0, Direction.RIGHT);
        this.color = color;
        this.crew = crew;
        this.maxSpeed = maxSpeed;
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

    public Direction getDirection() {
        return direction;
    }

    public void turn(Direction direction) throws  Exception {
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
            turn(Direction.RIGHT);
            if (bf.scanQuadrant(0, i).equals("B")) {
                fire();
            }
        }

        for (int i = 0; i < bf.getDimensionX(); i ++) {
            turn(Direction.DOWN);
            for (int j = 0; j < bf.getDimensionY(); j ++) {
                if (bf.scanQuadrant(j, i).equals("B")) {
                    fire();
                }
            }
            turn(Direction.RIGHT);
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
                turn(Direction.RIGHT);
                fire();
                move();
            }
        } else {
            while (this.x != localX*64) {
                turn(Direction.LEFT);
                fire();
                move();
            }
        }

        if (this.y < localY*64) {
            while (this.y != localY*64) {
                turn(Direction.DOWN);
                fire();
                move();
            }
        } else {
            while (this.y != localY*64) {
                turn(Direction.UP);
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
            if (i > 0 && i == 1) {
                turn(Direction.UP);
                move();
            } else if (i > 0 && i == 2) {
                turn(Direction.DOWN);
                move();
            } else if (i > 0 && i == 3) {
                turn(Direction.LEFT);
                move();
            } else {
                turn(Direction.RIGHT);
                move();
            }
        }
    }

    public void selfDestroy () {
        updateX (-100);
        updateY (-100);
        af.repaint();
    }

    public String getColor() {
        return color;
    }

    public int getCrew() {
        return crew;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
