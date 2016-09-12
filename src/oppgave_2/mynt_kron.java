package oppgave_2;
import java.util.Scanner;

public class mynt_kron {

    public static void main(String[] args) {
        //her gir vi brukeren muligheten til å tippe
        System.out.println("tipper du det blir mynt (0) eller kron (1)?");
        Scanner input = new Scanner(System.in);
        int tipper= input.nextInt();

        //her ber vi maskinen lage et tilfeldig tall mellom 0 og 1
        int fasit = (Math.random ()<0.5)?0:1;

        //nå skal vi sjekke om det ble gjettet rett

        if (tipper == fasit){
            System.out.println("Du gjettet riktig!");}
        else{
            System.out.println("Du gjettet feil :(");}


    }
}

