public class Same{
	public static void main(String[] args) {

		
		String word_checker ="Den laks skal ned";

		printIfPalindrome(word_checker);
	}
	


	public static void printIfPalindrome(String test) {
		
		char charetor;
		




		String checker = "";


		
		test = test.toLowerCase();

		for (int i = 0; i < test.length(); i++) {
	
	

			charetor = test.charAt(i);
	


			checker = charetor + checker;
			
		}





		if(test.equals(checker)) {
	

			System.out.println("Palindrome strengen kan skreves ens forfra og bagfra");
	

		}

	}
}


