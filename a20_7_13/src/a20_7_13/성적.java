package a20_7_13;

public class ¼ºÀû {
	int ±¹¾î,¿µ¾î,¼öÇÐ,ÃÑÁ¡;
	double Æò±Õ;
	char ÇÐÁ¡;
	void ÃÑÁ¡±¸ÇÏ±â() {
		ÃÑÁ¡=±¹¾î+¿µ¾î+¼öÇÐ;
	}
	void Æò±Õ±¸ÇÏ±â() {
		Æò±Õ=ÃÑÁ¡/3.;
	}
	void ÇÐÁ¡±¸ÇÏ±â() {
		if(Æò±Õ>=90) ÇÐÁ¡='A';
		else if(Æò±Õ>=80) ÇÐÁ¡='B';
		else if(Æò±Õ>=70) ÇÐÁ¡='C';
		else if(Æò±Õ>=60) ÇÐÁ¡='D';
		else ÇÐÁ¡='F';
	}
	void Ãâ·Â() {
		System.out.println(ÃÑÁ¡);
		System.out.println(Æò±Õ);
		System.out.println(ÇÐÁ¡);
	}
}
