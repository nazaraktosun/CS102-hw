import java.util.Scanner;

public class test {
    
    public static void main(String[] args) {
        int option;
        Scanner input = new Scanner(System.in);

        do {
        System.out.println("\n1-Find the minimum number and the maximum of the array\n2-Find the average of the array\n3-Find the sum of elements with odd and even numbered indexes\n0-Exit!\n");
        option = input.nextInt();
        } while (option !=0);
        if (option == 1) {
            System.out.println("1");
        } 
        if (option == 2) {
            System.out.println("2");
        }
        if (option == 3) {
            System.out.println("3");
        }
        if (option == 0) {
            System.out.println("Goodbye!");
        }
        
    }

    }
