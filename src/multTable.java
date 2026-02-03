import java.util.Scanner;
public class multTable {
    static void printTable(int number){
        for(int i = 1; i <= 12; i++){
            System.out.println(number + "X" + i + " = " + (number)*(i));



        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = input.nextInt();
        printTable(number);

    }
}
