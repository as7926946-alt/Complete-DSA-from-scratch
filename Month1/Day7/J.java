 import java.util.Scanner;

// public class J {
//     public static void checkPositive(int n){
//         if(n>0){
//             System.out.println("Positive");
//         }
//         else if(n<0){
//             System.out.println("Negative");
//         }
//         else{
//             System.out.println("Zero");
//         }
//     }
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         checkPostive(n);
//     }
// }

// public class J{
//     public static int findMax(int a,int b){
//         if(a>b){
//             return a;
//         }
//         else{
//             return b;
//         }
//     }
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         System.out.println(findMax(a, b));
//     }

// }

// public class J{
//     public static int sumN(int n){
//         int sum=0;
//         for(int i=0;i<=n;i++){
//             sum=sum+i;
//         }
//         return sum;
//   }
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         System.out.println(sumN(n));
//     }
// }

// public class J{
//     public static int countEven(int n){
//         int count=0;
//         for(int i=1;i<n;i++){
//             if(i%2==0){
//                 count++;
//             }
//         }
//         return count;
//     }
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         System.out.println(countEven(n));

//     }
// }

public class J{
    public static boolean isPalindrome(int n){
        int rev=0;
         int original =n; 
        while(n>0){
            int digit=n%10;
            rev=rev*10+digit;
             n=n/10; 
        }     
        if(original==rev){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isPalindrome(n));
    }
}