package week1;

public class Student {

    // TODO: khai báo các thuộc tính cho Student
    private String name;
    private String id;
    private String group;
    private String email;
    // TODO: khai báo các phương thức getter, setter cho Student

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Constructor 1
     */
    public Student() {
        // TODO:
        name = "Student";
        id = "000";
        group = "INT22041";
        email = "uet@vnu.edu.vn";
    }

    /**
     * Constructor 2
     *
     * @param n
     * @param sid
     * @param em
     */
    public Student(String n, String sid, String em) {
        // TODO:
        this.name = n;
        this.id = sid;
        this.email = em;
        group = "INT22041";
    }

    /**
     * Constructor 3
     *
     * @param s
     */
    public Student(Student s) {
        // TODO:
        name = s.name;
        id = s.id;
        email = s.email;
        group = s.group;
    }

    public void getInfo() {
        // TODO:
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Group: " + group);
        System.out.println("Email: " + email);
    }

}