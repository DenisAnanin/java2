package ru.gb.java2.lesson1;

public class App {
    public static Humen[] humen = new Humen[2];
    public static void main(String[] args) {

        Cat cat =new Cat();
        Robot robot =new Robot();

        Barrier barrier =new Barrier();
        Treadmill treadmill =new Treadmill();
        makeSportsmen(humen);
        runAndJamp(humen,barrier,treadmill);
//        humen.jamp(barrier);
//        humen.run(treadmill);

    }
    public static void makeSportsmen(Humen[] humen) {
        for (int i = 0; i < humen.length; i++) {
            humen[i] = new Humen();
        }
    }
    public static void runAndJamp(Humen[] humen, Barrier b, Treadmill t) {
        for (Humen h : humen) {
            h.jamp (b);
            h.run(t);
        }
    }

}
