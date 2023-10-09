import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class opgave2 {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner in=new Scanner(System.in);
        int[] tabel=new int[10];
        /*System.out.println("Indtast 10 heltal: ");
        for(int i=0;i<10;i++)
            tabel[i]=in.nextInt();*/
        indFraFil(tabel,10);
        udskriv(tabel,10);
        laegTalTil(tabel,10,20);
        skrivTilFil(tabel,10);


    }

    public static void udskriv(int [] a,int antal){
        for(int i=0;i<antal;i++)
            System.out.print(a[i]+" ");
    }

    public static void indFraFil(int [] a,int antal) throws FileNotFoundException {
        File inFil=new File("src/Tal.txt");
        Scanner in=new Scanner(inFil);
        for(int i=0;i<antal;i++){
            a[i]=in.nextInt();
        }
    }

    public static void skrivTilFil(int[] a,int antal) throws FileNotFoundException {
        PrintWriter ud=new PrintWriter("src/Tal2.txt");
        for(int i=0;i<antal;i++){
            ud.print(a[i]+" ");
        }
        ud.close();
    }

    public static void laegTalTil(int [] a,int antal,int tal){
        for(int i=0;i<antal;i++)
            a[i]+=tal;
    }

}
