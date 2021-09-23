class Main {  
  public static void main(String args[]) { 
	  System.out.println("\n ***Check Palindrome*** \n");
      String sentence1= "Eva, Can I Stab Bats In A Cave?";
      String sentence2= "Blibli.com, big choices, big deals";
      isPalindrome(sentence1);
	  isPalindrome(sentence2);
  } 

	public static String removeNonAlphanumeric(String sentence) {
        return sentence.replaceAll("[^a-zA-Z0-9]", "");
    }
    
    public static void isPalindrome(String sentence) {
        String filtered_string = removeNonAlphanumeric(sentence).toLowerCase();
		String[] list_char = filtered_string.split("");
		StringBuilder reverse_string = new StringBuilder();
			
		for (int i = list_char.length - 1; i >= 0; i--) {
		reverse_string.append(list_char[i]);
		reverse_string.append("");
	    }

		String output = reverse_string.toString().trim();

		if(output.equals(filtered_string)) {
			System.out.println("Input = "+sentence);
			System.out.println("Palindrome!");
		} else {
			System.out.println("Input = "+sentence);
			System.out.println("Not Palindrome!");
		}
		System.out.println("\n");
    }
}