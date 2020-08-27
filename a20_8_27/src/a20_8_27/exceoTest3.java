package a20_8_27;

public class exceoTest3 {

	public static void main(String[] args) {
		try {
			Exception e = new Exception();
			throw e;
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
