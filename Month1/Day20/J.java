import java.util.*;
// public class J {
//     public static void main(String[]args){
//         HashMap<String, Integer> marks= new HashMap<>();
//         marks.put("Math", 85);
//         marks.put("Java", 90);
//         marks.put("DBMS", 88);
//         marks.put("Toc", 92);
//         System.out.println(marks);
//         System.out.println(marks.get("Java"));
//         marks.put("DBMS", 95);
//         marks.remove("Math");
//         System.out.println(marks.containsKey("Toc"));
//         System.out.println(marks);
//     }
// }

// public class J{
//     public static void main(String[]args){
//         HashSet<String> sub=new HashSet<>();
//         sub.add("Java");
//         sub.add("Python");
//         sub.add("Java");
//         sub.add("C++");
//         sub.add("Python");
//         sub.add("SQL");
//         System.out.println(sub);
//         System.out.println(sub.contains("Java"));
//         sub.remove("Python");
//         System.out.println(sub);
//         System.out.println(sub.size());

//     }
// }

// public class J{
//     public static void main(String[]args){
//         PriorityQueue<Integer> num=new PriorityQueue<>();
//         num.offer(40);
//         num.offer(10);
//         num.offer(50);
//         num.offer(20);
//         num.offer(30);
//         System.out.println(num.peek());
//         num.poll();
//         System.out.println(num.peek());
//         System.out.println(num.size());


//     }
// }

public class J{
  static class Book implements Comparable<Book>{
    int price;
    Book(int price){
      this.price=price;
    }
    public int compareTo(Book other){
        return this.price-other.price;
    }
    }
    public static void main(String[]args){
        Book b1=new Book(500);
        Book b2=new Book(300);
        Book b3=new Book(800);
        System.out.println(b1.compareTo(b2));
        System.out.println(b2.compareTo(b3));
          }
}  
