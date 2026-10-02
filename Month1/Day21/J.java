import java.util.*;
public class J{
    public static void main(String[]args){
        HashMap<String, Integer> marks=new HashMap<>();
        marks.put("Anshika", 85);
        marks.put("Riya", 92);
        marks.put("Neha",88);
        String topper="";
        int maxMarks=Integer.MIN_VALUE;
        for(Map.Entry<String, Integer> entry : marks.entrySet()){
            if(entry.getValue()>maxMarks){
                maxMarks=entry.getValue();
                topper=entry.getKey();
            }
        }
        System.out.println(topper + " " + maxMarks);
    }
}