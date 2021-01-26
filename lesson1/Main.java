package lesson1;

public class Main {

    public static void main(String[] args) {
        //----------------Задание 1-------------------------------------------------------------------------------------
        System.out.println("----------------Задание 1--------------");
        Human human = new Human("Bob", 15, 1.5);
        Cat cat = new Cat("Tom", 20, 2.0);
        Robot robot = new Robot("Vally", 5, 0.3);
        human.run();
        human.jump();
        cat.run();
        cat.jump();
        robot.run();
        robot.jump();

        //----------------Задание 2-------------------------------------------------------------------------------------
        System.out.println("----------------Задание 2--------------");
        TreadMill treadMill = new TreadMill(10);
        Wall wall = new Wall(1.6);
        treadMill.runningOnTreadmill(human);
        treadMill.runningOnTreadmill(cat);
        treadMill.runningOnTreadmill(robot);
        wall.jumpOverTheWall(human);
        wall.jumpOverTheWall(cat);
        wall.jumpOverTheWall(robot);

        //----------------Задание 3 и 4*--------------------------------------------------------------------------------
        System.out.println("----------------Задание 3 и 4*-----------\n" +
                "Всё бы было проще, если классы участников были наследниками общего класса");
        Object[] athletes = {human, cat, robot};
        Object[] obstacles = {treadMill, wall};
        for (int i = 0; i < athletes.length; i++) {
            if (athletes[i].equals(human)) {
                for (int j = 0; j < obstacles.length; j++) {
                    if (obstacles[j].equals(treadMill)) {
                        if (!treadMill.runningOnTreadmill(human)) break;
                    } else if (obstacles[j].equals(wall)) {
                        if (!wall.jumpOverTheWall(human)) break;
                    }
                }
            } else if (athletes[i].equals(cat)) {
                for (int j = 0; j < obstacles.length; j++) {
                    if (obstacles[j].equals(treadMill)) {
                        if (!treadMill.runningOnTreadmill(cat)) break;
                    } else if (obstacles[j].equals(wall)) {
                        if (!wall.jumpOverTheWall(cat)) break;
                    }
                }
            } else if (athletes[i].equals(robot)) {
                for (int j = 0; j < obstacles.length; j++) {
                    if (obstacles[j].equals(treadMill)) {
                        if (!treadMill.runningOnTreadmill(robot)) break;
                    } else if (obstacles[j].equals(robot)) {
                        if (!wall.jumpOverTheWall(human)) break;
                    }
                }
            }
        }
    }
}
