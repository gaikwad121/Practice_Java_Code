package Code_Practice;

import java.util.Scanner;

public class Basic_Codes {
	static Scanner sc=new Scanner(System.in);
public static void main(String[] args) {
	//RevNumber();
	//palindromeNumber();
	//countDigit();
	//armStrongNumber();
	//sumOfDigit();
	//towNumberSwapWithThirdNumber();
	//towNumberSwapWithoutThirdNumber();
	//factorialNumber();
	//primeNumberOrNot();
	printPrimeNumber();
}
static int inputNumber() {
	int num;
	System.out.println("Enter any number");
	return num=sc.nextInt();
}
static void RevNumber() {
int n=inputNumber();
int rev=0;
while(n>0) {
rev=rev*10+n%10;
n=n/10;
	
}
System.out.println(rev);
}
static void palindromeNumber() {
int n=	inputNumber();
	int rev=0;
	int temp=n;
	while(n>0) {
	rev=rev*10+n%10;
	n=n/10;
	
	}
	if(temp==rev) {
		System.out.println("The number is palindrome");
	}else {
		System.out.println("The number is not palindrome");
	}
}
static void countDigit() {
	int n=inputNumber();
	int count=0;
	while(n>0) {
	count++;
	n/=10;
	}

	System.out.println("The count is :"+count);
}

static void armStrongNumber() {
	int n=inputNumber();
	int temp=n;
	int arm=0;
	while(n>0) {
	int num=n%10;
	arm=arm+(num*num*num);
	n/=10;
}
if(temp==arm) {
System.out.println("The number is armstrong number");	
}else {
	System.out.println("The number is not amrmstrong number");
}
}
static void sumOfDigit() {
	int n=inputNumber();
	int sum=0;
	while(n>0) {
	int num=n%10;
	sum+=num;
	n/=10;
	}

System.out.println(sum);
}
static void towNumberSwapWithThirdNumber() {
	int a=13;
	int b=56;
	System.out.println("Before Swap :"+a+" "+b);
	int temp=a;
	a=b;
	b=temp;
	System.out.println("After Swap :"+a+" "+b);

}
static void towNumberSwapWithoutThirdNumber() {
	int a=78;
	int b=89;
	System.out.println("Before Swap :"+a+" "+b);

	a=a*b;
	b=a/b;
	a=a/b;
	System.out.println("After Swap :"+a+" "+b);
	/*System.out.println("Before Swap :"+a+" "+b);

	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("After Swap :"+a+" "+b);
*/
}
static void factorialNumber() {
	int n=inputNumber();
	int factorial=1;
	for(int i=1;i<=n;i++) {
	factorial=factorial*i;
	}
	System.out.println(factorial);
}
static void primeNumberOrNot() {
	int n=inputNumber();
	int count=0;
	for(int i=2;i<=n/2;i++) {
	if(n%i==0) {
		count++;
	}}
	if(count==0) {
		System.out.println("the number is prime number");
	}
	else {
		System.out.println("the number is not prime number");
	}
	}
static void printPrimeNumber() {
    int n = inputNumber();
    for (int i = 2; i <= n; i++) {
        boolean isPrime = true;
        for (int j = 2; j <= i / 2; j++) {
            if (i % j == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(i);
        }
    }
}
}












