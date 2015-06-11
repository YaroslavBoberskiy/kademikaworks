package com.kademika.yboberskiy;

/**
 * Created by YB on 11.06.2015.
 */
public class Bullet {
    private int speed = 5;
    private int x = -100;
    private int y = -100;
    private int direction = 0;

    public Bullet (int x, int y, int direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int getSpeed() {
        return speed;
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

    public void updateX (int x) {
        this.x += x;
    }

    public void updateY (int y) {
        this.y += y;
    }

    public void destroy () {
        x = -100;
        y = -100;
    }
}
