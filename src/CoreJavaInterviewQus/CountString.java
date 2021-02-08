package CoreJavaInterviewQus;
public class CountString {

	public static void main(String[] args) {
		int count = countOccurence("aaaaanja",'a'); 
		System.out.println(count);
	}

	private static int countOccurence(String word, char character) 
	{
		int count =0;
		for(int i=0; i<word.length();i++)
		{
			if (word.charAt(i)==character)
			{
				count++;
			}
		}
		return count;
	}

}
