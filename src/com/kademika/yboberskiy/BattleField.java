package com.kademika.yboberskiy;

/**
 * Created by YB on 11.06.2015.
 */

import java.util.Random;

public class BattleField {
    private final int BF_WIDTH = 592;
    private final int BF_HEIGHT = 592;

    private String[][] battleField = {
            { " ", "B", " ", "B", "B", " ", "B", " ", "B"},
            { "B", "B", " ", " ", " ", " ", "B", " ", "B" },
            { " ", "B", " ", " ", " ", "B", " ", " ", "B" },
            { "B", "B", "B", "B", " ", " ", "B", "B", "B" },
            { " ", " ", "B", "B", "B", " ", " ", " ", " " },
            { "B", " ", " ", " ", "B", "B", "B", " ", " " },
            { "B", " ", "B", "B", " ", " ", "B", "B", " " },
            { " ", " ", " ", " ", "B", "B", " ", " ", " " },
            { "B", " ", " ", "B", "B", " ", " ", " ", "B" }, };

    public BattleField () {
    }

    public BattleField (String [][] battleField) {
        this.battleField = battleField;
    }

    public String scanQuadrant (int v, int h) {
        return battleField [v][h];
    }

    public String getAgressorLocation () {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(3);
        String [] randomAgressorLocations = {"64_64", "256_256", "512_512"};
        return (randomAgressorLocations[randomInt]);
    }

    public void updateQuadrant (int v, int h, String object) {
        battleField [v][h] = object;
    }

    public int getDimensionX () {
        return battleField.length;
    }

    public int getDimensionY () {
        return battleField.length;
    }

    public int getBfWidth() {
        return BF_WIDTH;
    }

    public int getBfHeight() {
        return BF_HEIGHT;
    }
}
