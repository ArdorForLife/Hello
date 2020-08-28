package a20_8_28_inout;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOTest {

	public static void	 main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("sample.txt");
		for(int i='A';i<='Z';i++) {
			fos.write(i);
		}
		fos.close();
		
		FileInputStream fis = new FileInputStream("sample.txt");
		int data;
		while((data=fis.read())!=-1) {
			System.out.print((char) data);
		}
		fis.close();
	}
	
}
