// public class J {
//     static abstract class Animal{
//         abstract void sound();
//     }
//     static  class Dog extends Animal{
//        public void sound(){
//             System.out.println("Dog barks");
//         }
//     }
//     public static void main(String[]args){
//         Animal a= new Dog();
//         a.sound();
//     }
// }

// public class J{
//     static interface Animal{
//         void sound();
//     }
//     static class Dog implements Animal{
//        public void sound(){
//             System.out.println("Dog barks");
//         }
//     }
//     public static void main(String[]args){
//         Animal a=new Dog();
//         a.sound();
//     }
// }

public class J{
    static abstract class Animal{
        abstract void sound();
    }
    static interface pet{
        void play();
    }
    static class Dog extends Animal implements pet{
       void sound(){
        System.out.println("Dog barks");
       }
      public void play(){
        System.out.println("Dog plays");
       }
    }
    public static void main(String[]args){
        Dog d1=new Dog();
        d1.sound();
        d1.play();
    }

}