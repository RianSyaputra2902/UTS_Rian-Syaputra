package uts_riansyaputra;
import java.util.Scanner;
public class TransposeMatrix {
     public static void main(String[] args){
        int i,j,m,n,o,p;
        int matriks[][] = new int [10][10];
        int transpose [][] = new int [10][10];
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Baris Matriks A: ");
        m = scan.nextInt();
        System.out.print("Masukkan Jumlah Kolom Matriks A : ");
        n = scan.nextInt();
        System.out.println("Masukkan Elemen Matriks A: ");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                matriks[i][j] =scan.nextInt();   
            }
        }
        System.out.println("Hasil Matriks A : ");
        for (i=0; i<m;i++){
            for(j=0;j<n;j++){
                System.out.print(matriks[i][j] + "\t");
            }
            System.out.println();
        }
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                transpose[j][i]=matriks[i][j];
            }
        }
        System.out.println("Hasil Transpose Matriks A: ");
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                System.out.print(transpose[i][j] + "\t");
            }
            System.out.println();
        }
    
        
        System.out.print("Masukkan Jumlah Baris Matriks B: ");
        o = scan.nextInt();
        System.out.print("Masukkan Jumlah Kolom Matriks B : ");
        p = scan.nextInt();
        System.out.println("Masukkan Elemen Matriks B: ");
        for(i=0;i<o;i++){
            for(j=0;j<p;j++){
                matriks[i][j] =scan.nextInt();   
            }
        }
        System.out.println("Hasil Matriks B : ");
        for (i=0; i<o;i++){
            for(j=0;j<p;j++){
                System.out.print(matriks[i][j] + "\t");
            }
            System.out.println();
        }
        for(i=0;i<o;i++){
            for(j=0;j<p;j++){
                transpose[j][i]=matriks[i][j];
            }
        }
        System.out.println("Hasil Transpose Matriks B: ");
        for(i=0;i<p;i++){
            for(j=0;j<o;j++){
                System.out.print(transpose[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
}
