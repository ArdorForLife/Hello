package a20_8_28_inout;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class IOTest8 {

	public static void main(String[] args) throws Exception {
		File file = new File("iotest8.txt");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream output = new ObjectOutputStream(fos);
		
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int mat = sc.nextInt();
		
		output.writeObject(name);
		output.writeObject(kor);
		output.writeObject(eng);
		output.writeObject(mat);
		output.close();
		
	}

}
