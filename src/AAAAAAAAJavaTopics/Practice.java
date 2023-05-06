package AAAAAAAAJavaTopics;
//int num=12345;
////int to string conversion
//String strr=Integer.toString(num);
////string to int conversion
//int num2=Integer.parseInt(strr);	



import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
	
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the String");
//		 String str= sc.nextLine();
//		 String str1="";
//		 String str2="";
		 
//		 for (int i = 0; i < str.length(); i++) {
//			//str1=str.charAt(i)+str1;
//			 if(!Character.isUpperCase(str.charAt(i)))
//			 {
//				 str1=str1+str.charAt(i);
//			 } 
//			 else
//			 {
//				 str2=str2+str.charAt(i);
//			 }
//		}
//		 System.out.println(str1);
//		 System.out.println(str2);
		 
		
		
//		int num=12345;
//		//int to string conversion
//		String strr=Integer.toString(num);
//		//string to int conversion
//		int num2=Integer.parseInt(strr);	
//		System.out.println(num2%10);
//		String str="";
//		while(num!=0)
//		{
//			int rem= num%10;
//			str=str + rem;
//			num= num/10;
//		}
//		System.out.println(str);
//		System.out.println(strr);
//		
		
		
		int n1=0;
		int n2=1;
		int num=10;
		System.out.print(n1+" "+n2);
		
		while(num!=0)
		{
			int n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
			num--;
		}
		
	}
}
