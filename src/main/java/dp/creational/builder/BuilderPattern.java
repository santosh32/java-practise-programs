package dp.creational.builder;

/**
 * The Builder pattern is used to help build final objects, for classes with a huge amount of fields or parameters
 * in a step-by-step manner. It's not very useful in small, simple classes that don't have many fields, but complex objects are
 * both hard to read and maintain by themselves.
 * <p>
 * Initializing an object with more than a few fields using a constructor is messy and susceptible to human error.
 */
public class BuilderPattern {

    public static void main(String[] args) {
        // Using builder to get the object in a single line of code and
        // without any inconsistent state or arguments management issues
        Computer computer = new Computer.ComputerBuilder("500 GB", "2 GB")
                .setBluetoothEnabled(true).setGraphicsCardEnabled(true).build();

        System.out.println(computer);
    }
}