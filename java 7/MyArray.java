// Design a generic class MyArray with add(),grow() and swap().
// add() adds the element to the array at last index.
// grow() increases the initial size by 1.5 tomes.
// grow() should be called within the add() when the size is exhausted.Declare grow() as private.
// swap() swaps elemnts the array given two indices.
class MyArray<T> {
    T[] array;
    public int size;
    public int capacity;

    public MyArray() {
        this.capacity = 4;
        this.size = 0;
        array = (T[]) new Object[capacity];
    }

    public void add(T n) {
        if (size == capacity) {
            grow();
        }
        array[size] = n;
        size++;
    }

    public void grow() {
        capacity = (int) (capacity * 1.5);
        T[] newarray = (T[]) new Object[capacity];
        System.arraycopy(array, 0, newarray, 0, size);
        array=newarray;
    }

    public T get(int index) {
        return array[index];
    }

    public void swap(int index1, int index2) {
        if (index1 >= 0 && index1 < size && index2 >= 0 && index2 < size) {
            T temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
        } 
    }

}