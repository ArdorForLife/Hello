package a20_7_30;
import java.util.ArrayList;

import java.util.Collections;

import java.util.List;

 

public class Test {

 

public static void main(String[] args) {

 

List<Integer> list = new ArrayList<Integer>();

List<Integer> lotto = new ArrayList<Integer>();

 

for(int i =1 ; i <= 45; i++)

{

list.add(i);

}

 

// Shuffle

Collections.shuffle(list);  // shuffle ��Ŵ

 

for( int i=1 ; i <= 6 ; i++ )

{

lotto.add(list.get(i));  // list���� i�� ��ŭ ������

}

 

Collections.sort(lotto);  // �������� ����

 

System.out.println(lotto);  // ���

 

 

}// main

 

}// Main Class
