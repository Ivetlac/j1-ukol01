package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.Turtle;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka;

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void start() {
        zofka = new Turtle();
//        zofka.setPenColor(Color.pink);
//        zofka.penUp();
//        zofka.turnRight(180);
//        zofka.move(50);
//        zofka.turnRight(180);
//        zofka.penDown();
//        nakresliPrasatko();
//        zofka.penUp();
//        zofka.turnLeft(90);
//        zofka.move(250);
//        zofka.turnLeft(90);
//        zofka.move(100);
//        zofka.turnRight(90);
        vytvorSlnko();

    }

    private void vytvorSlnko() {
        zofka.penDown();
        zofka.setPenColor(Color.yellow);

        int iteracia = 50;

        for (int i = 0; i <= iteracia; i++) {
            zofka.move(9);
            if (i % 4 == 0) {
                zofka.turnRight(90);
                zofka.move(20);
                zofka.turnRight(180);
                zofka.move(20);
                zofka.turnRight(90);
            }
            zofka.turnLeft((double) 360 / iteracia);
        }
        zofka.penUp();

    }


    private void nakresliPrasatko() {
        nakresliTelo();
        zofka.turnLeft(210);
        nakresliHlavu();
        nakresliNohy();
        zofka.move(150);
        zofka.turnLeft(90);
        nakresliNohy();

    }

    private void nakresliTelo() {
        for (int i = 0; i < 5; i++) {
            zofka.move(150);
            zofka.turnRight(90);
        }
    }

    private void nakresliHlavu() {
        for (int i = 0; i < 2; i++) {
            zofka.move(150);
            zofka.turnLeft(120);
        }
    }

    private void nakresliNohy() {
        zofka.turnRight(135);
        zofka.penDown();
        zofka.move(50.0);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move((double) 100 / 2);
        zofka.turnLeft(90);
        zofka.penDown();
        zofka.move((double) 100 / 2);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move((double) 100 / 2);
        zofka.turnRight(45);
    }
}