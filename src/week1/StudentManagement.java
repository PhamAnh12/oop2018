package week1;

public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    private Student students[] = new Student[100];
    public int m;

    public static boolean sameGroup(Student s1, Student s2) {
        // TODO:
        if (s1.getGroup() == null || s2.getGroup() == null) {
            return false;
        } else {
            return (s1.getGroup().equals(s2.getGroup()));
        }
        // xóa dòng này sau khi cài đặt
    }

    public void studentsByGroup() {
        // TODO:
        boolean[] check = new boolean[m];
        for (int i = 0; i < m; i++) {
            check[i] = true;
        }
        for (int i = 0; i < m; i++) {
            if (check[i]) {
                System.out.println("Lop: " + students[i].getGroup());
                System.out.println(students[i].getName());
                for (int j = i + 1; j < m; j++) {
                    if (sameGroup(students[i], students[j])) {
                        System.out.println(students[j].getName());
                        check[j] = false;
                    }
                }
            }
        }
    }

    public void removeStudent(String id) {
        // TODO:
        if (id == null)
            System.out.println("ID khong hop le");
        else {
            for (int i = 0; i < m; i++) {
                if (students[i].getId() == id) {
                    for (int j = i; j < m - 1; j++)
                        students[j] = students[j + 1];
                    m--;
                }
            }
        }
    }


    public static void main(String[] args) {
        // TODO:
        Student sv = new Student();
        sv.setName("Pham Cong Tuan Anh");
        sv.setId("17020587");
        sv.setGroup("K62-CF");
        sv.setEmail("phamcongtuananh99@gmail.com");
        System.out.println(sv.getName());
        sv.getInfo();
        Student student1 = new Student();
        Student student2 = new Student("Pham Van A", "17020580", "phamvana99@gmail.com");
        Student sv1 = new Student();
        Student sv2 = new Student();
        Student sv3 = new Student();
        sv1.setName("Nguyen Van A");
        sv1.setId("17020581");
        sv1.setGroup("INT22041");
        sv1.setEmail("nguyenvana99@gmail.com");
        sv2.setName("Nguyen Van B");
        sv2.setId("17020582");
        sv2.setGroup("INT22041");
        sv2.setEmail("nguyenvanb99@gmail.com");
        sv3.setName("Nguyen Van C");
        sv3.setId("17020593");
        sv3.setGroup("INT22042");
        sv3.setEmail("nguyenvanc99@gmail.com");
        System.out.println("----------------------------------");
        System.out.println(sameGroup(sv1, sv2) ? "Cung Lop" : "KHac Lop");
        System.out.println(sameGroup(sv1, sv3) ? "Cung Lop" : "KHac Lop");
        System.out.println(sameGroup(sv2, sv3) ? "Cung Lop" : "KHac Lop");

    }
}
