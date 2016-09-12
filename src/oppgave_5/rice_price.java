package oppgave_5;


import java.util.Scanner;
public class rice_price {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //spør etter vekt og pris
        System.out.println("Angi første vekt i gram, mellomrom, og så første pris i kroner. ");

        double weight1 = input.nextDouble();
        double price1 = input.nextDouble();
        double value1 = (price1/weight1);

        System.out.println("Angi andre vekt i gram, mellomrom, og så andre pris i kroner. ");

        double weight2 = input.nextDouble();
        double price2 = input.nextDouble();
        double value2 = (price2/weight2);

        if (value1 > value2){
            System.out.println("Pakke nr. 2 gir mest for penga.");
        }

        if (value1 < value2){
            System.out.println("Pakke nr. 1 gir mest for penga.");
        }

        if (value1==value2){
            System.out.println("Kilosprisen er den samme på pakkene.");
        }


    }
}
