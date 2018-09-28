package week2.task3;


public class Task3 {
}
class Monhoc {
    //TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dướiclass Monhoc {
    private String tenmonhoc;
    private String mamonhoc;
    private int sotc;
    private double diem;

    public String getTenmonhoc() {
        return tenmonhoc;
    }

    public void setTenmonhoc(String tenmonhoc) {
        this.tenmonhoc = tenmonhoc;
    }

    public String getMamonhoc() {
        return mamonhoc;
    }

    public void setMamonhoc(String mamonhoc) {
        this.mamonhoc = mamonhoc;
    }

    public int getSotc() {
        return sotc;
    }

    public void setSotc(int sotc) {
        this.sotc = sotc;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public double getDiem() {
        return diem;
    }

    public Monhoc(String ten, String ma, int so) {
        this.tenmonhoc = ten;
        this.mamonhoc = ma;
        this.sotc = so;
    }

    void getInfo() {
        System.out.println("Ten mon hoc: " + tenmonhoc);
        System.out.println("Ma mon hoc: " + mamonhoc);
        System.out.println("So tin chi: " + sotc);


    }

    public int hocphi() {
        return 260000 * this.sotc;
    }

    public double diemmonhoc(double diemchuyencan, double diemgiuaki, double diemcuoiky) {
        double diemhe10;
        diemhe10 = (diemchuyencan * 10 + diemgiuaki * 30 + diemcuoiky * 60) / 100;
        if (diemhe10 < 4.0) {
            diem = 0;
        } else if (diemhe10 >= 4.0 && diemhe10 <= 4.9) {

            diem = 1;
        } else if (diemhe10 >= 5.0 && diemhe10 <= 5.4) {
            diem = 1.5;
        } else if (diemhe10 >= 5.5 && diemhe10 <= 6.4) {
            diem = 2;
        } else if (diemhe10 >= 6.5 && diemhe10 <= 6.9) {
            diem = 2.5;
        } else if (diemhe10 >= 7.0 && diemhe10 <= 7.9) {
            diem = 3;
        } else if (diemhe10 >= 8.0 && diemhe10 <= 8.4) {
            diem = 3.5;
        } else if (diemhe10 >= 8.5 && diemhe10 <= 10) {
            diem = 4;
        }
        return diem;
    }

    public static void main(String[] args) {
        Monhoc oop = new Monhoc("oop", "INT2204", 3);
        oop.getInfo();
        System.out.println("Hoc phi mon hoc:" + oop.hocphi());
        System.out.println("Diem mon hoc: " + oop.diemmonhoc(10, 7, 8));
    }
}



class Cat {
    private String ten;
    private int cannang;
    private String mausac;
    private String gioitinh;
    private int namsinh;


    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getCannang() {
        return cannang;
    }

    public void setCannang(int cannang) {
        this.cannang = cannang;
    }

    public String getMausac() {
        return mausac;
    }

    public void setMausac(String mausac) {
        this.mausac = mausac;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    void getInfo(){
        System.out.println("Ten meo: "+ ten );
        System.out.println("Can nang meo: "+ cannang+ " Kg" );
        System.out.println("Mau sac meo: "+ mausac );
        System.out.println("Gioi tinh  meo: "+ gioitinh );
    }
    public int tuoi(int namhientai){
        return (namhientai - namsinh);
    }

    public static  void  main(String [] args){
        Cat meo= new Cat();
        meo.setTen("miu");meo.setCannang(10);meo.setGioitinh("Đực");meo.setMausac("Tam thể");meo.setNamsinh(2016);
        meo.getInfo();
        System.out.println(meo.tuoi(2018));

    }

}
class teacher {
    private String ten;
    private String email;
    private String monday;
    private int tuoi;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMonday() {
        return monday;
    }

    public void setMonday(String monday) {
        this.monday = monday;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    void getInfo() {
        System.out.println("Ten: " + ten);
        System.out.println("Email: " + email);
        System.out.println("Monday: " + monday);
        System.out.println("Tuoi: " + tuoi);

    }
}



