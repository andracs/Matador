import java.util.Scanner;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 13/10/2021
 */

public class Test {

    public static void main(String[] args) {
        User user1 = new User();
        User user2 = new User();
        User user3 = new User();
        AlleBrugere alle = new AlleBrugere();

        AlleBrugere.userListe[0] = user1;
        AlleBrugere.userListe[1] = user2;
        AlleBrugere.userListe[2] = user3;

        AlleBrugere.userListe[0].navn = "Tim";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Skriv bruger 2's navn: ");
        AlleBrugere.userListe[1].navn = scanner.nextLine();

        System.out.println("Bruger 1 er " +  AlleBrugere.userListe[0] );
        System.out.println("Bruger 2 er " +  AlleBrugere.userListe[1] );

    }

}
