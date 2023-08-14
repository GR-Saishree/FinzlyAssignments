package com.finzly.java.loops;
import java.util.Scanner;

public class ForLoop {
	
	//Question1-Write a program to print 1 to 25 numbers
	void question1() {
		for(int i=1;i<=25;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("-------------------------------------------------------------------------");
	}
	
	//Question2-Write a program to print 25 to 1 numbers
	void question2() {
		for(int i=25;i>=1;i--) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("-------------------------------------------------------------------------");
	}
	
	//Question3-Write a program to print 1 to 100 odd numbers
	void question3() {
		for(int i=1;i<=100;i++) {
			if(i%2!=0)
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("-------------------------------------------------------------------------");
	}
	
	//Question4-Write a program to print 1 to 100 even numbers
		void question4() {
			for(int i=1;i<=100;i++) {
				if(i%2==0)
				System.out.print(i+" ");
			}
			System.out.println();
			System.out.println("-------------------------------------------------------------------------");
		}
		
	//Question5-Write a program to print sum of 1 to 50 odd numbers
		void question5() {
			int sum=0;
			for(int i=1;i<=50;i++) {
				if(i%2!=0)
				sum=sum+i;
			}
			System.out.print(sum);
			System.out.println();
			System.out.println("-------------------------------------------------------------------------");
		}
	//Question6-Write a program to print sum of 1 to 50 even numbers
		void question6() {
			int sum=0;
			for(int i=1;i<=50;i++) {
				if(i%2==0)
				sum=sum+i;
			}
			System.out.print(sum);
			System.out.println();
			System.out.println("-------------------------------------------------------------------------");
		}
		
	//Question7-Write a program to print -45 t0 +45 numbers
		void question7() {
			for(int i=-45;i<=45;i++) {
				System.out.print(i+" ");
			}
			System.out.println();
			System.out.println("-------------------------------------------------------------------------");
		}
	//Question8-Write a program to print 50 t0 100 numbers
		void question8() {
			for(int i=50;i<=100;i++) {
				System.out.print(i+" ");
			}
			System.out.println();
			System.out.println("-------------------------------------------------------------------------");
		}
	//Question9-Write a program to print sum of odd and even numbers
		void question9() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Specify start range:");
			int a=sc.nextInt();
			System.out.println("Specify end range:");
			int b=sc.nextInt();
			int osum=0,esum=0,tsum=0;
			for(int i=a;i<=b;i++) {
				if(i%2==0) {
					esum=esum+i;
				}
				else {
					osum=osum+i;
				}
				
			}
			tsum=osum+esum;
			System.out.print("Odd sum="+osum+"+"+"Even sum="+esum+"="+"total sum="+tsum+" ");
			System.out.println();
			System.out.println("-------------------------------------------------------------------------");
			
		}
	//Question10-Write a program to print even and odd numbers
		void question10() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Specify start range:");
			int a=sc.nextInt();
			System.out.println("Specify end range:");
			int b=sc.nextInt();
			for(int i=a;i<=b;i++) {
				if(i%2==0) {
					System.out.print("even:"+i+" ");
				}
				else {
					System.out.print("odd:"+i+" ");
				}
						
			}
			System.out.println();
			System.out.println("-------------------------------------------------------------------------");
					
		}
	//Question11-Write a program to print 1 to 100 numbers
		void question11() {
			for(int i=1;i<=100;i++) {
				System.out.print(i+" ");
			}
			System.out.println();
			System.out.println("-------------------------------------------------------------------------");
		}
	//Question12-Write a program to print 100 to 1 numbers
		void question12() {
			for(int i=100;i>=1;i--) {
				System.out.print(i+" ");
			}
			System.out.println();
			System.out.println("-------------------------------------------------------------------------");
		}
	//Question13-Write a program to print 30 to 50 numbers
		void question13() {
			for(int i=30;i<=50;i++) {
				System.out.print(i+" ");
			}
			System.out.println();
			System.out.println("-------------------------------------------------------------------------");
		}
	//Question14-Write a program to print count of even numbers 1 to 25
		void question14() {
			int ecount=0;
			for(int i=1;i<=25;i++) {
				if(i%2==0)
				ecount++;
			}
			System.out.print(ecount);
			System.out.println();
			System.out.println("-------------------------------------------------------------------------");
		}
	//Question15-Write a program to print count of odd numbers 1 to 25
		void question15() {
			int ocount=0;
			for(int i=1;i<=25;i++) {
				if(i%2!=0)
				ocount++;
			}
			System.out.print(ocount);
			System.out.println();
			System.out.println("-------------------------------------------------------------------------");
			System.out.println("---------------------------Generate the series---------------------------");
		}
		
