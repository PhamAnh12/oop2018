package week4.task1;

public class HoaQua {
    private String nguongoc, hinhdang;

    public String getNguongoc() {
        return nguongoc;
    }

    public void setNguongoc(String nguongoc) {
        this.nguongoc = nguongoc;
    }

    public String getHinhdang() {
        return hinhdang;
    }

    public void setHinhdang(String hinhdang) {
        this.hinhdang = hinhdang;
    }

    public HoaQua() {
        nguongoc = "VietNam";
        hinhdang = "tron";
    }

    public boolean XuatXuOChauA() {
        if (nguongoc.equalsIgnoreCase("VietNam"))
            return true;
        return false;
    }

    public void ShowInfo() {
        System.out.println("Nguoc Goc: " + nguongoc);
        System.out.println("Hinh dang: " + hinhdang);
    }

    public static void main(String[] args) {
        HoaQua hoaQua = new HoaQua();
        Cam cam = new Cam();
        Tao tao = new Tao();
        CamThanhPhong camThanhPhong = new CamThanhPhong();
        CamSanh camSanh = new CamSanh();
        hoaQua.ShowInfo();
        System.out.println("---------------------------------");
        cam.ShowInfo();
        System.out.println("----------------------------------");
        tao.ShowInfo();
        System.out.println("----------------------------------");
        camThanhPhong.ShowInfo();
        System.out.println("-----------------------------------");
        camSanh.ShowInfo();
    }
}