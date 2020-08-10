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

Collections.shuffle(list);  // shuffle 시킴

 

for( int i=1 ; i <= 6 ; i++ )

{

lotto.add(list.get(i));  // list에서 i개 만큼 가져옴

}

 

Collections.sort(lotto);  // 오름차순 정렬

 

System.out.println(lotto);  // 출력

 

 

}// main

 

}// Main Class
