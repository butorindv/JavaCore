package lesson1;

public class Cat implements Skills{

    private String name;
    private int speedRun;
    private double heightJump;

    public Cat(String name, int speedRun, double heightJump) {
        this.name = name;
        this.speedRun = speedRun;
        this.heightJump = heightJump;
    }

    public String getName() {
        return name;
    }

    public int getSpeedRun() {
        return speedRun;
    }

    public double getHeightJump() {
        return heightJump;
    }

    @Override
    public void run() {
        System.out.println("Кот " + name+" может бежать со скоростью " + speedRun + " км/ч.");
    }

    @Override
    public void jump() {
        System.out.println("Кот " + name+" может прыгнуть на высоту " + heightJump + " метров.");
    }

}
