package lesson1;

public class TreadMill {

    private int speed;


    public TreadMill(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }


    public boolean runningOnTreadmill(Human human) {
        String res = "";
        if (this.speed <= human.getSpeedRun()) {
            res = human.getName() + " пробежал.";
            System.out.println(res);
            return true;
        } else {
            res += human.getName() + " не пробежал.";
            System.out.println(res);
            return false;

        }

    }

    public boolean runningOnTreadmill(Cat cat) {
        String res = "";
        if (this.speed <= cat.getSpeedRun()) {
            res = cat.getName() + " пробежал.";
            System.out.println(res);
            return true;
        } else {
            res += cat.getName() + " не пробежал.";
            System.out.println(res);
            return false;

        }

    }

    public boolean runningOnTreadmill(Robot robot) {
        String res = "";
        if (this.speed <= robot.getSpeedRun()) {
            res = robot.getName() + " пробежал.";
            System.out.println(res);
            return true;
        } else {
            res += robot.getName() + " не пробежал.";
            System.out.println(res);
            return false;

        }

    }


}
