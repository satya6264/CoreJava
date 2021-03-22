package Practice;

public class StringImmutableEx {
	public static void main(String[] args) {
		String s = "Satya";
		String s1 = "Satya";
		String s2 = "Satya";
		String s3 = "satya";
		s = s.concat(" guduru");
		int a = 10;
		String s4 = String.valueOf(a);
		String s5 = s1.replace("Satya", "Ravi");
		System.out.println(s);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.substring(2));
		System.out.println(s.length());
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.startsWith("S"));
		System.out.println(s.endsWith("u"));
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(5));
		System.out.println(s.charAt(6));
		System.out.println(s.intern());
		System.out.println(s4 + 10);
		System.out.println(s5);
	}

}
