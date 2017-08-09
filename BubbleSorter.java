import java.util.Arrays;

/** 
 * BubbleSorter class implements the Sorter interface.
 * @author ponbarry
 */
public class BubbleSorter implements Sorter {

	/** 
	 * Constructor
	 */
	public BubbleSorter() { 
		// nothing needs to be done
	}
	
	/**
	 * Uses the bubble sort algorithm to modify the passed-in array
	 * so that its elements are in ascending, sorted order.
	 * Prints out the current state of array each time any two 
	 * elements swap places. 
	 * Assumes that the passed-in array is an array of int elements.
	 */
	public void sortArrayInPlace(int[] array) {
		//set our temp as 0
		int temp=0;
		//i starts at the first element (outter loop)
		//and j starts at the second element (inner loop)
		for (int i = 0; i < array.length-1; i++){
			//we subtract i from the array length for the elements
			//that have been sorted
			for (int j=1; j < array.length-i ; j++) {
				//compare one element to the element next to it
			if (array[j-1] > array[j]) {
				//we use a temp value for the swapping 
				 temp = array[j-1];
				 //swap if the elemnt is smaller 
				array[j-1] = array[j];
				array[j] = temp;
			}

			}
			//print all the steps of the sorting until it's completely sorted
			System.out.println( "Step " + (i+1)+ ".." + Arrays.toString(array));
		}
	}
}
