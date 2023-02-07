/**
 * CS102-03  Lab0_Q2   05/02/23
 * Contributors: Ömer Edip Aras, İbrahim Çaycı, Mustafa Çağlar and Yiğit Özhan 
 * This program is menu-driven console application that allows users to create and modify an array with a proper console design.
 */
import java.util.Scanner;

public class Management {
    /**
     * DONE BY İBRAHİM ÇAYCI
     * This main method provides an appropriately designed string based or printed user interface 
     * Asks users to type specific characters to perform operations via calling other methods
     * (e.g. 1 to create array 2 to sum up odd indexes etc)
     * Main is said to be obligatory. Therefore I removed display method on the other file.
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int arraySize = scanner.nextInt();
        scanner.nextLine();

        Methods method = new Methods();
        int[] numbers = method.createArray(arraySize);
        
        boolean isExist = false;
        while (!isExist) {
            System.out.println("------------------ MENU ------------------ \n"
                            + "1-) Show the minimum number of the array \n"
                            + "2-) Show the maximum number of the array \n"
                            + "3-) Show the difference of the numbers from the average of the array \n"
                            + "4-) Show the sum of the numbers with odd indexes \n"
                            + "5-) Show the sum of the numbers with even indexes \n"
                            + "6-) Exit \n");
            
            int choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 1) {
                System.out.println(method.getMinNumber(numbers));
            }
            else if (choice == 2) {
                System.out.println(method.getMaxNumber(numbers));
            }
            else if (choice == 3) {
                System.out.println( Arrays.toString(method.invertedArray(numbers)) );
            }
            else if (choice == 4) {
                System.out.println(method.sumOfOdd(numbers));
            }
            else if (choice == 5) {
                System.out.println(method.sumOfEven(numbers));
            }
            else {
                isExist = true;
            }
        }

    }
}
