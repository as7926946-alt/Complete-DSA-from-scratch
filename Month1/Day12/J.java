import java.util.*;
// public class J {
//     public static void main(String[]args){
//        Scanner sc=new Scanner(System.in);
//        String s=sc.nextLine();
//        StringBuilder sb=new StringBuilder(s);
//        System.out.println(sb.reverse());
       
//         }
//     }

// public class J{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         String s=sc.nextLine();
//         StringBuilder sb=new StringBuilder(s);
//        String reverse= sb.reverse().toString();
//         if(s.equals(reverse)){
//             System.out.println("Palindrome");
//         }
//         else{
//             System.out.println("Not Palindrome");
//         }
//     }
// }

// public class J{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         String s=sc.nextLine();
//         String str="";
//         for(int i=0;i<s.length();i++){
//             if(s.charAt(i)==' '){
//                 continue;
//             } 
//             else{
//                 str=str+s.charAt(i);
//             }
        
//         }
//         System.out.println(str);
//     }
// }

// public class J{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         String s=sc.nextLine();
//         StringBuilder sb=new StringBuilder(s);
//         String reverse=sb.reverse().toString();
//         System.out.println(reverse);
//     }
// }

public class J{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String str="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                continue;
            }
            else{
                str=str+s.charAt(i);
            }
        }
        System.out.println(str);
        StringBuilder sb=new StringBuilder(str);
        String reverse=sb.reverse().toString();
        if(str.equals(reverse)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}