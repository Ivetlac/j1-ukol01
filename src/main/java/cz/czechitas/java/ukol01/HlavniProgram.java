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
        posunNaSlnko();
        vytvorSlnko();
        zofka.turnLeft(173);
        zofka.move(220);
        zofka.turnLeft(90);
        domceky();
        zofka.penUp();
        zofka.turnLeft(45);
        zofka.move(150);
        zofka.turnRight(90);
        zofka.move(40);
    zofka.turnLeft(180);
        nakresiI();
        nakresliV();
        nakresliE();
        nakresliT();
    }

    private void posunNaSlnko() {
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(450);
        zofka.turnLeft(90);
        zofka.move(250);
        zofka.turnRight(90);
    }

    private void nakresiI() {
        zofka.penDown();
        zofka.setPenColor(Color.pink);
        zofka.move(30);
        zofka.turnRight(90);
        zofka.penUp();
        zofka.move(10);
    }

    private void nakresliV() {
        zofka.setPenColor(Color.lightGray);
        zofka.penDown();
        zofka.turnRight(55);
        zofka.move(35);
        zofka.turnLeft(110);
        zofka.move(35);
        zofka.turnRight(55);
        zofka.penUp();
        zofka.move(10);
    }

    private void nakresliE() {
        zofka.setPenColor(Color.black);
        zofka.penDown();

        for (int i = 0; i < 2; i++) {
            zofka.move(10);
            zofka.turnRight(180);
            zofka.move(10);
            zofka.turnLeft(90);
            zofka.move(15);
            zofka.turnLeft(90);
        }

        zofka.move(10);
        zofka.turnRight(180);
        zofka.move(10);
        zofka.turnLeft(180);
        zofka.penUp();
        zofka.move(35);
        zofka.turnLeft(90);
    }

    private void nakresliT() {
        zofka.penDown();
        zofka.setPenColor(Color.magenta);
        zofka.move(30);
        zofka.turnRight(90);
        zofka.move(10);
        zofka.turnRight(180);
        zofka.move(20);
        zofka.penUp();
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
        zofka.setPenColor(Color.cyan);
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