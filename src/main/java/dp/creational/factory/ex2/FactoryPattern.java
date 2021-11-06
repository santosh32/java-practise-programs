package dp.creational.factory.ex2;

/**
 * The Factory Method, also often called the Factory Pattern is a widely used design pattern that commands object creation.
 * <p>
 * In this pattern, a Factory class is created as the parent class of all sub-classes belonging to a certain logical segment of related classes.
 * <p>
 * Just like a 'SessionFactory' is used to create, update, delete and manipulate all 'Session' objects, so is any other factory responsible for their set of child classes.
 * <p>
 * It's important to note that the sub-classes can't be reached without using their respective factory. This way, their creation is both hidden from the client and is dependent on the factory.
 */
public class FactoryPattern {

    interface Animal {
        void eat();
    }

    static class Dog implements Animal {
        @Override
        public void eat() {
            System.out.println("Dog is eating, woof!");
        }
    }

    static class Cat implements Animal {
        @Override
        public void eat() {
            System.out.println("Cat is eating, meow!");
        }
    }

    static class Rabbit implements Animal {
        @Override
        public void eat() {
            System.out.println("Rabbit is eating, squeak!");
        }
    }

    static class AnimalFactory {

        public Animal getAnimal(String animal) {
            if (animal.equals(null)) return null;

            if (animal.equalsIgnoreCase("Dog")) {
                return new Dog();
            } else if (animal.equalsIgnoreCase("Cat")) {
                return new Cat();
            } else if (animal.equalsIgnoreCase("Rabbit")) {
                return new Rabbit();
            }
            return null;
        }
    }

    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();

        Animal animal = animalFactory.getAnimal("dOg");
        animal.eat();

        Animal animal2 = animalFactory.getAnimal("CAT");
        animal2.eat();

        Animal animal3 = animalFactory.getAnimal("raBbIt");
        animal3.eat();
    }
}
/*
Dog is eating, woof!
Cat is eating, meow!
Rabbit is eating, squeak!
 */