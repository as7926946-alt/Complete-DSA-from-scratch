import java.util.*;
// public class J{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         String s=sc.nextLine();
//         int index=0;
//         s=s.toLowerCase();
//         int freq[]=new int[26];
//         for(int i=0;i<s.length();i++){
//             char ch=s.charAt(i);
//              index=ch - 'a';
//             freq[index]++;
//     }
//     for (int i=0;i<26;i++){
//         if(freq[i]>0){
//             char ch=(char)(i +'a');
//             System.out.println(ch + " " + freq[i]);
//         }
//     }
// }
// }

// public class J{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         int index=0;
//         int frq[]=new int[26];
//         int frq1[]=new int[26];
//         String s=sc.nextLine();
//         s=s.toLowerCase();
//         String s1=sc.nextLine();
//         s1=s1.toLowerCase();
//         for(int i=0;i<s.length();i++){
//             char ch=s.charAt(i);
//             index=ch - 'a';
//             frq[index]++;
//         }
//         for(int i=0;i<s1.length();i++){
//             char ch=s1.charAt(i);
//             index=ch -'a';
//             frq1[index]++;
//         }

//         boolean anagram=true;

//         for(int i=0;i<26;i++){
//             if(frq[i]!=frq1[i]){
//                 anagram=false;
//                 break;
//             }
//         }
//         if(anagram){
//             System.out.println("Anagram");
//         }
//         else{
//             System.out.println("Not Anagram");
//         }
// }
// }

// public class J{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         int index=0;
//         char ch=0;
//         String str="";
//         String s=sc.nextLine();
//         s=s.toLowerCase();
//         int freq[]=new int[26];
//         for(int i=0;i<s.length();i++){
//            ch=s.charAt(i);
//             index=ch - 'a';
//               if(freq[index]==0){
//                 str= str + ch;
//         }
//          else {
//             continue; 
//         }
//          freq[index]++;
//         }
//         System.out.println(str);
//         }
// }

// public class J{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         String s=sc.nextLine();
//         int count=0;
//         for(int i=0;i<s.length();i++){
//             char ch=s.charAt(i);
//             if(i==0 && s.charAt(i)!=' '){
//                 count++;
//             }
//             else if(s.charAt(i)!= ' ' && s.charAt(i-1)==' '){
//                 count++;
//             }
//         }
//         System.out.println(count);
//     }
// }

// public class J{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         String s=sc.nextLine();
//         s=s.toLowerCase();
//         String str="";
//         for(int i=0;i<s.length();i++){
//             char ch=s.charAt(i);
//             if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
//                 continue;
//             }
//             else{
//                 str=str+ch;
//             }
//         }
//         System.out.println(str);

//     }
// }