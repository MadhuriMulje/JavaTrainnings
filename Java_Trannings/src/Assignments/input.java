package Assignments;

import java.io.IOException;

public class input {
	public static String readStr()throws IOException {
		byte b[] = new byte [255];
		int l= System.in.read(b);
		byte bt[] = new byte[l-1];
		System.arraycopy(b,0,bt,0,l-1);
		String s = new String(bt);
		return s;
		
		
	}
	
	public static int readInt()throws IOException {
		String s = readStr();
		int no = Integer.parseInt(s);
		System.out.println(no);
		return no;
		
	}
	
	
}
