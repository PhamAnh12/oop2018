package week11;

import java.util.ArrayList;

public class Task2 {
    public <T extends Comparable<T>> T maximum( ArrayList<T> arr) {
        T max = arr.get(0);

        for (T element : arr){
            if (element.compareTo(max) > 0)
                max = element;
        }

        return max;
    }


    public static void main(String[] args) {
      Task2 task2 = new Task2();

        ArrayList arrayListInt = new ArrayList();
        arrayListInt.add(5);
        arrayListInt.add(40);
        arrayListInt.add(10);

        ArrayList arrayListDouble = new ArrayList();
        arrayListDouble.add(1.02);
        arrayListDouble.add(9.99999);
        arrayListDouble.add(1.024);

        ArrayList arrayListChar = new ArrayList();
        arrayListChar.add('A');
        arrayListChar.add('M');
        arrayListChar.add('C');

        System.out.println("The maximum of ArrayList Integer is: " + task2.maximum(arrayListInt));
        System.out.println("The maximum of ArrayList Double is: " +task2.maximum(arrayListDouble));
        System.out.println("The maximum of ArrayList Character is: " + task2.maximum(arrayListChar));

    }
}
