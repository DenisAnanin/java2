package ru.gb.java2.lesson1;

public class Humen implements Runner {
    private int distance;
    private int up;
    private boolean run = true;
    public Humen(int distance, int up) {
        this.distance = distance;
        this.up = up;
    }

    public int getDistance() {
        return this.distance;
    }

    public int getUp() {
        return this.up;
    }

    @Override
    public boolean isRun() {
        return run;
    }

    @Override
    public void run(Track t) {
        if (t.getDistance() <= this.distance) {
            System.out.println("Человек пробежал " + t.getDistance());
        } else {
            System.out.println("Человек не смог пробежать " + t.getDistance() + " и выбыл.");
            run = false;
        }
    }

    @Override
    public void jump(Barrier b) {
        if (b.getHeight() <= this.up) {
            System.out.println("Человек прыгнул на " + b.getHeight());
        } else {
            System.out.println("Человек не смог прыгнуть на " + b.getHeight() + " и выбыл.");
            run=false;
        }
    }
}
