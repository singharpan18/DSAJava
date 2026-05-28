package Array.ArrayVeryImportant;

public class aSecondLargestElement  {

    public static int findSecondLargest(int[] arr){

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        if(arr.length < 2){
            return 0;
        }

        for(int i = 0; i < arr.length; i++){

            if(arr[i] > largest){

                secondLargest = largest;
                largest = arr[i];

            } else if(arr[i] > secondLargest && arr[i] != largest){

                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }

    public static void main(String[] args){

        int[] arr = {12, 23, 1, 10, 34, 1};

        int result = findSecondLargest(arr);

        System.out.println("Second Largest Element: " + result);
    }
}