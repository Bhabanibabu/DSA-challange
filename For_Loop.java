package Lecture_2;

import java.util.*;
    public class For_Loop{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for (int i=0; i<n; i++) {
                for (int j=0; j<n; j++) {
                    System.out.print( "*");
                }
                System.out.println();
            }
        }
    }
