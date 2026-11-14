import java.util.*;
// public class J {
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         if(n<=0){
//             System.out.println("Array is empty");
//             return;
//         }
//          int[] arr=new int[n];
//         for(int i=0;i<arr.length;i++){
//             arr[i]=sc.nextInt();
//         }
//         int largest=arr[0];
//         int sl=0;
//         boolean found=false;
//         for(int i=0;i<arr.length;i++){
           
//             if(arr[i]>largest){
//                 sl=largest;
//                 largest=arr[i];
//                 found=true;
//             }
//             else if(arr[i]<largest && (!found || arr[i]>sl)){
//                 sl=arr[i];
//                found=true;
//             }
//         }
        
//        if(found){
//             System.out.println("Second largest = "+ sl);
//            }
//            else{
//             System.out.println("No second largest is present");;
//            }
//            sc.close();
//     }
    
// }

public class J{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        try{
             System.out.println("Enter elements for divison");
        int a=sc.nextInt();
        int b=sc.nextInt();
              System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter elements of the array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter index which you have to access");
        int s=sc.nextInt();
            int div=a/b;
            System.out.println("Divison is " + div);
                    System.out.println(arr[s]);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot be divided by 0");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array is out of index");
        }
        catch(InputMismatchException e){
            System.out.println("Input is invalid");
        }
    }
}