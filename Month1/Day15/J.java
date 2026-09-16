// public class J {
//     static class Student{
//         String name;
//         int age;
//         int marks;

//         Student(String name , int age , int marks){
//             this.name=name;
//             this.age=age;
//             this.marks=marks;
//         }
//     }
//     public  static void main(String[]args){
//         Student s1=new Student("Rahul" ,23,96);
//         System.out.println(s1.name);
//         System.out.println(s1.age);
//         System.out.println(s1.marks);
//     }
// }

// public class J{
//     static class Student{
//         String name;
//         int age;
//         int marks;
//         Student (String name, int age, int marks){
//             this.name=name;
//             this.age=age;
//             this.marks=marks;

//         }
//     }
//     public static void main(String[]args){
//         Student s1=new Student("Rahul", 23, 93);
//         Student s2=new Student("Anshul", 20, 91);
//         System.out.println(s1.name + " " + s1.age +" " + s1.marks);
//         System.out.println(s2.name + " "+ s2.age+ " " + s2.marks);
//     }
// }

public class J{
    static class Employee{
        String name;
        double salary;
        int id;
        
        Employee(String name, double salary, int id){
            this.name=name;
            this.salary=salary;
            this.id=id;
        }
    }
        public static void main(String[]args){
            Employee e1=new Employee("Rashi", 50000, 2004);
            Employee e2=new Employee("Rekha", 100000, 2006);
            System.out.println(e1.name + " " + e1.salary + " " + e1.id);
            System.out.println(e2.name + " " + e2.salary + " " + e2.id);
        }
}