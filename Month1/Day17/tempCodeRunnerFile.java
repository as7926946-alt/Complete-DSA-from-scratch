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