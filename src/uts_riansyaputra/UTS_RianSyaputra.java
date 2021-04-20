package uts_riansyaputra;
import java.util.Scanner;
public class UTS_RianSyaputra {
    public static void searching(int []O){
          
      System.out.println("****************************************************");
     
      int key;
      int IndeksPertama = 0;
      int IndeksLast = O.length - 1;
      int ketemu = 0;
      int point = 0;
      
      
      
      System.out.println("");
      System.out.println("");
      
        Scanner scan = new Scanner(System.in);
            System.out.print("Masukkan Data yang Anda Cari : ");
            key = scan.nextInt();
      
      System.out.println(" Isi Datanya Adalah : ");
      for (int i = 0; i< O.length; i++){
          System.out.print(O[i] + " ");
      }
      
      System.out.println("");
      
      while ((IndeksPertama <= IndeksLast) && (ketemu == 0)){
          point = (IndeksPertama + IndeksLast) / 2;
          System.out.println("Indeks Pointer :  " + point);
          if (key == O[point]){
              ketemu = 1;
              
              System.out.println(" Data " + key + " Telah ditemukan pada indeks ke - " + point);
              
          }
          else if (key < O[point]){
              System.out.println("Cari Dikiri");
              IndeksLast = point - 1;
          }
          
          else{
              IndeksPertama = point+1;
              System.out.println("Cari di Kanan");
              
          }
      }
      if(ketemu == 1)
          System.out.println("Kesimpulan : Selamat, Data yang anda cari ditemukan");
      else
          System.out.println("kesimpulan : Mohon Ma'af, Data yang Anda Cari Tidak Ditemukan  ");
    }
      public static void selectionSort(int[] A) {
        int smallindex;
        int pass, j, n=A.length;
        int temp;
        
        for(pass=0; pass<n-2; pass++){
            smallindex=pass;
            for(j=pass+1; j<n; j++){
                if(A[j]<A[smallindex]){
                    smallindex=j;
                }
            }
            temp=A[pass];
            A[pass] = A[smallindex];
            A[smallindex] = temp;
        }
    }
       public static void tampil(){
        System.out.println("*************** Ulangan Tengah Semester 2 *************** "+"\n");
        System.out.println();
        System.out.println("Nama : Rian Syaputra" + "\n");
        System.out.println("Kelas 2D"+"\n");
        System.out.println("Mata Kuliah : Algoritma dan Struktur Data 2"+"\n");
        
        System.out.println();
        System.out.println("************************************************" + "\n");
        System.out.println();
        System.out.println();
        System.out.println("Urutkan data berikut dari Terkecil ke Terbesar : ");
    }
        public static void tampilan(){
         System.out.println("Data yang sudah urut : " );
     }
       public static void screen(int data[]) {
        
        for (int i = 0; i < data.length;i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
    
    public static void main (String[] args){
        int O[] = {3, 10, 4, 2, 8, 13};
        UTS_RianSyaputra.tampil();
        UTS_RianSyaputra.screen(O);
        UTS_RianSyaputra.selectionSort(O);
        UTS_RianSyaputra.searching(O);
    }
}    