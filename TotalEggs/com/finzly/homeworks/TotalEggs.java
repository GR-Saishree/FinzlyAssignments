package com.finzly.homeworks;

public class TotalEggs {
	
	static double powerOf(double sum,int i) {
		double result=1;
		for(int j=i;j>0;j--) {
			result=result*sum;
		}
		return result;
	}
	
	public static void main(String[] args) {

		int totalPeople=38;
		double sum=1;
		for(int i=2;i<=totalPeople;i++){
			sum=sum+powerOf(sum, i);
			System.out.println(sum);
		}
		
	}

}


/*                                WITH BUILT IN METHOD

     public static void main(String[] args){
        int totalPeople=38;
		double sum=1;
		for(int i=2;i<=totalPeople;i++) {
			sum=sum+Math.pow(sum, i);
			System.out.println(sum);
  		}
  	}
 
 */
