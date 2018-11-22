package week11;


public class Task1 {
    public <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public <T extends Comparable<T>> void sort(T[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        Task1 task1 = new Task1();

        Integer[] intArray = { 1, 10, 8, 4, 5, 3 };
        Double[] doubleArray = { 1.154, 2.5, 8.9, 4.36, 5.20, 3.15 };
        Character[] charArray = { 'a', 's', 'm', 'k', 'b', 'z' };

        task1.sort(intArray);
        task1.printArray(intArray);

        task1.sort(charArray);
        task1.printArray(charArray);

        task1.sort(doubleArray);
       task1.printArray(doubleArray);



    }
}
