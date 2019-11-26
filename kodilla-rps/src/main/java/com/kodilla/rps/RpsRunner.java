package com.kodilla.rps;

public class RpsRunner {

    public static void main(String[] args) {

        GameLoop gameLoop = new GameLoop();
        MoveGenerator moveGenerator = new MoveGenerator();


    gameLoop.gameRun();
    }

}

