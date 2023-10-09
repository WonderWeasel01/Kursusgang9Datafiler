import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        System.out.println("Skriv " + array.length + " tal");
        udskriv(array);
        System.out.println("Summen af array er " + udregnSum(array));
        System.out.println("Array indeholder: ");
        for (int i = 0; i < array.length; i++){
            System.out.print( array[i] + " ");
        }

        System.out.println("\nGennemsnit af array er: " + udregnGennemsnit(array));

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


    public static int udregnSum(int a[]) {
        Scanner ind = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }


    public static double udregnGennemsnit(int a[]) {
        double sum = 0;
        double snit=0;
        for (int i = 0; i < 10; i++) {
            sum += a[i];

            snit = sum / 10.0;
        }
        return snit;
    }
}