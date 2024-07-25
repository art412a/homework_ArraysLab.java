public class ArraysLab {
    public static void main(String[] args) {
        System.out.println("Print numers from 1 to 15");
        for (int i = 1; i <= 15; i++) {
            System.out.print(i + " ");
        }
        System.out.println("/n/nPrint even numers from -10 to 20");
        for (int i = -10; i <= 20; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
        System.out.println("\n\nPrint * symbols using given number");
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


            System.out.println("\n\nPrint * symbols using given number in reverse mode");
        //*****
        //****
        //***
        //**
        //*

       for (int i = 0; i < n; i++ ) {
           for (int j = 0; j < n - i; j++) {
               System.out.print("*");

           }
        System.out.println();
         }

            }
    }

































