package oppgave_1;

import java.util.Scanner;

public class gjennomsnitt{
    public static void main(String[] args) {
        //her gir vi brukeren muligheten til å angi tallene
        System.out.println("angi første tall i rekken av tre");
        Scanner input = new Scanner(System.in);
        double tall_1= input.nextDouble();

        System.out.println("angi andre tall i rekken av tre");
        double tall_2= input.nextDouble();

        System.out.println("angi siste tall i rekken av tre");
        double tall_3=input.nextDouble();

        //nå skal vi regne ut snittet

        double snitt=(tall_1+tall_2+tall_3)/3;
        System.out.println("Gjennomsnittet av "+tall_1+" "+tall_2+" "+tall_3+" er "+snitt);


    }
}