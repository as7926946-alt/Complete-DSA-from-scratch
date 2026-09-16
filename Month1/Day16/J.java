import java.util.*;

// public class J {
//    static class Student{
//         private int marks;
//         public void setMarks(int marks){
//             this.marks=marks;
//         }
//         public int getMarks(){
//             return marks;
//         }
//     }
//     public static void main(String[]args){
//         Student s1=new Student();
//        s1.setMarks(90);
//       System.out.println(s1.getMarks()); 

//     }
// }


// public class J{
//     static class Animal{
//         String name="Animal";
//         public void eat(){
//             System.out.println("Animal is eating");
//         }
//     }
//  static class Dog extends Animal{
//         public void bark(){
//             System.out.println("Dog is barking");
//         }
//     }
//     public static void main(String[]args){
//         Dog d1=new Dog();
//        d1.eat();
//        d1.bark();
//     }
// }

public class J{
    static class Animal{
        String name="Animal";
    }
    static class Dog extends Animal{
        String name="Dog";
        public void showNames(){
         System.out.println(name);
         System.out.println(super.name);
        }
    }
    public static void main(String[]args){
        Dog d1=new Dog();
       d1.showNames();
    }
}