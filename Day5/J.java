import java.util.*;

// public class J {
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         if(n<=0){
//             System.out.println("Array is empty");
//             return;
//         }
//         int []arr=new int[n];
//       boolean  isSorted=true;
//         for(int i=0;i<arr.length;i++){
//             arr[i]=sc.nextInt();
//         }
//         for(int i=0;i<arr.length-1;i++){
//             if(arr[i]>arr[i+1]){
//                 isSorted=false;
//                 break;
//             }
//         }
//         if(isSorted){
//             System.out.println("Array is sorted");
//         }
//         else{
//             System.out.println("Array is not sorted");
//         }
//     }
// }

// public class J{
//     public static void checkNumber(int a,int b) throws ArithmeticException{ 
//         int result=a/b;
//         System.out.println(result);
//     }
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//          try{
//              checkNumber(a, b);
//         }
//         catch(ArithmeticException e){
//             System.out.println("Cannot divide by zero");
//         }
//     }
// }