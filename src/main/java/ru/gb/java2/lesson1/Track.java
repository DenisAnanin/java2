package ru.gb.java2.lesson1;

public class Track implements Obstacle{
    private int distance;

    public Track(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public void overcome(Runner runner) {
        if (runner.isRun()) {
            runner.run(this);
        } else {
            return;
        }
    }
}
