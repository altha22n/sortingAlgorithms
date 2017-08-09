import java.util.Arrays;

/** 
 * InsertionSorter class implements the Sorter interface.
 * @author Nada Al-Thawr
 */
public class InsertionSorter implements Sorter {

	/** 
	 * Constructor
	 */
	public InsertionSorter() { 
		// nothing needs to be done
	}
	
	/**
	 * Uses the insertion sort algorithm to modify the passed-in array
	 * so that its elements are in ascending, sorted order.
	 * Prints out the current state of array for each iteration (each 
	 * time the index marking the "sorted" section of the array is updated). 
	 * Assumes that the passed-in array is an array of int elements.
	 */
	public void sortArrayInPlace(int[] array) {
		int j;
		
		//walking the array and setting i as one because our
		//first element is already sorted and has no elements to 
		//its left to compare to
		for (int i=1; i < array.length; i++) {
			//saving the values in the array we are testing 
			//in a temporary value
			int temp = array[i];
			//we have two nested loops: the first one where we use i is called 
			//the outter loop, and the second one is called the inner loop (j)
			//j starts from the element after i, which is why it's i-1
			//it can be considered like what marks our sorted line that compares  
			//the elements before the sorted line, and that's why it decremens  
			//because it goes to i's left

			//if j is bigger than or equal to zero( which means 
			//it hasn't reached the end of the list) 
			//AND our temp value is smaller than the array
			//our temporary value
			for ( j=i-1; j>=0 && temp < array[j]; j--) {
				//swap the values
				array [j+1] = array[j];
			}
			//we update our temporary value to the next element in the array
			array[j+1] = temp;
		
			//print all the steps of the sorting until it's completely sorted
			System.out.println( "Step " + (i)+ ".." + Arrays.toString(array));
		}
	}
} 
	
	


