package a20_8_28_inout;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class IOTest44 {
//Scanner이용하여 이름,주소,전화번호 입력받아서
//iotest44.txt에 저장하시오
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름");
		String name = sc.next();
		System.out.println("주소");
		String juso = sc.next();
		System.out.println("전화번호");
		String tel = sc.next();
		
		File file = new File("iotest44.txt");
		FileWriter output = new FileWriter(file, true);
		output.write(name);
		output.write(juso);
		output.write(tel);
		output.close();
		
		
	}

}
