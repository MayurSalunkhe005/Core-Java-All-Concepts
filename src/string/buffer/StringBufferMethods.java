package string.buffer;

public class StringBufferMethods {
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("HELLO Mayur");
		System.out.println(sb.length());
		System.out.println(sb.charAt(4));
		System.out.println(sb.delete(1, 4));//1st inclusive last Exclusive
		System.out.println(sb.deleteCharAt(1));
		
		StringBuffer sbb = new StringBuffer("HELyLO yMayur");
		System.out.println(sbb.indexOf("y"));
		System.out.println(sbb.lastIndexOf("y"));
		System.out.println(sbb.insert(3, "zzz"));
		System.out.println(sbb.replace(4, 6, "new"));
		
		StringBuffer sb1 = new StringBuffer("Jalgaon");
		StringBuffer sb2 = sb1.append("hello");
		System.out.println(sb1.equals(sb2));
		
		StringBuffer sb3 = new StringBuffer("helloDeepak");
		System.out.println(sb3.reverse());
		System.out.println(sb3.reverse());
		System.out.println(sb3.subSequence(3, 8));
		System.out.println(sb3.substring(3));
		
		StringBuffer sb4 = new StringBuffer();
		sb4.ensureCapacity(100);
		sb4.append("hello");
		sb4.trimToSize();
		System.out.println(sb4.capacity());
		
	}
}
