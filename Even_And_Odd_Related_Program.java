package Code_Practice;

import java.util.Scanner;

public class Even_And_Odd_Related_Program {
	static Scanner sc = new Scanner(System.in);

public static void main(String[] args) {
	
	evenORodd();
	PrintOddNumber();
	printEvenNumber();
	countOddNumber();
	EvenSum();
	OddSum();
	
}
static int inputNumber() {
    System.out.println("Enter any number:");
    return sc.nextInt();
}
static void evenORodd() {
	int n=inputNumber();
		if(n%2==0) {
			System.out.println("The number is even");
		}else {
			System.out.println("The number is odd");
		}
	}
static void PrintOddNumber() {
	int n=inputNumber();
	for(int i=1;i<=n;i++) {
	if(i%2!=0) {
	System.out.println(i);
	}
	}}
	static void printEvenNumber() {
	int n=inputNumber();
	for(int i=1;i<=n;i++) {
	if(i%2==0) {
		System.out.println(i);
	}
	}}
static void countOddNumber() {
	int n=inputNumber();
	int count=0;
for(int i=1;i<=n;i++) {
	if(i%2!=0) {
	count++;	
	}}
	System.out.println(count);
	
}
static void EvenSum() {
	int n=inputNumber();
	int sum=0;
	for(int i=1;i<=n;i++) {
	if(i%2==0) {
		sum+=i;
	}
	}
	System.out.println(sum);
}
static void OddSum() {
	int n=inputNumber();
	int sum=0;
	for(int i=1;i<=n;i++) {
	if(i%2!=0) {
		sum+=i;
	}
	}
	System.out.println(sum);
}
}










