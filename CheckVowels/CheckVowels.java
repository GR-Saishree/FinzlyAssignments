import java.util.Scanner;
public class CheckVowels {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		str=str.toLowerCase();
		int acount=0,ecount=0,icount=0,ocount=0,ucount=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a') {
				acount++;
			}
			else if(str.charAt(i)=='e') {
				ecount++;
			}
			else if(str.charAt(i)=='i') {
				icount++;
			}
			else if(str.charAt(i)=='o') {
				ocount++;
			}
			else if(str.charAt(i)=='u') {
				ucount++;
			}
		}
		if(acount>0 && ecount>0 && icount>0 && ocount>0 && ucount>0) {
			System.out.println("The given string "+str+" contains all vowels");
		}
		else {
			System.out.println("The given string "+str+" does not contain all vowels");
		}
		
	}

}
