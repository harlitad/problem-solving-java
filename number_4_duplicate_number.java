class Main {  
	public static void main(String args[]) { 
		System.out.println("Hello, world!"); 
		checkNumbers(new int[]{ 1,2,3,4,5,6,7,8,9,10,9});
	} 

	public static void checkNumbers(int[] numbers) {
		int number;
		int step = 1;
		int result = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			number = numbers[i];
			for(int k = step; k < numbers.length; k++) {
				if(number == numbers[k]){
					result = number;
					break;
				}
			}
			step++;
		}
		System.out.println(result); 
	}

}