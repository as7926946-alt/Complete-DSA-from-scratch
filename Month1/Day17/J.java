// public class J {
//     static class Calculator{
//         int add(int a,int b){
//             return a + b;
//         }
//         int add(int a,int b, int c){
//             return a+b+c;
//         }
//     }
//     public static void main(String[]args){
//               Calculator c=new Calculator();
//               System.out.println(c.add(2, 4));
//               System.out.println(c.add(1,2,3));
//     }
// }

// public class J{
//     static class Animal{
//         void sound(){
//             System.out.println("Animal makes a sound");
//         }
//     }
//    static class Dog extends Animal{
//     void sound(){
//         System.out.println("Dog barks");
//     }
//     }
//     public static void main(String[]args){
//         Dog d1=new Dog();
//         d1.sound();
//     }
// }

public class J{
    static class Animal{
        void sound(){
            System.out.println("Animal sound");
        }
    }
    static class Dog extends Animal{
        void sound(){
            System.out.println("Dog barks");
        }
    }
    static class Cat extends Animal{
        void sound(){
            System.out.println("Cat meows");
        }
    }
    public static void main(String[]args){
        Animal a1=new Dog();
       
      Animal c1=new Cat();
        a1.sound();
        c1.sound();
    }

}