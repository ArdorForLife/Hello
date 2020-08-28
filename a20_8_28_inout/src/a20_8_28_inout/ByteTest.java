package a20_8_28_inout;

public class ByteTest {

	public static void main(String[] args) throws Exception {
		int data;
		while((data=System.in.read())!=-1) {
			System.out.println((char) data);
		}
		
		
	}

}
