import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Citirea numărului de preparate
        System.out.println("Enter the number of dishes available:");
        int nrPreparatelor = in.nextInt();

        Preparat[] preparate = new Preparat[nrPreparatelor];

        // Crearea preparatelor
        preparate[0] = new Pizza();
        preparate[1] = new Pizza(35, "Diavola");
        preparate[2] = new Drinks();
        preparate[3] = new Drinks("Coca-Cola", 15);
        preparate[4] = new Desert();
        preparate[5] = new Desert("Baclava", 12);

        System.out.println("Numărul total de preparate este: " + preparate.length);

        // Afișarea preparatelor disponibile
        System.out.println("Preparate disponibile:");
        for (Preparat preparat : preparate) {
            if (preparat != null) {
                System.out.println(preparat.getDetails());
            }
        }

        // Crearea clienților
        Client c1 = new Client("Vasile");
        Client c2 = new Client("Maria");

        // Crearea comenzilor
        Comanda comanda1 = new Comanda();
        comanda1.addPreparat(preparate[0]);
        comanda1.addPreparat(preparate[2]);

        Comanda comanda2 = new Comanda();
        comanda2.addPreparat(preparate[1]);
        comanda2.addPreparat(preparate[4]);

        comanda2.setStatus("Livrat");

        // Asignarea comenzilor clienților
        c1.addComenzi(comanda1);
        c2.addComenzi(comanda2);

        // Afișarea comenzilor nelivrate
        Comanda[] comenzi = {comanda1, comanda2};
        Comanda.listComandaStatus(comenzi);

        // Afișarea sumei totale plătite de un client
        c1.totalSum();
        c2.totalSum();
}}
