package dp.behavioral.mediator;

import java.util.Date;

/**
 * Similar to the Adapter pattern, but with a different goal. The Mediator pattern acts as a bridge and, as the name implies,
 * the mediator between different objects which communicate in any way. In large-scale applications, direct communication
 * means tight-coupling which makes it hard to test, maintain and scale.
 * <p>
 * The Mediator pattern addresses this issue by acting as a third party over which the communication is done,
 * decoupling them in the process.
 */
class Chat {
    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + "[" + user.getName() + "]: " + message);
    }
}

class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        Chat.showMessage(this, message);
    }
}

public class MediatorPattern {


    public static void main(String[] args) {
        User david = new User("David");
        User scott = new User("Scott");

        david.sendMessage("Hi Scott! How are you?");
        scott.sendMessage("I'm great! Thanks for asking. How are you?");
    }
}
/*
Sat Nov 06 18:57:42 IST 2021[David]: Hi Scott! How are you?
Sat Nov 06 18:57:42 IST 2021[Scott]: I'm great! Thanks for asking. How are you?
 */