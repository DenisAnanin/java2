package ru.gb.java2.lesson1;

public class Cat implements Runner {
    private int distance;
    private int up;
    private boolean run = true;
    public Cat(int distance, int up) {
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
    public void run(Track t) {
        if (t.getDistance() <= this.distance) {
            System.out.println("Кот пробежал " + t.getDistance());
        } else {
            System.out.println("Кот не смог пробежать " + t.getDistance() + " и выбыл.");
            run = false;
        }
    }

    @Override
    public void jump(Barrier b) {
        if (b.getHeight() <= this.up) {
            System.out.println("Кот прыгнул на " + b.getHeight());
        } else {
            System.out.println("Кот не смог прыгнуть на " + b.getHeight() + " и выбыл.");
            run = false;
        }
    }

    @Override
    public boolean isRun() {
        return run;
    }
}
