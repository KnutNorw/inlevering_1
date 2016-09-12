package oppgave_3;
import java.util.Scanner;

public class rock_paper_scissor {
    public static void main(String[] args) {

        //her gir vi brukeren muligheten til å velge først
        System.out.println("vil du være saks (0), stein (1) eller papir (2)?");
        Scanner input = new Scanner(System.in);
        int tipper= input.nextInt();

        //her ber vi maskinen lage et tilfeldig tall mellom 0 og 2
        int fasit = (int)(Math.random ()*3);

        //nå skal vi sjekke om det ble gjettet rett
        //bruker valgte saks
        if (tipper == 0) {
            System.out.println("Du er saks. ");
            if (fasit == 1) {
                System.out.println("jeg er stein. Jeg vinner! :-D");
            }
            if (fasit == 2) {
                System.out.println("jeg er papir. Du vinner! ;-)");
            }
            if (fasit == 0) {
                System.out.println("jeg er også saks. Uavgjort :-(");
            }
        }
        //bruker valgte stein
        if (tipper == 1) {
            System.out.println("Du er stein. ");
            if (fasit == 2) {
                System.out.println("jeg er papir. Jeg vinner! :-D");
            }
            if (fasit == 0) {
                System.out.println("jeg er saks. Du vinner! ;-)");
            }
            if (fasit == 1) {
                System.out.println("jeg er også stein. Uavgjort :-(");
            }
        }


        //bruker valgte papir
        if (tipper == 2) {
            System.out.println("Du er papir. ");
            if (fasit == 0) {
                System.out.println("jeg er saks. Jeg vinner! :-D");
            }
            if (fasit == 1) {
                System.out.println("jeg er stein. Du vinner! ;-)");
            }
            if (fasit == 2) {
                System.out.println("jeg er også papir. Uavgjort :-(");
            }
        }
    }

}

