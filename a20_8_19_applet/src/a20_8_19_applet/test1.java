package a20_8_19_applet;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class test1 extends Applet {
	
	
	
	public void paint(Graphics g) {					//3����, �޼ҵ� �ܿ� �ؿ��� �� ������ ����ȴ�.
		Color c = new Color(255,0,0);
		Font f = new Font("�������",Font.BOLD,15);
		g.setColor(c);
		g.setFont(f);
		g.drawString("���ѹα�", 100, 100);
		
		Font f2 = new Font("�޸�����ü",Font.BOLD+Font.ITALIC, 18);
		Color c2 = Color.blue;						//new���� Color.blue�� �ߴ� ������ blue ��ü�� static �̱� ������.
		g.setColor(c2);
		g.drawString("���ø�����", 100, 200);
	}

	public void destroy() {							//5����, ȭ�� �� ��
		System.out.println("����");
	}
	
	public void init() {							//1����
		System.out.println("�ʱ�");
	}
	
	public void start() {							//2����
		System.out.println("��ŸƮ");
	}
	
	public void stop() {							//4����, ȭ�� ���� ��
		System.out.println("����");
	}
}
