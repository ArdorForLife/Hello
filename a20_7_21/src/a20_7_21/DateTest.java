package a20_7_21;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		Date kim=new Date();
		System.out.println(kim);
		SimpleDateFormat f=new SimpleDateFormat("yyyy�� MM�� dd��"+"hh�� mm�� ss��");
		System.out.println("1. ������ ��¥="+f.format(kim));
		
		Calendar now=Calendar.getInstance();
		int year, month, day, hour, minute, second;
		year=now.get(Calendar.YEAR);
		month=now.get(Calendar.MONTH)+1;
		day=now.get(Calendar.DATE);
		hour=now.get(Calendar.HOUR);
		minute=now.get(Calendar.MINUTE);
		second=now.get(Calendar.SECOND);
		System.out.println("2. ������ ��¥="+year+"/"+month+"/"+day);
		System.out.println(hour+":"+minute+":"+second);
	}

}
