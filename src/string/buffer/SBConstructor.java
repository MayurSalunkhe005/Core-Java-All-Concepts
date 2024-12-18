package string.buffer;

public class SBConstructor {
	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());// default capacity 16
		System.out.println(sb.append("Mayur").capacity());//16
		System.out.println(sb.append("MayurMayur55").capacity());//21~~//newcap=oldcap*2+2 OR oldcap+1*2
												//16*2+2=34
		System.out.println("sb: "+sb);
		
		StringBuffer sb1 = new StringBuffer("Mayur");// string
		System.out.println(sb1.capacity());// default 16+string=21

		StringBuffer sb2 = new StringBuffer(1000);// int
		System.out.println(sb2.capacity());
		
		StringBuffer sb3 = new StringBuffer(sb1);
		System.out.println(sb3);
	}
}
