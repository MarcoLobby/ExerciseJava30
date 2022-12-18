package it.DevelHope.ExerciseJava30;

public class Start {
    public static void main(String[] args) {

        String string1 = "United Kingdom";
        String string2 = "Germany";

        //ASSIGN OF beginIndex AND endIndex
        String sub1 = string1.substring(0,6);
        String sub2 = string1.substring(7,14);

        //ASSIGN THE SUM OF THE 3 STRINGS CREATED BEFORE
        String sub3 = sub1 + " " + string2 + " " + sub2;

        char[] charArray = sub3.toUpperCase().toCharArray();
        System.out.println(charArray);
    }

}
