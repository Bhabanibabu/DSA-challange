package Lecture_1;

public class Pree_inc {
    public static void main(String[] args) {
        int a=6;
        //int b=a++ + a-- + ++a - ++a + a;
        int c=a++ + a++ - ++a + ++a + --a;

        System.out.println(c);
    }
}
