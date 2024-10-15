package com.revature;

public class LinearSearch {

    public static void main(String[] args) {

        //Array of ints to search for
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //use our linear search for a number that exists in the array
        if((linearSearch(arr, 5)) != -1){
            System.out.println("Number found! Array index is: " + linearSearch(arr, 5));
        }

        //use out linear search for a number that doesn't exist in the array
        if((linearSearch(arr, 50)) != -1){
            System.out.println("Number found! Array index is: " + linearSearch(arr, 50));
        } else {
            System.out.println("Number not found!");
        }

    }

    /*Linear Search

    * Simple but inefficient searching algorithm
        -It takes the data structure to search through, and target to search for
    * It works by iterating through the data one by one until the target is found
    * If we find the target value, we return its index
    * If we reach the end of the data and don't find the value, we return -1 */
    public static int linearSearch(int[] arr, int target){

        //we use a for loop to iterate through the array one by one
        for(int i = 0; i < arr.length; i++){

            System.out.println("We are on index: " + i);

            //check if the index is on the value we're looking for
            if(arr[i] == target){
                return i; //value found! return the index.
            }
        }
        //If we reach the end of the for loop, the number wasn't found. return -1
        return -1;
    }

}
