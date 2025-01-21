package patterns;

//
//              ****   **** 
//             ****** ******
//             *************
//              ***********
//               *********
//                *******
//                  ***  
//                   *

public class Heart {
    public static void main(String[] args)  {
        int n=3;
        int flg=4;
        int x=2;


        // upper part
        System.out.println();
        for(int i=0; i<x; i++) {
            for(int j=0; j<x-i-1; j++)  {
                System.out.print(" ");
            }
            for(int j=0; j<flg; j++)  {
                System.out.print("*");
            }
            for(int j=0; j<n; j++)  {
                System.out.print(" ");
            }
            for(int j=0; j<flg; j++)  {
                System.out.print("*");
            }
            System.out.println();
            n-=2;
            flg+=2;
        }


        n=4;
        flg=13;
        // lower triangle
        for(int i=0; i<n; i++) {
            for(int j=0; j<i; j++) {
                System.out.print(" ");
            }
            for(int j=0; j<flg; j++)  {
                System.out.print("*");
            }
            flg-=2;
            System.out.println();
        }

        flg=3;
        n=5;
        // lowest small triangle
        for(int i=0; i<2; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(" ");
            }
            for(int j=0; j<flg; j++)  {
                System.out.print("*");
            }
            n++;
            flg-=2;
            System.out.println();
        }
   

          
    }
}
