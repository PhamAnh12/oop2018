package week10;

import java.io.*;


public
class Utils {
    public static String readContentFromFile(String path){
        File file = new File(path);
        String line = "";
        String reader = "";
        try{
            FileReader fileReader= new FileReader(file);
            BufferedReader bf = new BufferedReader(fileReader);
           while ((line = bf.readLine()) !=null){
               reader = reader + line + "\n";

            }

        }
        catch (IOException ex){
            ex.printStackTrace();
        }
        return reader;
    }
    public static void writeContentToFileB(String path){
        File file = new File(path);
        try{
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bf = new BufferedWriter(fileWriter);
            PrintWriter pw = new PrintWriter(bf);
            pw.println("12345");
            pw.println("45667");
            bf.close();
            pw.close();


        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }
    public static void writeContentToFileC(String path){
        File file = new File(path);
        try{
            FileWriter fileWriter = new FileWriter(file,true);
            BufferedWriter bf = new BufferedWriter(fileWriter);
            PrintWriter pw = new PrintWriter(bf);
            pw.println("667788");
            pw.println("2233344");
            bf.close();
            pw.close();
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }
    public static File findFileByName(String folderPath, String fileName) {
        File file = new File(folderPath);
        File[] listfile = file.listFiles();
        if (listfile != null) {
            for (File f : listfile) {
                if (f.exists()) {
                    if (f.isFile()) {
                        if (f.getName().endsWith(fileName)) {
                            return file.getAbsoluteFile();
                        }
                    }
                }
            }
        }
        return null;
    }
    public  static void  main(String [] args){
        System.out.println(readContentFromFile("C:\\oop2018\\src\\week9\\cau a.txt"));
        writeContentToFileB("C:\\oop2018\\src\\week9\\cau b.txt");
        writeContentToFileC("C:\\oop2018\\src\\week9\\cau c.txt");
        System.out.println(findFileByName("C:\\oop2018\\src\\week9","cau d.txt"));

    }


}

