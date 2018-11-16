package week10;

  import java.io.*;
import java.util.ArrayList;
import java.util.List;

    public class Task1 {

        // List method
        private List<String> list;

        public List<String> getAllFunctions(File path) throws IOException {
            BufferedReader br = new BufferedReader(new FileReader(path));
            list = new ArrayList<>();
            String line;
            while ((line = br.readLine()) != null) {
                if (line.contains("/*")) {
                    while (!line.contains("*/")) {
                        line = br.readLine();
                    }
                }
                if (line.contains("static") && line.endsWith("{")) {
                    String str = "";
                    str += (line + "\n");
                    while ((line = br.readLine()) != null) {
                        String str2 = line;
                        str += (str2 + "\n");
                        if (str2.endsWith("}")) {
                            break;
                        }
                    }
                    list.add(str);
                }
            }
            return list;
        }

        public void showAllList() {
            list.forEach((lists) -> {
                System.out.println(lists);
            });
        }

        public String findFunctionByName(String name) throws IOException {
            BufferedReader br = new BufferedReader(new FileReader("./src/Week10/Utils.java"));
            boolean checkFound = false;
            String line;
            String str = "";
            while ((line = br.readLine()) != null) {
                if (line.contains(name) && line.endsWith("{")) {
                    str += (line + "\n");
                    while ((line = br.readLine()) != null) {
                        String str2 = line;
                        str += (str2 + "\n");
                        if (str2.endsWith("}")) {
                            break;
                        }
                    }
                    checkFound = true;
                }
            }
            if (checkFound) {
                return str;
            } else {
                return "Method not found!";
            }
        }

        public static void main(String[] args) throws IOException {
            String name = "SystemOut";
            Task1 task1 = new Task1();
            File files = new File("./src/Week10/Utils.java");
            System.out.println("Tất cả hàm static trong file Utlis: ");
            task1.getAllFunctions(files);
            task1.showAllList();
            System.out.println("Tìm hàm: " + name);
            System.out.println("Hàm cần tìm: ");
            System.out.println(task1.findFunctionByName(name));
        }
    }



