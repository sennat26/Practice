public class Test 
{              
	public static void main(String args[])
	{
		//string rotation code
		String word1 = "overflowstack";
		String word2 = "stackoverflow";
		if(word1.length()!=word2.length())
		{
			System.out.println("No");
		}
		String word3 = word1.concat(word1);
		if(word3.contains(word2)){
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		
		//Gray code sequence
//		byte term1 = (byte)0x0a;
//		byte term2 = (byte)0x0b;	
//		
//		int out;
//		out = grayCheck(term1,term2);
//		System.out.println(out);
////
	

//
//	public static int grayCheck(byte term1, byte term2) {
//		System.out.println("XOR is "+(term1^term2));
//		System.out.println("And is "+((term1^term2)&0xff));
//		return Integer.bitCount((term1^term2))==1?1:0;
//	}
//}
		
		//remove vowels from a string
		String string = "A really COOL string";
		string = string.replaceAll("[AaEeIiOoUu]", "");
		System.out.println(string);
	}
}