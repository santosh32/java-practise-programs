package core.java8.functionalinterfaces;

//@FunctionalInterface
interface FunInterF1 {
    void say(String msg);
}

//@FunctionalInterface
interface FunInterF2 extends FunInterF1 {
    void say(StringBuilder msg);
}

public class FunctionalInterfaceExample implements FunInterF1 {

    public void say(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        FunInterF1 fie = new FunctionalInterfaceExample();
        fie.say("Hello there");
    }
}  