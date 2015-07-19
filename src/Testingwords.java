
public class Testingwords {
	 
	public static int FindRootNumber(int input) {
		int x = input;
		String y = EnglishNumberToWords.convert(input);
		
		while (y.length() != x) {
			x = y.length();
			y = EnglishNumberToWords.convert(x);
		}
		return x;
	}
	
	public static void main(String[] args)
	{
		//for (int x = 0; x < 999999999; x++){
		int root = FindRootNumber(999999999);
		//System.out.println(x + ": " + root );
		ensureitsfour(root);
		//}
	}

	private static void ensureitsfour(int root) {
		if (root != 4){
			throw new IndexOutOfBoundsException("THIS ONE ISNT FOUR"); 
		}
		
	}
}
