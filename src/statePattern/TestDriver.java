package statePattern;

public class TestDriver {
    public static void main(String arg[]) {
        Context c1 = new Context();
        c1.setState(new StartState());
        c1.execute();
        c1.setState(new StopState());
        c1.execute();
    }
}
