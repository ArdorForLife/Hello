package a20_8_28_inout;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class IOTest44 {
//Scanner�̿��Ͽ� �̸�,�ּ�,��ȭ��ȣ �Է¹޾Ƽ�
//iotest44.txt�� �����Ͻÿ�
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸�");
		String name = sc.next();
		System.out.println("�ּ�");
		String juso = sc.next();
		System.out.println("��ȭ��ȣ");
		String tel = sc.next();
		
		File file = new File("iotest44.txt");
		FileWriter output = new FileWriter(file, true);
		output.write(name);
		output.write(juso);
		output.write(tel);
		output.close();
		
		
	}

}
