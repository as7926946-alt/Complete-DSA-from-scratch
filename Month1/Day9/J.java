import java.util.*;

// public class J{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         int size=sc.nextInt();
//         int x=sc.nextInt();
//         int count=0;
//         int arr[]=new int[size];
//         for(int i=0;i<size;i++){
//             arr[i]=sc.nextInt();
//         }
//         for(int i=0;i<size;i++){
//             if(arr[i]==x){
//                 count++;
//             }
//         }
//         System.out.println(count);
//     }
// }

// public class J{
//     public static void main(String[]args){
//         Scanner sc=new Scanner (System.in);
//         int even=0;
//         int odd=0;
//         int size=sc.nextInt();
//         int arr[]=new int[size];
//         for(int i=0;i<size;i++){
//             arr[i]=sc.nextInt();
//         }
//         for(int i=0;i<size;i++){
//             if(arr[i]%2==0){
//                 even++;
//             }
//             else{
//                 odd++;
//             }
//         }
//         System.out.println("Even = " + even);
//         System.out.println("Odd = " + odd);
//     }
// }

// public class J{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         int size=sc.nextInt();
//         int arr[]=new int[size];
//         for(int i=0;i<size;i++){
//             arr[i]=sc.nextInt();
//         }
//          int max=arr[0];
//          int sl=arr[0];
//         for(int i=0;i<size;i++){
//             if(max<arr[i]){
//                 sl=max;
//                 max=arr[i];
//             }
//             else if(arr[i]>sl){
//                 sl=arr[i];
//             }

//         }
//         System.out.println(sl);
//     }
// }

// public class J{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         int size=sc.nextInt();
//         int arr[]=new int[size];
//         for(int i=0;i<size;i++){
//             arr[i]=sc.nextInt();
//         }
//         int pos=0;
//         int neg=0;
//         int zero=0;
//         for(int i=0;i<size;i++){
//             if(arr[i]>0){
//                 pos++;
//             }
//             else if(arr[i]<0){
//                 neg++;
//             }
//             else{
//                 zero++;
//             }
//         }
//         System.out.println("Positive = " + pos);
//         System.out.println("Negative = "+ neg);
//         System.out.println("Zero = " + zero);
//     }
// }

public class J{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        boolean sorted=true;
        for(int i=0;i<size-1;i++){
            if(arr[i]>arr[i+1]){
            sorted=false;
            }
        }
        if(sorted){
            System.out.println("Sorted");
        }
        else{
            System.out.println("Not Sorted");
        }
    }
}