/**
 * class for creating dynamic arrays of integers(array that can change its size
 * if needed)
 */
public class DynamicArray {
	int[] array;
	private int count;
	final int INIT_SIZE = 5;

	/**
	 * constructor method for creating objects of type DynamicArray with one
	 * parameter, size of array
	 * 
	 * @param integer
	 *            that represents the size of array that will be created
	 */
	public DynamicArray(int size){
	this.array=new int[size];
	private count=0;
}

	/**
	 * constructor method for creating objects of type DynamicArray without
	 * parameters(default constructor). It creates the array with default
	 * size(value of INIT_SIZE constant)
	 */
	public DynamicArray() {
		this.array = new int[INIT_SIZE];
		count = 0;
	}

	/**
	 * method that returns the number of elements in array
	 * 
	 * @return value of variable count
	 */
	public int getSize() {
		return count;
	}

	/**
	 * method for adding the new element in array. First it checks if array is
	 * already full, and if that's true, it calls method for resizing array, so
	 * it can take new element.
	 * 
	 * @param integer
	 *            that represents element that will be added to array
	 */
	public void add(int newNumber) {
		if (count == array.length) {
			resize();
		}
		array[count] = newNumber;
		count++;

	}

	/**
	 * method for resizing the array(it doubles the size of original array). It
	 * creates new array, copies the elements from original array to this new
	 * one, and then sets the reference from an original array to point to the
	 * newly created array.
	 */
	private void resize() {
		int[] arr2 = new int[array.length * 2];
		for (int i = 0; i < array.length; i++) {
			arr2[i] = array[i];
		}
		array = arr2;
	}

	/**
	 * returns the array element with index passed as the parameter
	 * 
	 * @param index
	 *            of array element that will be returned
	 * @return array element whose index is passed as parameter
	 */
	public int getAt(int index) {
		if (index < 0 || index >= count) {
			throw new IndexOutOfBoundsException();
		} else
			return array[index];
	}

	/**
	 * method for removing array element with index passed as the parameter
	 * (moves all the elements that are on the right side from element with
	 * given index for one place to the left).
	 * 
	 * @param index
	 *            of array element that will be removed
	 */
	public void removeAt(int index) {
		if (index < 0 || index >= count) {
			throw new IndexOutOfBoundsException();
		} else {
			for (int i = index; i <= count; i++) {
				array[i] = array[i + 1];
			}
			count--;
		}
	}

	/**
	 * method that creates and returns new array which is populated only with
	 * those elements of initial array that are added after inicialization
	 * 
	 * @return array of integers
	 */
	public int[] toArray() {
		int[] newArray = new int[count];
		for (int i = 0; i < count; i++) {
			newArray[i] = array[i];
		}
		return newArray;
	}

}
