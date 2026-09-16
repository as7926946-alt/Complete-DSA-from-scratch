import java.util.*;
// public class J {
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         int size=sc.nextInt();
//         int arr[]=new int[size];
//         for(int i=0;i<size;i++){
//             arr[i]=sc.nextInt();
//         }
//          int max=arr[0];
//         int sl=arr[0];
//         for(int i=0;i<size;i++){
//             if(max<arr[i]){
//                 sl=max;
//                 max=arr[i];
//             }
//             else if(arr[i]>sl){
//                 sl=arr[i];
//             }

//         }
// System.out.println(sl);
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
//         int max=arr[0];
//         int count=0;
//         for(int i=0;i<size;i++){
//             if(max<arr[i]){
//                 max=arr[i];
//             }
//         }
//         System.out.println("The maximum element is " + max);
//         for(int i=0;i<size;i++){
//             if(arr[i]==max){
//                 count++;
//             }
//         }
//         System.out.println("The frequency of maximum element is " + count);
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
//         for(int i=0;i<size;i++){
//             boolean alreadyPrinted=false;
//             int count=0;
//             for(int j=0;j<size;j++){
//                 if(arr[i]==arr[j]){
//                     count++;
//                 }
//             }
//                 for (int j = 0; j < i; j++) {
//                 if (arr[i] == arr[j]) {
//                     alreadyPrinted = true;
//                     break;
//                 }
//             }

//             if (count > 1 && !alreadyPrinted) {
//                 System.out.println(arr[i]);
//             }
//         }
        
// }
// }

// public class J{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         int size=sc.nextInt();
//         int arr[]=new int[size];
//         for(int i=0;i<size;i++){
//             arr[i]=sc.nextInt();
//         }
//         for(int i=0;i<size;i++){
//             int count=0;
//             for(int j=0;j<size;j++){
//                 if(arr[i]==arr[j]){
//                     count++;
//                 }
//             }
//             if(count==1){
//                 System.out.print(arr[i] + " ");
//             }
//         }

//     }
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
//           ch=s.charAt(i);
//             index= ch - 'a';
//              freq[index]++;
//         }
//         for(int i=0;i<26;i++){
//         if(freq[i]==1){
//             ch=(char)(i +'a');
//             System.out.println(ch);
//             break;
//         }
//     }
//     }
// }

// public class J{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         int freq=0;
//         String s=sc.nextLine();
//         s=s.toLowerCase();
//         for(int i=0;i<s.length();i++){
//             char ch=s.charAt(i);
//             if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
//                 freq++;
//             }
//         }
//         System.out.println(freq);
//     }
// }

// public class J{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         boolean sorted=true;
//         int size=sc.nextInt();
//         int arr[]=new int[size];
//         for(int i=0;i<size;i++){
//             arr[i]=sc.nextInt();
//         }
//         for(int i=0;i<size-1;i++){
//             if(arr[i]>arr[i+1]){
//                 sorted=false;
//                 break;
//             }
//         }
//         if(sorted){
//             System.out.println("Sorted");
//         }
//         else{
//             System.out.println("Not Sorted");
//         }
//     }
// }

// public class J{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         String st="";
//         String s=sc.nextLine();
//         s=s.toLowerCase();
//         for(int i=0;i<s.length();i++){
//             if(s.charAt(i)==' '){
//                 continue;
//             }
//             else{
//                 st=st+s.charAt(i);
//             }
//         }
//         StringBuilder sb=new StringBuilder(st);
//         String str=sb.reverse().toString();
//         if(st.equals(str)){
//             System.out.println("Palindrome");
//         }
//         else{
//             System.out.println("Not palindrome");
//         }
//     }
// }

// public class J{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//             int size=sc.nextInt();
//             int arr[]=new int[size];
//             for(int i=0;i<size;i++){
//                 arr[i]=sc.nextInt();
//             }
//             int ls=arr[size-1];
//             for(int i=size-1;i>0;i--){
//                 arr[i]=arr[i-1];
//             }
//             arr[0]=ls;
//             for(int i=0;i<size;i++){
//              System.out.println(arr[i]);
//     }
// }
// }

// public class J{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         String str="";
//         String s=sc.nextLine();
//         s=s.toLowerCase();
//         int index=0;
//         int freq[]=new int[26];
//         for(int i=0;i<s.length();i++){
//             char ch=s.charAt(i);
//             index=ch - 'a';
//             if(freq[index]==0){
//                 str=str+ch;
//             }
//             else{
//                 continue;
//             }
//             freq[index]++;
//         }
// System.out.println(str);
//     }
// }

