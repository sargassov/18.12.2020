public abstract class Animal {
    protected int barrierRunDistance;
    protected int barrierSwimDistance;
    protected double barrireJumpDistance;
    protected String name;

    abstract void run(int distance);
    abstract void swim(int distance);
    abstract void jump(double height);

}
