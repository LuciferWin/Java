package Day4;

public class String_Testing {

	public static void main(String[] args) {
		
		String s1 = new String(new char[] {'Y', 'W', 'T'});
		String s2 = new String("Java Programming");
		String s3 = "Myanmar IT Consulting";
		
		System.out.println("s1's Length : " + s1.length());
		System.out.println("s2's Length : " + s2.length());
		
		System.out.println("s3's UpperCase : " + s3.toUpperCase());
		System.out.println("After Changing, s3 : " + s3);

//		Substring
		var subStr = s2.substring(0, 4); // Start , End - 1
		System.out.println("Substring : " + subStr);
		System.out.println("After Substring , s2 : " + s2);
		System.out.println("Substring2 : " + s2.substring(5));
		
//		Replace
		var output = s2.replace("Java" , "Python");
		System.out.println("Replace : " + output);
		System.out.println("After Replace, s2 : " + s2);
		
//		Concat
		System.out.println("Concat : " + s2.concat(" Language"));
		System.out.println("After Concat, s2 : " + s2);
		
//		Finding
		System.out.println("s2 contains 'Java' : " + s2.contains("Java"));
		
	}

}
