package a20_8_26;

import java.util.Stack;

//���� stack : LIFO(Last In First Out)
public class collection3 {

	public static void show(Stack<String> name) {
		System.out.println("==============");
		for(String temp : name) {
			System.out.println(temp);
		}
	}
	
	
	public static void main(String[] args) {
		Stack<String> name = new Stack<String>();
		Stack<Integer> jumsu = new Stack<Integer>();
		name.add("ȫ�浿");	//����õ
		name.push("�̱���");	//��õ
		name.push("�ְ��");
		show(name);
		
	}

}
