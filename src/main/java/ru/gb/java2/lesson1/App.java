package ru.gb.java2.lesson1;

public class App {
    private static Runner[] runners = new Runner[3];
    private static Obstacle[] obstacles = new Obstacle[6];

    public static void main(String[] args) {

        runners[0] = new Humen(100,1);
        runners[1] = new Cat(100,2);
        runners[2] = new Robot(50,5);

        obstacles[0] = new Track(100);
        obstacles[1] = new Barrier(1);
        obstacles[2] = new Track(100);
        obstacles[3] = new Barrier(2);
        obstacles[4] = new Track(100);
        obstacles[5] = new Barrier(1);
        runAndJamp(runners, obstacles);


    }
// порядок поочередного прохождения препятствий участниками
    public static void runAndJamp(Runner[] runners, Obstacle[] obstacles) {
        for (Obstacle o : obstacles){
            for (Runner r : runners) {
                o.overcome(r);
            }
        }
    }

}
