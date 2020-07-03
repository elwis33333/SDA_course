package zaj16_02.kg.table;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Table2D {

    public static final int SIZE_1= 10;
    public static final int SIZE_2 = 10;

    public static void main(String[] args) {
        int[][] tab2D = new int[SIZE_1][SIZE_2];
        Random random = new Random();
        putIntsToTab(random, tab2D);
//        printTab(tab2D);
        transpozeTab(tab2D);
        createTree(6);
    }

    private static void putIntsToTab(Random random, int[][] tab2D) {
        for (int i = 0; i < tab2D.length; i++) {
            for (int j = 0; j < tab2D[i].length; j++) {
                tab2D[i][j]=random.nextInt(100);
            }
        }
    }

    public static void printTab(int[][] tab2D){
        for (int i = 0; i < tab2D.length; i++) {
            for (int j = 0; j < tab2D[i].length; j++) {
                System.out.print(tab2D[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void transpozeTab(int[][] tab2D){
        int[][] tabTrans = new int[SIZE_1][SIZE_2];
        for (int i = 0; i < tab2D.length; i++) {
            for (int j = 0; j < tab2D[i].length; j++) {
                tabTrans[j][i] = tab2D[i][j];
            }
        }
        printTab(tab2D);
        System.out.println();
        printTab(tabTrans);

    }

    public static void createTree(int h){
        for (int i = 2; i < h; i++) {
            treInTree(i,h);
        }
//       treInTree(h);
//        for (int i = 1; i < h; i++) {
//            for (int j = 0; j < 2*h-1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

    }

    private static void treInTree(int h,int c) {
        for (int i =1 ;i<=h;i++) {
            for (int j = c; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
