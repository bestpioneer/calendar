package 달력;

import java.util.Scanner;

public class 최대일수 {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int a = s.nextInt();
	int[] d = {31,28,31,30,31,30,31,31,30,31,30,31};
	
    System.out.printf("%d월은 %d일 입니다 \n",a,d[a-1]); 
		
	
  }
}
