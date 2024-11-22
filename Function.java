//import java.util.*;
//public class Function {
//    public static int calculateSum(int a,int b){
//        int Sum = a+b;
//        return Sum;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int sum = calculateSum(a,b);
//        System.out.println("Sum of two number is : " + sum);
//    }
// }

//import java.util.*;
//class Function{
//    public static int calculateProduct(int a,int b){
//        return a * b;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.println("Product of two numbers is : " + calculateProduct(a,b));
//    }
//}
//output
// 7
// 8
//Product of two numbers is : 56


//import java.util.*;
//class Function{
//    public static void printFactorial(int n){
//        if(n<0){
//            System.out.println("Invalid number");
//            return;
//        }
//        int factorial=1;
//        for(int i=n;i>=1;i--){
//            factorial = factorial*i;
//        }
//        System.out.println(factorial);
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.println("Factorial is:");
//        printFactorial(n);
//
//    }
//}
//output
//        7
//        Factorial is:
//        5040


// import java.util.*;
//class Function{
//    public static int Average(int a,int b,int c){
//        int average=(a+b+c)/3;
//        return average;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        int average=Average(a,b,c);
//        System.out.println("Average of 3 numbers: " + average  );
//
//    }
//}

//import java.util.*;
//class Function{
//    public static int sumOfOdd(int n) {
//        int odd = 0;
//        for (int i = 1; i <= n; i++) {
//            if (i % 2 != 0) {
//                odd = odd + i;
//            }
//        }
//        System.out.println(odd);
//        return odd;
//    }
//    public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    int n = sc.nextInt();
//    sumOfOdd(n);
//    }
//}

//import java.util.*;
//class Function{
//    public static int getGreater(int a,int b) {
//        if(a>b){
//            return a;
//        }else{
//            return b;
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a= sc.nextInt();
//        int b= sc.nextInt();
//        System.out.println(getGreater(a,b));
//    }
//}
//output
//        99
//        454
//        454


//import java.util.*;
//class Function{
//    public static int ageOfPerson(int n){
//        if (n>18){
//            System.out.println("Eligible to Vote");
//        }else{
//            System.out.println("Not Eligible");
//        }
//        return 0;
//
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        System.out.println(ageOfPerson(n));
//    }
//}
//
//
//import java.util.*;
//public class Function {
//    public static void main(String args[]) {
//        System.out.println("Enter x");
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        System.out.println("Enter n");
//        int n = sc.nextInt();
//
//
//        int result = 1;
//        //Please see that n is not too large or else result will exceed the size of int
//        for(int i=0; i<n; i++) {
//            result = result * x;
//        }
//
//
//        System.out.println("x to the power n is : "+ result);
//    }
//}
//
//output
//Enter x
//55
//Enter n
//4
//x to the power n is : 9150625