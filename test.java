import java.util.Scanner;


public class test {
    static int[] array = new int[]{ 12,3,64,52,6,17,8,94,10 };
    
    public static void main(String[] args) {

        int option;
        Scanner input = new Scanner(System.in);

        do {
        System.out.println("\n1-Find the minimum number and the maximum of the array\n2-Find the average of the array\n3-Find the sum of elements with odd and even numbered indexes\n4-Find and display the difference between each element and the sum of the array\n0-Exit!\n");
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
        else if (option == 4) {
          System.out.println("4");
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

    public static void avgDifference(int[] array) {
      int sum = 0;
      int avg;
      
      for (int i = 0; i < array.length ; i++){
        sum += array[i];
      }
      
      avg = sum / array.length;
      
      System.out.println("{");
      
      for ( int i = 0; i < array.length ; i++){
      System.out.print(avg - array[i]);
      }
      
      System.out.print("{");

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
