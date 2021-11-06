package dp.behavioral.strategy;


interface Strategy {
    String build(String location);
}

class Skyscraper implements Strategy {

    @Override
    public String build(String location) {
        return "Building a skyscraper in the " + location + " area.";
    }
}

class House implements Strategy {

    @Override
    public String build(String location) {
        return "Building a house in the " + location + " area.";
    }
}

class Mall implements Strategy {

    @Override
    public String build(String location) {
        return "Building a mall in the " + location + " area.";
    }
}

class BuildContext {
    private Strategy strategy;

    public BuildContext(Strategy strategy) {
        this.strategy = strategy;
    }

    public String executeStrategy(String location) {
        return strategy.build(location);
    }
}

public class StrategyPattern {
    public static void main(String[] args) {
        BuildContext buildContext = new BuildContext(new Skyscraper());
        System.out.println("Requesting a skyscraper: " + buildContext.executeStrategy("Downtown"));

        buildContext = new BuildContext(new House());
        System.out.println("Requesting a house: " + buildContext.executeStrategy("Outskirts"));

        buildContext = new BuildContext(new Mall());
        System.out.println("Requesting a mall: " + buildContext.executeStrategy("City Centre"));
    }
}