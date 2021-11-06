package dp.creational.abstract_factory.ex2;

/**
 * The Abstract Factory design pattern builds upon the Factory Pattern and acts as the highest factory in the hierarchy. It represents the practice of creating a 'factory of factories'.
 * <p>
 * This pattern is responsible for creating all other factories as its sub-classes, exactly like how factories are responsible for creating all of their own sub-classes.
 */
public class AbstractPattern {

    interface Pet {
        void eat();
    }

    static class Dog implements Pet {
        @Override
        public void eat() {
            System.out.println("Dog is eating, woof!");
        }
    }

    static class Cat implements Pet {
        @Override
        public void eat() {
            System.out.println("Cat is eating, meow!");
        }
    }

    static class Rabbit implements Pet {
        @Override
        public void eat() {
            System.out.println("Rabbit is eating, squeak!");
        }
    }

    interface Human {
        void feedPet();
    }

    static class Child implements Human {
        @Override
        public void feedPet() {
            System.out.println("Child is feeding pet irresponsibly.");
        }
    }

    static class Adult implements Human {
        @Override
        public void feedPet() {
            System.out.println("Adult is feeding pet responsibly.");
        }
    }

    static class Elder implements Human {
        @Override
        public void feedPet() {
            System.out.println("Elder is overfeeding the pet.");
        }
    }

    static abstract class AbstractFactory {
        public abstract Pet getPet(String pet);

        public abstract Human getHuman(String human);
    }

    static class HumanFactory extends AbstractFactory {

        @Override
        public Human getHuman(String human) {
            if (human.equals(null)) return null;

            if (human.equalsIgnoreCase("chILd")) {
                return new Child();
            } else if (human.equalsIgnoreCase("adult")) {
                return new Adult();
            } else if (human.equalsIgnoreCase("elDeR")) {
                return new Elder();
            }
            return null;
        }

        @Override
        public Pet getPet(String pet) {
            // don't implement
            return null;
        }
    }

    static class PetFactory extends AbstractFactory {

        @Override
        public Pet getPet(String pet) {
            if (pet.equals(null)) return null;

            if (pet.equalsIgnoreCase("Dog")) {
                return new Dog();
            } else if (pet.equalsIgnoreCase("Cat")) {
                return new Cat();
            } else if (pet.equalsIgnoreCase("Rabbit")) {
                return new Rabbit();
            }
            return null;
        }

        @Override
        public Human getHuman(String human) {
            //don't implement
            return null;
        }
    }

    static class FactoryProducer {
        public static AbstractFactory getFactory(String factory) {
            if (factory.equalsIgnoreCase("Human")) {
                return new AbstractPattern.HumanFactory();
            } else if (factory.equalsIgnoreCase("Pet")) {
                return new AbstractPattern.PetFactory();
            }
            return null;
        }
    }

    public static void main(String[] args) {
        AbstractFactory humanFactory = FactoryProducer.getFactory("Human");
        AbstractFactory petFactory = FactoryProducer.getFactory("Pet");

        Human human = humanFactory.getHuman("Child");
        human.feedPet();

        Pet pet = petFactory.getPet("Dog");
        pet.eat();

        Human human2 = humanFactory.getHuman("Elder");
        human2.feedPet();

        Pet pet2 = petFactory.getPet("Rabbit");
        pet2.eat();

    }
}
/*
Child is feeding pet irresponsibly.
Dog is eating, woof!
Elder is overfeeding the pet.
Rabbit is eating, squeak!
 */