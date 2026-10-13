import java.util.Scanner;

public class J {
    public static int linearSearch(int arr[],int target){
         for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
         int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int result=linearSearch(arr, target);
        if(result==-1){
            System.out.println("Target not found");
        }
        else{
            System.out.println(result);
        }
    }
}
