package Code_Practice;

import java.util.Scanner;

public class stringCodes {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		revString();
		PalindromeString();
		numOfCharacter();
		numOfWord();
		vowelCount();
	}
	static String inputString() {
		String name;
		System.out.println("Enter the input string ----....");
		return  name=sc.nextLine();
	}
static void revString() {
	String rev="";
	String n=inputString();
	for(int i=n.length()-1;i>=0;i--) {
		rev=rev+n.charAt(i);
	}
	System.out.println(rev);
}
static void PalindromeString() {
 String n=	inputString();
 String temp=n;
 String rev="";
 for(int i=n.length()-1;i>=0;i--) {
	rev=rev+n.charAt(i);
 }
 if(temp.equals(rev)) {
	 System.out.println("The string is palindrome");
 }
 else {
	 System.out.println("The string not is palindrome");

 }}
 static void numOfCharacter() {
	 String n=inputString();

	 char ch[]=n.toCharArray();
	 int length=ch.length;
	 System.out.println(length);
 }
 static void numOfWord() {
	 String n=inputString();
	 String name[]=n.split(" ");
	 int length=name.length;
	 System.out.println(length);
 }
 static void vowelCount() {
	 String Name="Welcome to solapur maharashtra india";
	 char ch[]=Name.toCharArray();
	 int count=0;
	for(int i=0;i<ch.length;i++) {
		char c=ch[i];
		if(c=='a' || c=='i' || c=='e' || c=='o' || c=='u' || c=='A' || c=='I' || c=='E' || c=='O' || c=='u' ) {
			count++;
			
		}
	}
		System.out.println(count);
	}
 }













