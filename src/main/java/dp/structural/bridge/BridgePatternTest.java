package dp.structural.bridge;

public class BridgePatternTest {

	public static void main(String[] args) {
		Shape tri = new Triangle(new RedColor());
		tri.applyColor();

		Shape pent = new Pentagon(new GreenColor());
		pent.applyColor();
	}

}
/*
 
Triangle filled with color red.
Pentagon filled with color green.
*/