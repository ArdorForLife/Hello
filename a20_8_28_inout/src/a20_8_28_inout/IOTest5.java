package a20_8_28_inout;

import java.io.File;
import java.io.FileReader;

public class IOTest5 {

	public static void main(String[] args) throws Exception {
		File file = new File("iotest4.txt");
		FileReader input = new FileReader(file);
		int data;
		while((data=input.read())!=-1) {
			System.out.write((char) data);
		}
	}

}
