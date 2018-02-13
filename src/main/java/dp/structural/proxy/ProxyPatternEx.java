package dp.structural.proxy;

abstract class Subject {
	public abstract void doSomeWork();
}

class ConcreteSubject extends Subject {
	@Override
	public void doSomeWork() {
		System.out.println(" I am from concrete subject");
	}
}

class ProxySubject extends Subject {

	ConcreteSubject cs;

	@Override
	public void doSomeWork() {
		System.out.println("ProxyPatternEx call happening now");
		// Lazy initialization
		if (cs == null) {
			cs = new ConcreteSubject();
		}
		cs.doSomeWork();
	}
}

public class ProxyPatternEx {
	public static void main(String[] args) {
		System.out.println("***ProxyPatternEx Pattern Demo***\n");
		ProxySubject px = new ProxySubject();
		px.doSomeWork();
	}
}