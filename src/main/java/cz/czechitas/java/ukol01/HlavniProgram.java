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
        zofka.setPenColor(Color.pink);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(250);
        zofka.turnRight(180);
        zofka.penDown();
        nakresliPrasatko();
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(450);
        zofka.turnLeft(90);
        zofka.move(250);
        zofka.turnRight(90);
        vytvorSlnko();
        zofka.turnLeft(173);
        zofka.move(220);
        zofka.turnLeft(90);
        domceky();

    }

    private void domceky() {
        nakresliDomcek();
        for (int i = 0; i < 4; i++) {
            zofka.turnLeft(45);
            zofka.move(50);
            nakresliDomcek();
        }
        zofka.penUp();
        zofka.turnRight(45);
        zofka.move(250);
        zofka.turnLeft(90);
        zofka.penDown();
        nakresliDomcek();
        zofka.turnLeft(225);
        zofka.move(1400);
        zofka.turnLeft(180);
        nakresliDomcek();
    }

    private void vytvorSlnko() {
        zofka.penDown();
        zofka.setPenColor(Color.yellow);

        int iteracia = 50;

        for (int i = 0; i <= iteracia; i++) {
            zofka.move(7);
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
        zofka.move(50);
        zofka.turnLeft(90);
        nakresliNohy();

    }

    private void nakresliTelo() {
        for (int i = 0; i < 5; i++) {
            zofka.move(50);
            zofka.turnRight(90);
        }
    }

    private void nakresliHlavu() {
        for (int i = 0; i < 2; i++) {
            zofka.move(50);
            zofka.turnLeft(120);
        }
    }

    private void nakresliNohy() {
        zofka.turnRight(135);
        zofka.penDown();
        zofka.move(30);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(30);
        zofka.turnLeft(90);
        zofka.penDown();
        zofka.move(30);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(30);
        zofka.turnRight(45);
    }

    public void nakresliDomcek() {
        zofka.penDown();
        zofka.setPenColor(Color.CYAN);
        for (int i = 0; i < 4; i++) {
            zofka.penDown();
            zofka.move(150);
            zofka.turnRight(90);
        }
        zofka.turnLeft(45);
        zofka.move(Math.sqrt(2) * 75);
        zofka.turnRight(90);
        zofka.move(Math.sqrt(2) * 75);
        zofka.penUp();
    }
}