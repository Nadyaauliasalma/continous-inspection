import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		Counter counter2 = new Counter(); // unused variable
		int x = 0; // unused variable
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.increment();
		counter.increment();
		counter.increment();
		counter.increment();
		counter.increment(); // duplikat berulang, tidak pakai loop
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.decrement();
		
		System.out.println("Current count:" + counter.getCount());
		
		// dead code
		if (false) {
			System.out.println("ini tidak akan pernah dieksekusi");
		}
		
	}

}
