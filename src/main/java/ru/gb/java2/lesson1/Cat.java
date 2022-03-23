package ru.gb.java2.lesson1;

public class Cat implements Run, Jamp{
    private int distance;
    private int up;

    public Cat() {
        this.distance = 100;
        this.up = 2;
    }

    public int getDistance() {
        return this.distance;
    }

    public int getUp() {
        return this.up;
    }
    @Override
    public void run(Treadmill t) {
        if (t.getDistance() < this.distance) {
            System.out.println("Кот пробежал " + t.getDistance() + " метров.");
        } else {
            System.out.println("Кот не смог пробежать " + t.getDistance() + " метров.");
        }
    }

    @Override
    public void jamp(Barrier b) {
        if (b.getHeight() < this.up) {
            System.out.println("Кот прыгнул на " + b.getHeight() + " метров");
        } else {
            System.out.println("Кот не смог прыгнуть на " + b.getHeight() + " метров");
        }
    }
}
