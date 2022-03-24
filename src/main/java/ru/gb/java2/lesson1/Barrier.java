package ru.gb.java2.lesson1;

public class Barrier implements Obstacle{
    private int height;

    public Barrier(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public void overcome(Runner runner) {
        runner.jamp(this);
    }
}
