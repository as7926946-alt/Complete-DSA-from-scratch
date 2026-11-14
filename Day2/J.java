import java.util.*;

// public class J {
//         public static void main(String[]args){
//             Scanner sc=new Scanner(System.in);
//             int n=sc.nextInt();
//             int []arr=new int[n];
//             for(int i=0;i<arr.length;i++){
//                 arr[i]=sc.nextInt();
//             }
//             int max=arr[0];
//             int min=arr[0];
//             for(int i=1;i<arr.length;i++){
//                 if(max<arr[i]){
//                     max=arr[i];
//                 }
//                 if(min>arr[i]){
//                     min=arr[i];
//                 }
//             }
//             System.out.println("Max" + max);
//             System.out.println("Min" + min);
//         }
// }

public class J{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        try{
            int result=a/b;
            System.out.println(result);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by 0");
        }
    }
}