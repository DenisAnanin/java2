package ru.gb.java2.lesson1;

public class App {
    public static void main(String[] args) {
        Humen humen = new Humen();
        Cat cat =new Cat();
        Robot robot =new Robot();

        Barrier barrier =new Barrier();
        Treadmill treadmill =new Treadmill();

        humen.jamp(barrier);
        humen.run(treadmill);

    }

}
