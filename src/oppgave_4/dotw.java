package oppgave_4;

import java.util.Scanner;

public class dotw {
    public static void main(String[] args) {

        //input av brukerdata
        System.out.println("Angi årstall: (f.eks 2016):");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        System.out.println("Angi måned: 1-12:");
        int mounth = input.nextInt();
        System.out.println("Angi dato: 1-31:");
        int q = input.nextInt();

        /**
         * h=(q+(26(m+1))/10+k+k/4+j/4+5j)%7
         * h= ukedag (0=lørdag til 6=fredag)
         * q=dag i mnd
         * m=måned (OBS! jan=13, feb=14 i året før)
         * j=århundre (årstall/100)
         * k=år i århundre (årstall%100)
         */

        int j = year / 100;
        int k = year % 100;
        int m=mounth;
        if (mounth == 1) {
            m = 13 ; j = j - 1;}
        if (mounth == 2){
            m = 14 ; j=j-1;}

        //her beregnes hvilken ukedag det blir
        int h=(q+(26*(m+1))/10+k+(k/4)+(j/4)+5*j)%7;
        //failproof for ukedag, just in case
        String dotw=("ugyldig dag");

        //System.out.println(h); //formeltest før ferdigstilling

        if (h==0){
            dotw=("lørdag");}
        if (h==1){
            dotw=("søndag");}
        if (h==2){
            dotw=("mandag");}
        if (h==3){
            dotw=("tirsdag");}
        if (h==4){
            dotw=("onsdag");}
        if (h==5){
            dotw=("torsdag");}
        if (h==6){
            dotw=("fredag");}

        //gir output dato på norsk form og ukedagen
        System.out.println(q+"."+mounth+"."+year+" er eller var en "+dotw+".");
    }

}

