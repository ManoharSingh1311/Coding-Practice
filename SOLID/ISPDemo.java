interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

interface Sleepable {
    void sleep();
}

class HumanWorker implements Workable, Eatable, Sleepable {

    public void work() {
        System.out.println("Human works");
    }

    public void eat() {
        System.out.println("Human eats");
    }

    public void sleep() {
        System.out.println("Human sleeps");
    }
}

class RobotWorker implements Workable {

    public void work() {
        System.out.println("Robot works");
    }
}

public class ISPDemo {

    public static void main(String[] args) {

        RobotWorker r = new RobotWorker();
        r.work();

        HumanWorker h = new HumanWorker();
        h.work();
        h.eat();
        h.sleep();
    }
}