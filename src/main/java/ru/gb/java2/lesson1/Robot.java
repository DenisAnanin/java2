package ru.gb.java2.lesson1;

public class Robot implements Runner {
    private int distance;
    private int up;

    public Robot() {
        this.distance = 1000;
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
        if (t.getDistance() <= this.distance) {
            System.out.println("Робот пробежал " + t.getDistance() + " метров.");
        } else {
            System.out.println("Робот не смог пробежать " + t.getDistance() + " метров.");
        }
    }

    @Override
    public void jamp(Barrier b) {
        if (b.getHeight() <= this.up) {
            System.out.println("Робот прыгнул на " + b.getHeight() + " метров");
        } else {
            System.out.println("Робот не смог прыгнуть на " + b.getHeight() + " метров");
        }
    }
}
