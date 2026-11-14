import java.util.*;
// public class J {
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int[]arr=new int[n];
//         for(int i=0;i<arr.length;i++){
//          arr[i]=sc.nextInt();
//         }
//         int start=0;
//         int end=arr.length-1;
//         int temp;
//         while(start<end){
//                 temp=arr[start];
//                 arr[start]=arr[end];
//                 arr[end]=temp;
//                 start++;
//                 end--;
//         }
//         for(int i=0;i<arr.length;i++){
//             System.out.println(arr[i]);
//     }
// }
// }

public class J{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        try{
              int n=sc.nextInt();
        if(n<0){ 
             throw new ArithmeticException("Invalid Operation");
        }
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Program execution completed");
        }
    }
}
