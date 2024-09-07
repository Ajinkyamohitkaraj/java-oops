public class main7 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        MyArray<Integer> myarray = new MyArray<>();
        myarray.add(965);
        myarray.add(1002);
        myarray.add(12230);
        myarray.add(4994);

        System.out.println("Array:");
        for (int i = 0; i < myarray.size; i++) {
            System.out.println(myarray.get(i));
        }

        System.out.println("THE Swapped Array is:");

        myarray.swap(1, 3);
        for (int i = 0; i < myarray.size; i++) {
            System.out.println(myarray.get(i));
        }
        System.out.println("New Array after grow and addition of elements is:");
        myarray.add(5000);
        for (int i = 0; i < myarray.size; i++) {
            System.out.println(myarray.get(i));
        }
    }
}