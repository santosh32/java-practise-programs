package dp.structural.decorator.ex2;

/**
 * The Decorator pattern is used to alter an individual instance of a class at runtime, by creating a decorator class
 * which wraps the original class.
 * <p>
 * This way, changing or adding functionalities of the decorator object won't affect the structure or the functionalities
 * of the original object.
 * <p>
 * It differs from classic inheritance in the fact that it's done at runtime, and applies only to an
 * individual instance, whereas inheritance will affect all instances, and is done at compile time.
 */
public class DecoratorPattern {
    interface Computer {
        void assemble();
    }

    static class BasicComputer implements Computer {
        @Override
        public void assemble() {
            System.out.print("Assembling a basic computer.");
        }
    }

    static abstract class ComputerDecorator implements Computer {
        protected Computer computer;

        public ComputerDecorator(Computer computer) {
            this.computer = computer;
        }

        @Override
        public void assemble() {
            this.computer.assemble();
        }
    }

    static class GamingComputer extends ComputerDecorator {
        public GamingComputer(Computer computer) {
            super(computer);
        }

        @Override
        public void assemble() {
            super.assemble();
            System.out.print(" Adding characteristics of a gaming computer! ");
        }
    }

    static class WorkComputer extends ComputerDecorator {
        public WorkComputer(Computer computer) {
            super(computer);
        }

        @Override
        public void assemble() {
            super.assemble();
            System.out.print(" Adding characteristics of a work computer! ");
        }
    }

    public static void main(String[] args) {

        Computer gamingComputer = new GamingComputer(new BasicComputer());
        gamingComputer.assemble();
        System.out.println("\n");

        Computer workComputer = new WorkComputer(new GamingComputer(new
                BasicComputer()));
        workComputer.assemble();

    }
}
