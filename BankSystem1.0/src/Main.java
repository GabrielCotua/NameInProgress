import java.util.Scanner;

public class Main {
    User user = new User();
    public static boolean correctAns = false;

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Bienvenido a BankOfCotua.");
        System.out.println("Tiene una cuenta con sonotros?");
        while(correctAns) {
            String ans = Scanner.nextLine();
            switch (ans.toLowerCase()) {
                case "y":
                    logIn();
                    break;
                case "n":
                    createAccount();
                    break;
                default:
                    System.out.println("Perdona, no entendi, por favor intentelo de nuevo");
            }
        }
    }

    public static void logIn() {
        System.out.println("escriba su nombre de usuario:");

        correctAns = true;
    }

    public static void createAccount() {
        System.out.println("Quisiera crear una cuenta?");
        correctAns = false;
    }

}