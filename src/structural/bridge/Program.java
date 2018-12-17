package structural.bridge;

public abstract class Program {

    public Program(Developer developer) {
        this.developer = developer;
    }

    protected Developer developer;

    abstract void developProgram();
}
