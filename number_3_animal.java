class Main {  
	public static void main(String args[]) { 
		// Animal animals = new Animal(true, false);
		// System.out.println(animals.getGreeting()); 

		Cat obj_cat = new Cat();
		System.out.println(obj_cat.getGreeting()); 
			
	} 
}

class Animal {  
	protected String type = "Animals";
	protected boolean isMammal;
	protected boolean isCarnivorous;

	// constructor class
	public Animal(boolean mammal, boolean carnivorous) {
		isMammal = mammal;
		isCarnivorous = carnivorous;
	}

	public boolean getIsMammal() {
		return isMammal;
	}

	public boolean getIsCarnivorous() {
		return isCarnivorous;
	}

	public String getGreeting() {
		String mammal;
		if(isMammal) {
			mammal = "mammals";
		} else {
			mammal = "not mammals";
		}

		String carnivore;
		if(isCarnivorous) {
			carnivore = "carnivorees";
		} else {
			carnivore = "not carnivores";
		}
		return " are " + mammal + " and " + carnivore;
	}
}

class Cat extends Animal {

	String type = "Cats";

	public Cat() {
		super(true, true);
	}

	public String getGreeting() {
		return type + super.getGreeting();
	}
}

class Cow extends Animal {

	String type = "Cows";

	public Cow() {
		super(true, false);
	}

	public String getGreeting() {
		return type + super.getGreeting();
	}
}

class Duck extends Animal {

	String type = "Ducks";

	public Duck() {
		super(false, false);
	}

	public String getGreeting() {
		return type + super.getGreeting();
	}
}