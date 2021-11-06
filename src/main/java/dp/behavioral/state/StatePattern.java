package dp.behavioral.state;

/**
 * The State pattern is used when a specific object needs to change its behavior, based on its state.
 * This is accomplished by providing each of these objects with one or more state objects.
 * <p>
 * Based on these state objects, we can completely change the behavior of the concerned object.
 */

interface State {
    void doAction(Context context);
}

class Context {
    private State state;

    public Context() {
        state = null;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}

class ApplicationStart implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("The application is in the starting state of development.");
        context.setState(this);
    }

    public String toString() {
        return "Starting state.";
    }
}

class ApplicationFinish implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("The application is in the finished state of development.");
        context.setState(this);
    }

    public String toString() {
        return "Finished state.";
    }
}

public class StatePattern {

    public static void main(String[] args) {

        Context context = new Context();

        ApplicationStart start = new ApplicationStart();
        start.doAction(context);

        System.out.println(context.getState());

        ApplicationFinish finish = new ApplicationFinish();
        finish.doAction(context);

        System.out.println(context.getState());
    }
}
/*
The application is in the starting state of development.
Starting state.
The application is in the finished state of development.
Finished state.
 */