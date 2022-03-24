package ru.gb.java2.lesson1;

public class Treadmill implements Obstacle{
    private int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public void overcome(Runner runner) {
        runner.run(this);
    }
}
