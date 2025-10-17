import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        // Créer un objet Scanner pour lire les entrées de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir deux nombres
        System.out.print("Entrez le premier nombre: ");
        double num1 = scanner.nextDouble();

        System.out.print("Entrez le deuxième nombre: ");
        double num2 = scanner.nextDouble();

        // Calculer la somme des deux nombres
        double sum = num1 + num2;

        // Afficher le résultat
        System.out.println("La somme des deux nombres est: " + sum);

        // Fermer le scanner
        scanner.close();
    }
}
