package week10;

import java.util.Random;

public class Task2 {
    public  void  sapxepnoibot(float a[], int n){
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-1; j++){
                if(a[j] > a[j+1]){
                    float x = a[j+1];
                    a[j+1] = a[j];
                    a[j] = x;

                }
            }
        }
    }

    public static
    void main(String[] args) {
        Task2 task2 = new Task2();
        Random x = new Random();
        int n = 100;
        float mang [] = new float[n];
        for (int i = 0; i < n; i++){
            mang[i] = x.nextFloat();
            System.out.println(mang[i]+ " ");
        }
        System.out.println( "");
        task2.sapxepnoibot(mang,n);
        for (int i = 0; i < n; i++){
            System.out.println(mang[i]+ " ");
        }

    }
}
