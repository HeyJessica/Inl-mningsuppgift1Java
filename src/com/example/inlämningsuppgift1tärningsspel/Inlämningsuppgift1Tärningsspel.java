package com.example.inlämningsuppgift1tärningsspel;

import java.util.Scanner;

public class Inlämningsuppgift1Tärningsspel {
    public static void main(String args[]) {


        //Att lägga till: Metoder, highscore-lista i en array, nestad for loop för flera spelare


        Scanner scan = new Scanner(System.in);

        int playerWin = 0;
        int computerWin = 0;
        int antalSidor = 6;
        int summaDator = 0;
        int summaSpelare = 0;
        String spelaIgen;

do {


    // Låt användaren välja antal kast av tärningen. Valet sparas i variabeln antalKast
    System.out.println("Hur många kast vill du ha?");
    int antalKast = scan.nextInt();


    //skapa en array som sparar kasten.
    int[] datorKast = new int[11];
    int[] spelareKast = new int[11];

    int i;
    System.out.print("Dator: " + "\n");
    for (i = 1; i <= antalKast; i++) {

        // det genereras ett slumptal för datorn
        datorKast[i] = (int) (1 + Math.random() * antalSidor);

        // efter varje kast ska resultatet skrivas ut
        System.out.println("Kast nr " + i + ": " + datorKast[i]);

        summaDator += datorKast[i];
    }

    int j;
    System.out.print("\n" + "Spelare: " + "\n");
    for (j = 1; j <= antalKast; j++) {

        // det genereras ett slumptal för spelaren
        spelareKast[j] = (int) (1 + Math.random() * antalSidor);

        // efter varje kast ska resultatet skrivas ut
        System.out.println("Kast nr " + j + ": " + spelareKast[j]);

        // summaSpelare += kastResultat;
        summaSpelare += spelareKast[j];


    }
    System.out.println("\n"+"Vill du spela igen? ja/nej: ");
    spelaIgen=scan.next();

} while(spelaIgen.equals("ja"));{
            // skriver ut vem som vinner och resultat
            System.out.print("\n" + "Resultat spelare: " + summaSpelare + " poäng" + "\n" + "Resultat dator: " + summaDator + " poäng");
            if (summaSpelare > summaDator) {
                System.out.println("\n" + "Du vann!");
                playerWin++;
            } else if (summaSpelare < summaDator) {
                System.out.println("\n" + "Datorn vann.");
                computerWin++;
            } else {
                System.out.println("\n" + "Det blev oavgjort.");
            }

        }


                            /*
                    Du ska göra
            ett tärningsspel
            där man spelar mot datorn.
            Spelet går ut på att man visar poäng
            för varje kast för både spelaren och datorn och vem som vann spelet. Man ska kunna köra
            ett nytt spel så länge applikationen är uppe. (Man kan utöka funkti
            onaliteten som t ex ett
            enkelt Y
            atzy om man vill.)
            Man ska kunn
            a göra inmatningar genom Scanner
            -
            klassen. Du ska använda loopar, if
            -
            satser
            och arrayer
            när du gör applikationen.
            Du ska
            strukturera upp din kod,
            använda metoder,
            och
            namnge variabler utifrån vad vi har gått genom i kursen.
         */


    }
}