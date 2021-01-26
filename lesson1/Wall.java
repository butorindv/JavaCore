package lesson1;

public class Wall {
    private double height;


    public Wall(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public boolean jumpOverTheWall(Human human) {
        String res = "";
        if (this.height <= human.getHeightJump()) {
            res = human.getName() + " перепрыгнул.";
            System.out.println(res);
            return true;
        } else {
            res += human.getName() + " не перепрыгнул.";
            System.out.println(res);
            return false;
        }

    }

    public boolean jumpOverTheWall(Cat cat) {
        String res = "";
        if (this.height <= cat.getHeightJump()) {
            res = cat.getName() + " перепрыгнул.";
            System.out.println(res);
            return true;
        } else {
            res += cat.getName() + " не перепрыгнул.";
            System.out.println(res);
            return false;
        }
    }

    public boolean jumpOverTheWall(Robot robot) {
        String res = "";
        if (this.height <= robot.getHeightJump()) {
            res = robot.getName() + " перепрыгнул.";
            System.out.println(res);
            return true;
        } else {
            res += robot.getName() + " не перепрыгнул.";
            System.out.println(res);
            return false;
        }
    }
}
