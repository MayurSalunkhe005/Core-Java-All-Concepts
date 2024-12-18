package strings;

public class StringImutabiliy {

	public static void main(String[] args) {

		String s = new String("Mayur ");
			s.
		
		System.out.println(s.concat("Salunkhe"));

		System.out.println(s);

		s = s.concat("Salunkhe" + 20 / 10 + 12);
		System.out.println(s);

		StringBuffer sb = new StringBuffer("Hello");
		sb.append(" Mayur");
		System.out.println(sb);

	}
}
