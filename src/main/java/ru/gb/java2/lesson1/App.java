package ru.gb.java2.lesson1;

public class App {
    public static Runner[] runners = new Runner[3];
    public static Obstacle[] obstacles = new Obstacle[2];

    public static void main(String[] args) {

        runners[0] = new Humen();
        runners[1] = new Cat();
        runners[2] = new Robot();

        obstacles[0] = new Treadmill(100);
        obstacles[1] = new Barrier(1);

        runAndJamp(runners, obstacles);
//        humen.jamp(barrier);
//        humen.run(treadmill);

    }

    public static void runAndJamp(Runner[] runners, Obstacle[] obstacles) {
        for (Runner r : runners) {
            for (Obstacle o : obstacles) {
                o.overcome(r);
            }
        }
    }

}
