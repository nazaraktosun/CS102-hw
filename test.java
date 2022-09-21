import java.util.Scanner;


public class test {
    static int[] array = new int[]{ 12,3,64,52,6,17,8,94,10 };
    
    public static void main(String[] args) {

        int option;
        Scanner input = new Scanner(System.in);

        do {
        System.out.println("\n1-Find the minimum number and the maximum of the array\n2-Find the average of the array\n3-Find the sum of elements with odd and even numbered indexes\n0-Exit!\n");
        option = input.nextInt();
        if (option == 1) {
            System.out.println( findMin() + "&" + findMax() );

        } 
        else if (option == 2) {
            System.out.println("2");
        }
        else if (option == 3) {
            System.out.println("3");
        }
    }while(option != 0 );
        if (option == 0) {
            System.out.println("Goodbye!");
        }
        
    }

    public static int findMin(){

        int min = array[0];

        for ( int i = 0; i < array.length ; i++ ){

            if( array[i] < min ){

               min = array[i];

            }

        }
        return min;
    }

    public static int findMax(){

        int max =0;
        
        for ( int i = 0; i < array.length ; i++ ){

            if( array[i] > max ){

                max = array[i];
            }
        }
        return max;

    }

    }
