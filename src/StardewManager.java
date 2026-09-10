import domain.animal.Animal;
import domain.animal.GalinhaMae;
import domain.animal.Ovelha;
import domain.animal.VacaMae;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StardewManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Animal> animais = new ArrayList<>();

        animais.add(new VacaMae(
                101,
                "Mimosa",
                "Holandesa",
                7
        ));

        animais.add(new GalinhaMae(
                102,
                "Giselda",
                "Caipira",
                3
        ));

        animais.add(new Ovelha(
                103,
                "Penelópe",
                "Merino",
                3
        ));

        int opcao;

        do {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("1. Ver animais do curral");
            System.out.println("2. Comércio (Coletar/Retirar produtos)");
            System.out.println("3. Sair");
            System.out.print("\nEscolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    mostrarAnimais(animais);
                    break;

                case 2:
                    comercio(animais);
                    break;

                case 3:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 3);

        scanner.close();
        }

        public static void mostrarAnimais(List<Animal> animais){
            System.out.println("\n--------------------------------------------------");
            System.out.println("             ANIMAIS NO CURRAL:");
            System.out.println("--------------------------------------------------");

            for (Animal animal : animais) {

                System.out.println("[ID: " + animal.getId() + "] "
                                    + animal.getNome()
                                    + " (" + animal.getClass().getSimpleName() + " )");

                System.out.println(" - Raça: " + animal.getRaca());

                System.out.println(" - Idade: " + animal.getIdade()
                                    + " anos | Status: "
                                    + animal.getStatus());

                System.out.println(" - ");
                animal.emitirSom();
            }

            System.out.println("---------------------------------------------------");
        }

        public static void comercio(List<Animal> animais) {
            System.out.println("\n--- COMÉRCIO ---");

            for (Animal animal : animais) {

                System.out.println("\n" + animal.getNome() + ":");
                animal.coletarProduto();
            }
        }
    }
