package CoreJavaInterviewQus;

public class reveresString {

	public static void main(String[] args) {
		// Reverse String
		String s = "Srinivas";
		String t = "";
		for(int i=s.length()-1; i>=0; i--)
		{
			t = t +s.charAt(i);
		}
		System.out.println(t);
	}

}
