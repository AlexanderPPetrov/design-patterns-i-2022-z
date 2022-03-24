package composite;

public class CompositeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Manager man1 = new Manager("Stamat", 12000);
		Manager man2 = new Manager("Petar", 10000);
		Manager man3 = new Manager("Petkan", 11000);

		Developer dev1 = new Developer("Georgi", 7000);
		Developer dev2 = new Developer("Stoyan", 5000);
		Developer dev3 = new Developer("Gergana", 9000);

		man1.add(dev1);
		man1.add(man3);
		man1.add(man2);

		man2.add(dev2);
		
		man3.add(dev3);
		
		//man1.printData();
		
		man2.printData();
		
	}

}
