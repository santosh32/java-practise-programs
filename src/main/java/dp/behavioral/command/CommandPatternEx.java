package dp.behavioral.command;

interface ICommand {
    void execute();
}

class UndoCommand implements ICommand {
    private Receiver receiver;

    UndoCommand(Receiver recv) {
        receiver = recv;
    }

    @Override
    public void execute() {
        // Call undo in receiver
        receiver.performUndo();
    }
}

class RedoCommand implements ICommand {
    private Receiver receiver;

    RedoCommand(Receiver recv) {
        receiver = recv;
    }

    @Override
    public void execute() {
        // Call redo in receiver
        receiver.performRedo();
    }
}

// Receiver Class
class Receiver {
    public void performUndo() {
        System.out.println("Executing -MyUndoCommand");
    }

    public void performRedo() {
        System.out.println("Executing -MyRedoCommand");
    }
}

// Invoker Class
class Invoke {
    ICommand cmd;

    public void executeCommand(ICommand cmd) {
        this.cmd = cmd;
        cmd.execute();
    }
}

// Client Class
public class CommandPatternEx {
    public static void main(String[] args) {
        System.out.println("***Command Pattern Demo***\n");
        Receiver intendedreceiver = new Receiver();
        /* Client holds Invoker and Command Objects */
        Invoke inv = new Invoke();
        UndoCommand unCmd = new UndoCommand(intendedreceiver);
        RedoCommand reCmd = new RedoCommand(intendedreceiver);
        inv.executeCommand(unCmd);
        inv.executeCommand(reCmd);
    }
}
/*
***Command Pattern Demo***

Executing -MyUndoCommand
Executing -MyRedoCommand
 */