	// -------------------------------Generate the series---------------------------------------------------
	//Question16-Generate the series...... 2 4 6 8 10 12 14 16 18 20.
		void question16() {
			for(int i=2;i<=20;i=i+2) {
				System.out.print(i+" ");
			}
			System.out.println();
			System.out.println("-------------------------------------------------------------------------");
		}
	//Question17-Generate the series...... 9 18 27 36 45 54 63 72 81 90
		void question17() {
			for(int i=9;i<=90;i=i+9) {
				System.out.print(i+" ");
			}
			System.out.println();
			System.out.println("-------------------------------------------------------------------------");
		}
	//Question18-Generate the series...... 1 -2 3 -4 5 -6 7 -8 9 -10
		void question18() {
			for(int i=1;i<=10;i++) {
				if(i%2==0) {
					System.out.print(i*-1+" ");
				}
				else {
					System.out.print(i+" ");
				}
			}
			System.out.println();
			System.out.println("-------------------------------------------------------------------------");
		}
	//Question19-Generate the series...... 5 10 15 20 25 30 35 40 45 50
		void question19() {
			for(int i=5;i<=50;i=i+5) {
				System.out.print(i+" ");
			}
			System.out.println();
			System.out.println("-------------------------------------------------------------------------");
		}
	//Question20-Generate the series...... 1 10 100 1000
		void question20() {
			for(int i=1;i<=1000;i=i*10) {
				System.out.print(i+" ");
			}
			System.out.println();
			System.out.println("-------------------------------------------------------------------------");
		}
	//Question21-Generate the series...... 1 3 6 10 15 21 28 36 45
		void question21() {
			int j=1,sum=0;
			for(int k=1;k<=9;k++) {
				sum=sum+j;
				System.out.print(sum+" ");
				j++;
			}
			System.out.println();
			System.out.println("-------------------------------------------------------------------------");
		}
    //Question22-Generate the series...... 8 16 24 32 40 48 56 64 72 80
		void question22() {
			for(int i=8;i<=80;i=i+8) {
				System.out.print(i+" ");
			}
			System.out.println();
			System.out.println("-------------------------------------------------------------------------");
		}
	//Question23-Generate the series...... 0 1 1 2 3 5 8 13 21
		void question23() {
			int a=0,b=1;
			int sum=0;
			System.out.print(a+" "+b+" ");
			for(int i=1;i<=7;) {
				sum=a+b;
				System.out.print(sum+" ");
				a=b;
				b=sum;
				i++;
			}
			System.out.println();
			System.out.println("-------------------------------------------------------------------------");
		}
	//Question24-Generate the series...... 1 4 9 16 25 36 49 64 81 100
		void question24() {
			for(int i=1;i<=10;i++) {
				System.out.print(i*i+" ");
			}
			System.out.println();
			System.out.println("-------------------------------------------------------------------------");
		}
	//Question25-Generate the series...... 3 6 9 12 15 18 21 24 27 30
		void question25() {
			for(int i=3;i<=30;i=i+3) {
				System.out.print(i+" ");
			}
			System.out.println();
			System.out.println("-------------------------------------------------------------------------");
		}
	//Question26-Generate the series...... 7 14 21 28 35 42 49 56 63 70
		void question26() {
			for(int i=7;i<=70;i=i+7) {
				System.out.print(i+" ");
			}
			System.out.println();
			System.out.println("-------------------------------------------------------------------------");
		}
	//Question27-Generate the series...... 4 8 12 16 20 24 28 32 36 40
		void question27() {
			for(int i=4;i<=40;i=i+4) {
				System.out.print(i+" ");
			}
			System.out.println();
			System.out.println("-------------------------------------------------------------------------");
		}
	//Question28-Generate the series...... 10 20 30 40 50 60 70 80 90 100
		void question28() {
			for(int i=10;i<=100;i=i+10) {
				System.out.print(i+" ");
			}
			System.out.println();
			System.out.println("-------------------------------------------------------------------------");
		}
	//Question29-Generate the series...... 1 2 3 4 5 4 3 2 1
		void question29() {
			for(int i=1;i<=5;i++) {
				System.out.print(i+" ");
			}
			for(int i=4;i>=1;i--) {
				System.out.print(i+" ");
			}
			
			System.out.println();
			System.out.println("-------------------------------------------------------------------------");
		}
	//Question30-Generate the series...... 6 12 18 24 30 36 42 48 54 60
		void question30() {
			for(int i=6;i<=60;i=i+6) {
				System.out.print(i+" ");
			}
			System.out.println();
			System.out.println("-------------------------------------------------------------------------");
		}
		
		
		
		
		
		
		

}
