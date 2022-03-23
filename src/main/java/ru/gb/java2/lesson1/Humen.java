package ru.gb.java2.lesson1;

public class Humen implements Run, Jamp {
    private int distance;
    private int up;

    public Humen() {
        this.distance = 500;
        this.up = 1;
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
            System.out.println("Человек пробежал " + t.getDistance() + " метров.");
        } else {
            System.out.println("Человек не смог пробежать " + t.getDistance() + " метров.");
        }
    }

    @Override
    public void jamp(Barrier b) {
        if (b.getHeight() < this.up) {
            System.out.println("Человек прыгнул на " + b.getHeight() + " метров");
        } else {
            System.out.println("Человек не смог прыгнуть на " + b.getHeight() + " метров");
        }
    }
}
