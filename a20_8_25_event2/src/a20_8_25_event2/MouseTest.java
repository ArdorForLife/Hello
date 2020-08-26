package a20_8_25_event2;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;

public class MouseTest extends Applet implements MouseListener {

	JLabel lbl1;
	int num;			//카운팅 1씩 증가
	int x[], y[];		//x축, y축
	
	public void init() {
		this.setLayout(new BorderLayout());
		lbl1 = new JLabel("마우스를 클릭하면 원이 그려집니다.");
		//lbl1.setBounds(10, 20, 50, 20);
		this.add("north", lbl1);
		
		num=0;
		x=new int[100];
		y=new int[100];
		this.addMouseListener(this);		//기다리는 아이
	
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.red);
		for(int i=0;i<num;i++) {
		g.fillOval(x[i]-20, y[i]-20, 40, 40);
		}
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("마우스를 클릭하셨군요");
		System.out.println(e.getX());
		System.out.println(e.getY());
		
		if(num<100) {
			x[num]=e.getX();
			y[num]=e.getY();
			num++;
		}
		repaint();
		
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

}
