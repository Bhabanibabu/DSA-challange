package Lecture_1;

public class Post_inc {
    public static void main(String[] args) {
        int a=10;
        int b=a++ + a;
        System.out.println(b);
        System.out.println(a++);
        System.out.println(a);
    }
}
