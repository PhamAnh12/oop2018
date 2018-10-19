


package week4.task1;

public class Cam extends HoaQua {
    private String mau;
    private long sanluong;

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public long getSoluong() {
        return sanluong;
    }

    public void setSoluong(long soluong) {
        this.sanluong = soluong;
    }

    public Cam() {

    }

    public Cam(String mau, long sanluong) {
        mau = "Xanh";
        sanluong = 123456;
    }
    public double nangxuat(double dientich){
        return sanluong/dientich;
    }


    @Override
    public void ShowInfo() {
        super.ShowInfo();
        System.out.println("Mau cua Cam: " + mau);
        System.out.println("San Luong cua Cam: " + sanluong);
    }



}