import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Opgave3 {
    public static void main(String[] args) {
        int[] array = new int[10];
        udskriv(array);
    }
    public static int udskriv(int a[]) {
        Scanner ind = new Scanner(System.in);
        int tal = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = ind.nextInt();
            tal = a[i];

        }
        return tal;
    }

    public static void skrivTilFil(int[] a,int antal) throws FileNotFoundException {
        PrintWriter ud=new PrintWriter("src/Tal3.dat");
        for(int i=0;i<antal;i++){
            ud.print(a[i]+" ");
            so
        }
        ud.close();
    }
}
