package com.finzly.java.loops;
import java.util.Scanner;
public class DoWhileLoop {
	    
	        //Question1-Write a program to print 1 to 25 numbers
			void print1To25() {
				int i=1;
				do
				{
					System.out.print(i+" ");
					i++;
				}while(i<=25);
				System.out.println();
				System.out.println("-------------------------------------------------------------------------");
			}
			
			//Question2-Write a program to print 25 to 1 numbers
			void print25To1() {
				int i=25;
				do{
					System.out.print(i+" ");
					i--;
				}while(i>=1);
				System.out.println();
				System.out.println("-------------------------------------------------------------------------");
			}
			
			//Question3-Write a program to print 1 to 100 odd numbers
			void printOdd1To100() {
				int i=1;
				do {
					if(i%2!=0)
					System.out.print(i+" ");
					i++;
				}while(i<=100);
				System.out.println();
				System.out.println("-------------------------------------------------------------------------");
			}
			
			//Question4-Write a program to print 1 to 100 even numbers
			void printEven1To100() {
				int i=1;
				do {
					if(i%2==0)
					System.out.print(i+" ");
					i++;
				}while(i<=100);
				System.out.println();
				System.out.println("-------------------------------------------------------------------------");
			}
				
			//Question5-Write a program to print sum of 1 to 50 odd numbers
				void printOddSum1To50() {
					int sum=0;
					int i=1;
					do {
						if(i%2!=0)
						sum=sum+i;
						i++;
					}while(i<=50);
					System.out.print(sum);
					System.out.println();
					System.out.println("-------------------------------------------------------------------------");
				}
			//Question6-Write a program to print sum of 1 to 50 even numbers
				void printEvenSum1To50() {
					int sum=0;
					int i=1;
					do {
						if(i%2==0)
						sum=sum+i;
						i++;
					}while(i<=50);
					System.out.print(sum);
					System.out.println();
					System.out.println("-------------------------------------------------------------------------");
				}
				
			//Question7-Write a program to print -45 t0 +45 numbers
				void printNumbers() {
					int i=-45;
					do {
						System.out.print(i+" ");
						i++;
					}while(i<=45);
					System.out.println();
					System.out.println("-------------------------------------------------------------------------");
				}
			//Question8-Write a program to print 50 t0 100 numbers
				void printNumbers50To100() {
					int i=50;
					do {
						System.out.print(i+" ");
						i++;
					}while(i<=100);
					System.out.println();
					System.out.println("-------------------------------------------------------------------------");
				}
			//Question9-Write a program to print sum of odd and even numbers
				void printSum() {
					Scanner sc=new Scanner(System.in);
					System.out.println("Specify start range:");
					int a=sc.nextInt();
					System.out.println("Specify end range:");
					int b=sc.nextInt();
					int osum=0,esum=0,tsum=0;
					int i=a;
					do {
						if(i%2==0) {
							esum=esum+i;
						}
						else {
							osum=osum+i;
						}
						i++;
						
					}while(i<=b);
					tsum=osum+esum;
					System.out.print("Odd sum="+osum+"+"+"Even sum="+esum+"="+"total sum="+tsum+" ");
					System.out.println();
					System.out.println("-------------------------------------------------------------------------");
					
				}
			//Question10-Write a program to print even and odd numbers
				void printEvenOdd() {
					Scanner sc=new Scanner(System.in);
					System.out.println("Specify start range:");
					int a=sc.nextInt();
					System.out.println("Specify end range:");
					int b=sc.nextInt();
					int i=a;
					do {
						if(i%2==0) {
							System.out.print("even:"+i+" ");
						}
						else {
							System.out.print("odd:"+i+" ");
						}
						i++;
								
					}while(i<=b);
					System.out.println();
					System.out.println("-------------------------------------------------------------------------");
							
				}
			//Question11-Write a program to print 1 to 100 numbers
				void print1To100() {
					int i=1;
					do{
						System.out.print(i+" ");
						i++;
					}while(i<=100) ;
					System.out.println();
					System.out.println("-------------------------------------------------------------------------");
				}
			//Question12-Write a program to print 100 to 1 numbers
				void print100To1() {
					int i=100;
					do {
						System.out.print(i+" ");
						i--;
					}while(i>=1);
					System.out.println();
					System.out.println("-------------------------------------------------------------------------");
				}
			//Question13-Write a program to print 30 to 50 numbers
				void print30To50() {
					int i=30;
					do {
						System.out.print(i+" ");
						i++;
					}while(i<=50);
					System.out.println();
					System.out.println("-------------------------------------------------------------------------");
				}
			//Question14-Write a program to print count of even numbers 1 to 25
				void printEvenCount() {
					int ecount=0;
					int i=1;
					do {
						if(i%2==0)
						ecount++;
						i++;
					}while(i<=25);
					System.out.print(ecount);
					System.out.println();
					System.out.println("-------------------------------------------------------------------------");
				}
			//Question15-Write a program to print count of odd numbers 1 to 25
				void printOddCount() {
					int ocount=0;
					int i=1;
					do {
						if(i%2!=0)
						ocount++;
						i++;
					}while(i<=25);
					System.out.print(ocount);
					System.out.println();
					System.out.println("-------------------------------------------------------------------------");
					System.out.println("---------------------------Generate the series---------------------------");
				}
				
