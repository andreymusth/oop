package creational.singleton;

public class ProgramLogger {


    private static ProgramLogger instance;
    private String log = "This is logger\n";


    private ProgramLogger() {
    }

    public static synchronized ProgramLogger getInstance() {

        if (instance == null) {
            instance = new ProgramLogger();
        }

        return instance;
    }

    public void add(String log) {
        this.log += log + "\n";
    }

    public void show() {
        System.out.println(log);
    }

}
