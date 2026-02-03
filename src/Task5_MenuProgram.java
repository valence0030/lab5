import java.util.Scanner;
import java.time.Year;


    public class Task5_MenuProgram {
        static void sayHello() {
            System.out.println("Hello, welcome!");
        }

        static void showYear() {
            System.out.println("Current year = " + Year.now().getValue());
        }

        static void showMenu() {
            Scanner sc = new Scanner(System.in);
            int choice;
            do{
// Display menu
                System.out.println("\n1. Say Hello");
                System.out.println("2. Show Current Year");
                System.out.println("3. Exit");
                System.out.print("Choose option: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        sayHello();
                        break;
                    case 2:
                        showYear();
                        break;
                    case 3:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
            } while (choice != 3); // repeat until Exit chosen
        }
        public static void main(String[] args) {
            showMenu();
            System.out.println("Welcome to Menu Program");
        }
    }

