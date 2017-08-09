import java.util.Arrays;

/** 
 * SelectionSorter class implements the Sorter interface.
 * @author Nada Al-Thawr
 */
public class SelectionSorter implements Sorter {

	/** 
	 * Constructor
	 */
	public SelectionSorter() { 
		// nothing needs to be done
	}
	
	/**
	 * Uses the selection sort algorithm to modifies the passed-in 
	 * array so that its elements are in ascending, sorted order.
	 * Prints out the current state of array for each iteration (each 
	 * time the index marking the "sorted" section of the array is updated).
	 * Assumes that the passed-in array is an array of int elements.
	 */
	public void sortArrayInPlace(int[] array) {
		//walking the array and setting i as 0
		for (int i = 0; i < array.length; i++) {
			//we set a minimum value to set as i
			int minValue;
			minValue = i;
			//our inner loop that starts at the first unsorted item
			//starting from from the element on the right
			for ( int j = i + 1; j < array.length; j++){
				//if the element we're testing is smaller than our minVallue
				//which is our first element
			if ( array[j] < array[minValue]) {
				//then we update out minimum value
				//and increment and update
				minValue = j;
			}
		}
		// if our minvalue is not equal to i
		if ( minValue != i) {
			//we create a temporary value and place i there
			 int temp = array[i];
			 //then change the minimum value and swap
			array[i] = array[minValue];
			array[minValue] = temp;
		}
			//print all the steps of the sorting until it's completely sorted
			System.out.println( "Step " + (i+1)+ ".." + Arrays.toString(array));
	}

	}
}
	



