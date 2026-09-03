import java.util.*;
// public class J {
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             System.out.println(i);
//         }
//     }
// }

// public class J {
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int sum=0;
//         int i=1;
//         while(i<=n){
//            sum=sum+i;
//            i++;
//         }
//         System.out.println(sum);
//     }
// }

// public class J{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int table=0;
//         for(int i=1;i<=10;i++){
//             table=n*i;
//             System.out.println(n + " * " + i + " = " + table);
//         }
//     }
// }

// public class J{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int i=n;
//         do{
//             System.out.println(i);
//             i--;
//         }
//         while(i>0);
//     }
// }

public class J{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        
            default:
               System.out.println("Invalid Day");
        }
    }
}