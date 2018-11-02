package week7.task2;


import week4.task1.Tao;
import week4.task2.*;
import java.io.*;
import java.util.Scanner;

public class Task2 {
    public static void NullPointer() throws NullPointerException{
        String pointer = null;
        System.out.println(pointer.length());
    }
    public static void ArrayIndexOfBound() throws ArrayIndexOutOfBoundsException{
        int arr[] = new int[10];
        arr[20] = 100;

    }
    public static void Arithmetic() throws ArithmeticException{
        int a = 10;
        int b = 0;
        System.out.println(a/b);
    }
    public static void ClassCast() throws ClassCastException{
        Object tao = new Tao();
        Square square = (Square) tao;

    }
    public static void IO() throws IOException{
        FileOutputStream f = new FileOutputStream("example.txt");
        f.close();
        f.write(1);
    }
    public static void FileNotFound() throws FileNotFoundException{
        Scanner scanner = new Scanner(new File("file.txt"));
        while (scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }
    }

    public static void main(String[] args) {

        //TODO: NullPointerException: thao tác vs 1 biến null
        try{
            NullPointer();
        } catch(NullPointerException e){
            System.out.println("Thao tác với một biến null");
        }

        //TODO: ArrayIndexOfBound: thao tác với vị trí sai của 1 mảng
        try{
            ArrayIndexOfBound();
        }catch(ArrayIndexOutOfBoundsException a){
            System.out.println("thao tác với vị trí sai của 1 mảng");
        }

        //TODO: Arithmetic: chia cho 0
        try{
            Arithmetic();
        }catch(ArithmeticException a){
            System.out.println("Lỗi chia cho 0");
        }

        //TODO: ClassCAst: ép kiểu sai
        try{
            ClassCast();
        }catch(ClassCastException c){
            System.out.println("Lỗi ép kiểu sai");
        }

        //TODO: IO : không đọc được file
        try{
            IO();
        }catch(IOException i){
            //i.printStackTrace();
            System.out.println("Lỗi không đọc được file");
        }

        //TODO: FileNotFOund: không tìm thấy file
        try{
            FileNotFound();
        }catch(FileNotFoundException f){
            System.out.println("Lỗi không tìm thấy file");
        }


    }


}
