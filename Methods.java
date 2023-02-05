/**
 * CS102-03  Lab0_Q2   05/02/23
 * Contributors: Ömer Edip Aras, İbrahim Çaycı, Mustafa Çağlar and Yiğit Özhan 
 * Distributions of methods will be added to README file.
 * This program is menu-driven console application that allows users to create and modify an array with a proper console design.
 */
public class Methods {
    
    /**
     * This method creates an array whose numbers are randomly selected.
     * @param arraySize size of the array that we are creating.
     * @return randomly determined integer array.
    */
    public int createArray(int arraySize){
       /* TODO */ 
    }

    /**
     * This method finds the gratest element in an array
     * @param array 
     * @return the greatest integer of an array
     */
    public int getMaxNumber(int [] array){
         /* TODO */ 
    }

    /**
     * This method finds the smallest element in an array
     * @param array 
     * @return the smallest integer of an array
     */
    public int getMinNumber(int [] array){
         /* TODO */ 
    }

    /**
     * DONE BY ÖMER EDİP ARAS
     * This method finds the AVERAGE INTEGER and then creates a new array by substracting this average number from each element.
     * example {1,2,3,4,5,6} ave = 3  newArray = {-2,-1,0,1,2,3}
     * @param array
     * @return the inverted / substracted array
     */
    public int [] invertedArray(int [] array){
          
          // calculating the average
          int sum = 0; 
          for(int element: array)
          {
               sum += element;
          }
          int average = sum / array.length;
          
          // substracting average from each element and returning the modified array. 
          for(int i = 0; i < array.length;i++)
          {
               array[i] -= average; 
          }
          return array;
    }

    /**
     * This method calculates the sum of the array elements with even indexes 
     * @param array
     * @return returns the elements of the array with even indexes.
     */
    public int sumOfEven(int [] array){

    }

    /**
     * This method calculates the sum of the array elements with odd indexes 
     * @param array
     * @return returns the elements of the array with odd indexes.
     */
    public int sumOfOdd(int [] array){

    }



}