class Main {  
	public static void main(String args[]) { 
		System.out.println("Hello, world!"); 
		typeNumber(1);
		typeNumber(101);
		typeNumber(1010);
		typeNumber(10101);
		typeNumber(-1);
		
	} 

	public static void typeNumber(int number) {
		if(number <= 9 && number >= 1) {
			System.out.println("Satuan"); 
		} else if(number <= 99 && number >= 10) {
			System.out.println("Puluhan"); 
		} else if(number <= 999 && number >= 100) {
			System.out.println("Ratusan"); 
		} else if(number <= 9999 & number >= 1000) {
			System.out.println("Ribuah"); 
		} else if(number <= 99999 & number >= 10000) {
			System.out.println("Puluhribuah"); 
		} else {
			System.out.println("angka tidak dikenal"); 
		}
	}

}