
public class call {
	public call() { 	}							//default ������
	public call(Shape temp) {						//1��¥�� ������
													//c,r,t�� ������� temp�� ������ temp�� �� �޾��ְ� �װ��� �θ�Ŭ������ ��������ϱ� ������ Shape�� ����--> ��ĳ��Ʈ�� ��Ȳ
		if(temp instanceof Circle) {				//�׷��� �ٽ� �ٿ�ĳ��Ʈ�� ��������Ѵ�.
			Circle cc = (Circle) temp;				//temp�濡 �ִ� ���� circle�� �°� �ٿ�ĳ��Ʈ �����ִ� ��
			cc.setR(5);							
			cc.area();
			cc.show();
		}
		else if(temp instanceof Rectangle) {
			Rectangle rr = (Rectangle) temp;
			rr.setW(5);
			rr.setH(6);
			rr.area();
			rr.show();
		}
		else if(temp instanceof Triangle) {
			Triangle tt = (Triangle) temp;
			tt.setW(5);
			tt.setH(6);
			tt.area();
			tt.show();
		}
		
	}
}

