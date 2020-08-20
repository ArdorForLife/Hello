package a20_8_19_applet;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class test1 extends Applet {
	
	
	
	public void paint(Graphics g) {					//3순위, 메소드 외에 밑에꺼 다 지워도 실행된다.
		Color c = new Color(255,0,0);
		Font f = new Font("나눔고딕",Font.BOLD,15);
		g.setColor(c);
		g.setFont(f);
		g.drawString("대한민국", 100, 100);
		
		Font f2 = new Font("휴만매직체",Font.BOLD+Font.ITALIC, 18);
		Color c2 = Color.blue;						//new없이 Color.blue를 했던 이유는 blue 자체가 static 이기 때문에.
		g.setColor(c2);
		g.drawString("애플릿연습", 100, 200);
	}

	public void destroy() {							//5순위, 화면 끌 때
		System.out.println("꺼짐");
	}
	
	public void init() {							//1순위
		System.out.println("초기");
	}
	
	public void start() {							//2순위
		System.out.println("스타트");
	}
	
	public void stop() {							//4순위, 화면 내릴 때
		System.out.println("멈춤");
	}
}
