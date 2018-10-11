package week4.task1;

public class CamSanh extends Cam {
    private double gia;
    private String xuatxu;

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getXuatxu() {
        return xuatxu;
    }

    public void setXuatxu(String xuatxu) {
        this.xuatxu = xuatxu;
    }


    public CamSanh() {
        gia = 24000;
        xuatxu = "Tuyên Quang";
    }

    public boolean Dat() {
        if (gia > 20000)
            return true;
        return false;
    }

    @Override
    public void ShowInfo() {
        super.ShowInfo();
        System.out.println("Gia cua Cam Sanh: " + gia);
        System.out.println("Xuat xu cua Cam Sanh: " + xuatxu);
    }
}