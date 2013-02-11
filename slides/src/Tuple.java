/*
 * Tuple class
 * @Author Tyler Robison  @ Washington State University
 * @Author KLM
 *
 * This class is primarily an example using generics.
 * Perhaps most importantly, it demonstrates how to allocate generic arrays.
 *
 * It defines a 'Tuple' class that lets the user create a list of size n of type T, and get/set to those indices.
 *
 */

public class Tuple<T> {
    //the array in which we'll store our tuple data (and the length of the tuple)
    private T[] arr;

    //pass in the # of elements in the tuple
    public Tuple(int n) {
        //this statement causes a type-safety warning; don't worry about it
        //if it bothers you, you can 'suppress' this warning
        arr = (T[]) new Object[n];
    }

    //returns the tuple item stored at index i, or throws an exception if that index is out of range
    public T get(int i) {
        if (i < 0 || i >= arr.length) {  // should "throw" an error
            System.err.println("Supplied index " + i + " is out of bounds for 'get'");
            System.exit(-1);
        }
        return arr[i];
    }

    //stores the item at index i, or throws an exception if that index is out of range
    public void set(int i, T t) {
        if (i < 0 || i >= arr.length) { // should "throw" an error
            System.err.println("Supplied index " + i + " is out of bounds for 'set'");
            System.exit(-1);
        }
        arr[i] = t;
    }

    //returns 'n'; the length of the tuple
    public int getN() {
        return arr.length;
    }
}