			// -------------------------------Generate the series---------------------------------------------------
			//Question16-Generate the series...... 2 4 6 8 10 12 14 16 18 20.
				void evenSeries() {
					int i=2;
					do {
						System.out.print(i+" ");
						i=i+2;
					}while(i<=20);
					System.out.println();
					System.out.println("-------------------------------------------------------------------------");
				}
			//Question17-Generate the series...... 9 18 27 36 45 54 63 72 81 90
				void multiply9Series() {
					int i=9;
					do {
						System.out.print(i+" ");
						i=i+9;
					}while(i<=90);
					System.out.println();
					System.out.println("-------------------------------------------------------------------------");
				}
			//Question18-Generate the series...... 1 -2 3 -4 5 -6 7 -8 9 -10
				void numberSeries() {
					int i=1;
					do {
						if(i%2==0) {
							System.out.print(i*-1+" ");
						}
						else {
							System.out.print(i+" ");
						}
						i++;
					}while(i<=10);
					System.out.println();
					System.out.println("-------------------------------------------------------------------------");
				}
			//Question19-Generate the series...... 5 10 15 20 25 30 35 40 45 50
				void multiply5Series() {
					int i=5;
					do {
						System.out.print(i+" ");
						i=i+5;
					}while(i<=50);
					System.out.println();
					System.out.println("-------------------------------------------------------------------------");
				}
			//Question20-Generate the series...... 1 10 100 1000
				void multiply10Series() {
					int i=1;
					do {
						System.out.print(i+" ");
						i=i*10;
					}while(i<=1000);
					System.out.println();
					System.out.println("-------------------------------------------------------------------------");
				}
			//Question21-Generate the series...... 1 3 6 10 15 21 28 36 45
				void previousSumSeries() {
					int j=1,sum=0,k=1;
					do {
						sum=sum+j;
						System.out.print(sum+" ");
						j++;
						k++;
					}while(k<=9);
					System.out.println();
					System.out.println("-------------------------------------------------------------------------");
				}
		    //Question22-Generate the series...... 8 16 24 32 40 48 56 64 72 80
				void multiply8Series() {
					int i=8;
					do {
						System.out.print(i+" ");
						i=i+8;
					}while(i<=80);
					System.out.println();
					System.out.println("-------------------------------------------------------------------------");
				}
			//Question23-Generate the series...... 0 1 1 2 3 5 8 13 21
				void fibonacciSeries() {
					int a=0,b=1;
					int sum=0;
					System.out.print(a+" "+b+" ");
					int i=1;
					do {
						sum=a+b;
						System.out.print(sum+" ");
						a=b;
						b=sum;
						i++;
					}while(i<=7);
					System.out.println();
					System.out.println("-------------------------------------------------------------------------");
				}
			//Question24-Generate the series...... 1 4 9 16 25 36 49 64 81 100
				void squareSeries() {
					int i=1;
					do {
						System.out.print(i*i+" ");
						i++;
					}while(i<=10);
					System.out.println();
					System.out.println("-------------------------------------------------------------------------");
				}
			//Question25-Generate the series...... 3 6 9 12 15 18 21 24 27 30
				void multiply3Series() {
					int i=3;
					do {
						System.out.print(i+" ");
						i=i+3;
					}while(i<=30);
					System.out.println();
					System.out.println("-------------------------------------------------------------------------");
				}
			//Question26-Generate the series...... 7 14 21 28 35 42 49 56 63 70
				void multiply7Series() {
					int i=7;
					do {
						System.out.print(i+" ");
						i=i+7;
					}while(i<=70);
					System.out.println();
					System.out.println("-------------------------------------------------------------------------");
				}
			//Question27-Generate the series...... 4 8 12 16 20 24 28 32 36 40
				void multiply4Series() {
					int i=4;
					do {
						System.out.print(i+" ");
						i=i+4;
					}while(i<=40);
					System.out.println();
					System.out.println("-------------------------------------------------------------------------");
				}
			//Question28-Generate the series...... 10 20 30 40 50 60 70 80 90 100
				void multiply10Series() {
					int i=10;
					do {
						System.out.print(i+" ");
						i=i+10;
					}while(i<=100);
					System.out.println();
					System.out.println("-------------------------------------------------------------------------");
				}
			//Question29-Generate the series...... 1 2 3 4 5 4 3 2 1
				void printSeries() {
					int i=1;
					do {
						System.out.print(i+" ");
						i++;
					}while(i<=5);
					int j=4;
					do {
						System.out.print(j+" ");
						j--;
					}while(j>=1);
					
					System.out.println();
					System.out.println("-------------------------------------------------------------------------");
				}
			//Question30-Generate the series...... 6 12 18 24 30 36 42 48 54 60
				void multiply6Series() {
					int i=6;
					do {
						System.out.print(i+" ");
						i=i+6;
					}while(i<=60);
					System.out.println();
					System.out.println("-------------------------------------------------------------------------");
				}
				
				
				
				
				
				
				

		}






