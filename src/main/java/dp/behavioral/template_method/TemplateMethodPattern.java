package dp.behavioral.template_method;

/**
 * The Template Method, otherwise known as Template Pattern is all around us. It boils down to defining an
 * abstract class that provides predefined ways to run its methods. Sub-classes that inherit these methods must
 * also follow the way defined in the abstract class.
 * <p>
 * In some cases, the abstract class may already include a method implementation, not just instructions,
 * if it's a functionality that will be shared amongst all or most of the sub-classes.
 */
public class TemplateMethodPattern {

    static abstract class HouseTemplate {

        // template method, final so subclasses can't override
        public final void buildHouse() {
            buildFoundation();
            buildPillars();
            buildWalls();
            buildWindows();
            System.out.println("House is built.");
        }

        // default implementation
        private void buildWindows() {
            System.out.println("Building Glass Windows");
        }

        // methods to be implemented by subclasses
        public abstract void buildWalls();

        public abstract void buildPillars();

        private void buildFoundation() {
            System.out.println("Building foundation with cement,iron rods and sand");
        }
    }

    static class GlassHouse extends HouseTemplate {

        @Override
        public void buildWalls() {
            System.out.println("Building Glass Walls");
        }

        @Override
        public void buildPillars() {
            System.out.println("Building Pillars with glass coating");
        }
    }

    static class WoodenHouse extends HouseTemplate {

        @Override
        public void buildWalls() {
            System.out.println("Building Wooden Walls");
        }

        @Override
        public void buildPillars() {
            System.out.println("Building Pillars with Wood coating");
        }
    }

    public static void main(String[] args) {

        HouseTemplate houseType = new WoodenHouse();

        // using template method
        houseType.buildHouse();
        System.out.println("************");

        houseType = new GlassHouse();

        houseType.buildHouse();
    }

}
/*Building foundation with cement,iron rods and sand
Building Pillars with Wood coating
Building Wooden Walls
Building Glass Windows
House is built.
************
Building foundation with cement,iron rods and sand
Building Pillars with glass coating
Building Glass Walls
Building Glass Windows
House is built.
 
 * */

