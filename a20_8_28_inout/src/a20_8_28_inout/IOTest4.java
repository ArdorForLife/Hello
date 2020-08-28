package a20_8_28_inout;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class IOTest4 {

	public static void main(String[] args) throws Exception {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
			String name = br.readLine();
			String id = br.readLine();
			String pwd = br.readLine();
			String age = br.readLine();
			String tel = br.readLine();
				
			System.out.println(name+"\t"+id+"\t"+pwd+"\t"+age+"\t"+tel);
			
			File file = new File("iotest4.txt");
			FileWriter output = new FileWriter(file, true);
			output.write(name);
			output.write(id);
			output.write(pwd);
			output.write(age);
			output.write(tel);
			output.close();
	}

}



