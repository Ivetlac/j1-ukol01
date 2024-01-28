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
        nakresliPrasatko();
        //TODO implementace domácího úkolu
    }

    private void nakresliPrasatko() {
        nakresliTelo(150);
        zofka.turnLeft(210);
        nakresliHlavu(150);
        nakresliNohy(100);
        zofka.move(150);
        zofka.turnLeft(90);
        nakresliNohy(100);

    }

    private void nakresliTelo(int strana) {
        for (int i = 0; i < 5; i++) {
            zofka.move(strana);
            zofka.turnRight(90);
        }
    }

    private void nakresliHlavu(int strana) {
        for (int i = 0; i < 2; i++) {
            zofka.move(strana);
            zofka.turnLeft(120);
        }
    }

    private void nakresliNohy(int dlzka) {
        zofka.turnRight(135);
        zofka.penDown();
        zofka.move(dlzka / 2);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(dlzka / 2);
        zofka.turnLeft(90);
        zofka.penDown();
        zofka.move(dlzka / 2);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(dlzka / 2);
        zofka.turnRight(45);
    }
}


