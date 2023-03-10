/**
 * CS102-03  Lab0_Q2   05/02/23
 * Contributors: Ömer Edip Aras, İbrahim Çaycı, Mustafa Çağlar, and Yiğit Özhan 
 * Distributions of methods will be added to README file.
 * This program is menu-driven console application that allows users to create and modify an array with a proper console design.
 */
public class Methods {
    
    /**
     * DONE BY YİĞİT ÖZHAN
     * This method creates an array whose numbers are randomly selected.
     * @param arraySize size of the array that we are creating.
     * @return randomly determined integer array.
    */
    public int[] createArray(int arraySize){
        // int begin = 0; int end = 101
       int array[] = new int[arraySize];
       for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 101); 
       }
       return array;
    }

    /**
     * DONE BY YİĞİT ÖZHAN
     * This method finds the gratest element in an array
     * @param array 
     * @return the greatest integer of an array
     */
    public int getMaxNumber(int [] array){
        if (array.length == 0) {
            return 0;
        }
        int max = array[0];
        for (int element: array) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }

    /**
     * DONE BY YİĞİT ÖZHAN
     * This method finds the smallest element in an array
     * @param array 
     * @return the smallest integer of an array
     */
    public int getMinNumber(int [] array){
        if (array.length == 0) {
            return 0;
        }
        int min = array[0];
        for (int element: array) {
            if (min > element) {
                min = element;
            }
        }
        return min;
    }

    /**
     * DONE BY ÖMER EDİP ARAS
     * This method finds the AVERAGE INTEGER and then creates a new array by substracting this average number from each element.
     * example {1,2,3,4,5,6} ave = 3  newArray = {-2,-1,0,1,2,3}
     * @param array
     * @return the modified / substracted array
     */
    public int [] modifiedArray(int [] array){    
        // calculating the average
        int sum = 0; 
        for(int element: array)
        {
            sum += element;
        }
        int average = sum / array.length;
          
        // substracting average from each element and returning the modified array. 
        int [] modifiedArray = new int [array.length];
        for(int i = 0; i < array.length;i++)
        {
            modifiedArray[i] = array[i] - average; 
        }
        return modifiedArray;
    }

    /**
     * DONE BY MUSTAFA ÇAĞLAR
     * This method calculates the sum of the array elements with even indexes 
     * @param array
     * @return returns the elements of the array with even indexes.
     */
    public int sumOfEven(int [] array){
        int totalSumOfEven = 0;
        
        for(int i = 0;i < array.length;i++)
        {
            if(i % 2 == 0)
            {
                totalSumOfEven += array[i];
            }
        }
        return totalSumOfEven;
    }

    /**
     * DONE BY MUSTAFA ÇAĞLAR
     * This method calculates the sum of the array elements with odd indexes 
     * @param array
     * @return returns the elements of the array with odd indexes.
     */
    public int sumOfOdd(int [] array){
        int totalSumOfOdd = 0;
        
        for(int i = 0;i < array.length;i++)
        {
            if(i % 2 == 1)
            {
                totalSumOfOdd += array[i];
            }
        }
        return totalSumOfOdd;

    }
}
