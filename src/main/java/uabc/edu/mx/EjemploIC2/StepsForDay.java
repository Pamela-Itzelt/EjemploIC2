package uabc.edu.mx.EjemploIC2;

public class StepsForDay {

    private int steps;
    protected int goal;

    public StepsForDay(int goal) {
        this.goal = goal;
        this.steps = 0;
    }

    public void inputSteps(int steps) {
        this.steps = steps;
    }

    public void addSteps(int steps) {
        this.steps += steps;
    }

    public void clearSteps(){
        this.steps = 0;
    }

    public int get() { return steps; }

    public boolean metGoal(){
        return steps >= goal;
    }

}
