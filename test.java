import java.util.Scanner;


int[] Array = new int[]{ 1,2,3,4,5,6,7,8,9,10 };

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

    public static void findMin(){

        int min = array[0];

        for ( int i = 0; i < array.length ; i++ ){

            if( array[i] < min ){

                min = array[i];

            }
        }
    }

    public static void findMax(){

        int max;
        
        for ( int i = 0; i < array.length ; i++ ){

            if( array[i] > max ){

                max = array[i];
            }
        }

    }


    public static void sum(){
        int evenSum=0;
        int oddSum=0;
        for(int i= 0; i< array.length; i=i+2){
            evenSum += array[i];
        }
        System.out.println("The sum of even indexes is: " + evenSum);

        for(int i= 1; i< array.length; i =i+2){
            oddSum += array[i];
        }
        System.out.println("The sum of the odd indexes is: " + oddSum);

    }
