/*----------------------------------------------------------
 *                 HTL-Leonding / Klasse: 1xHITM
 * ----------------------------------------------------------
 * Übungsnr.:   04
 * Übungstitel: GrownUpCalculator
 * Autoren:     Quirin Ecker
 * Version:     1.0
 * Datum:       12.12.2017
 * ----------------------------------------------------------
 * Kurzbeschreibung:
 * Ausrechnung des Gewichtes zu jeder Woche mit einer Diät
 * aus einem Artikel.
 * ----------------------------------------------------------
 * Beschreibung der grundlegenden Lösungsidee:
 * ...
 *
 * ----------------------------------------------------------
*/

import java.util.Scanner;

public class Ecker_Idealgewicht {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weight;
        double idealWeight;
        double currentWeight;
        int week = 0;

        System.out.print("Ihr aktuelles Gewicht (in kg)?: ");
        weight = scanner.nextDouble();
        System.out.print("Ihr Idealgewicht      (in kg)?: ");
        idealWeight = scanner.nextDouble();

        currentWeight = weight;

        while (currentWeight > idealWeight){
            week++;
            currentWeight = currentWeight - currentWeight * 0.02;
            System.out.printf("%2d. Woche %20.1f kg \n" , week , currentWeight);
        }

    }
}
