public class J {
    class Student{
        String name;
        int age;
        int marks;

        Student(String name , int age , int marks){
            this.name=name;
            this.age=age;
            this.marks=marks;
        }
    }
    public  static void main(String[]args){
        Student s1=new Student("Rahul" ,23,96);
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.marks);
    }
}
