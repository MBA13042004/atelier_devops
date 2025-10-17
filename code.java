import java.util.Scanner;

class BankAccount {
    private String accountHolder;
    private double balance;

    // Constructeur
    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    // Méthode pour déposer de l'argent
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Déposé : " + amount + "€");
        } else {
            System.out.println("Montant invalide pour le dépôt.");
        }
    }

    // Méthode pour retirer de l'argent
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Retiré : " + amount + "€");
        } else if (amount > balance) {
            System.out.println("Fonds insuffisants pour le retrait.");
        } else {
            System.out.println("Montant invalide pour le retrait.");
        }
    }

    // Méthode pour afficher le solde
    public void displayBalance() {
        System.out.println("Solde actuel : " + balance + "€");
    }

    // Méthode pour obtenir le titulaire du compte
    public String getAccountHolder() {
        return accountHolder;
    }
}

public class BankSimulator {
    public static void main(String[] args) {
        // Scanner pour lire les entrées de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Créer un compte bancaire avec un solde initial
        System.out.print("Entrez le nom du titulaire du compte : ");
        String name = scanner.nextLine();
        BankAccount account = new BankAccount(name, 1000); // Solde
