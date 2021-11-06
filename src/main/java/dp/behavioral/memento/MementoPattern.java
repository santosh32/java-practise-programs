package dp.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * The Memento pattern is concerned with previous states of the object. This means that the pattern is used when
 * we want to save some state of an object, in the case we might want to restore the object to that state later on.
 */
class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}

class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento) {
        state = memento.getState();
    }
}

class CareTaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento memento) {
        mementoList.add(memento);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}

public class MementoPattern {


    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("State 1 at " + System.currentTimeMillis());
        originator.setState("State 2 at " + System.currentTimeMillis());
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State 3 at " + System.currentTimeMillis());
        careTaker.add(originator.saveStateToMemento());

        System.out.println("Current state: " + originator.getState());

        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved state: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved state: " + originator.getState());
    }
}
/*
Current state: State 3 at 1636205317370
First saved state: State 2 at 1636205317369
Second saved state: State 3 at 1636205317370
 */