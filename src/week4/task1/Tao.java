
package week4.task1;

public class Tao extends HoaQua {
    private String mau;
    private long sanluong;

    public
    String getMau() {
        return mau;
    }

    public
    void setMau(String mau) {
        this.mau = mau;
    }

    public
    long getSoluong() {
        return sanluong;
    }

    public
    void setSoluong(long soluong) {
        this.sanluong = soluong;
    }

    public
    Tao() {
        mau = "red";
        sanluong = 399999;
    }

    public
    boolean Dachinchua() {
        if (mau == "red")
            return true;
        return false;
    }

    @Override
    public
    void ShowInfo() {
        super.ShowInfo();
        System.out.println("Mau cua Tao: " + mau);
        System.out.println("San luong cua Tao: " + sanluong);
    }
}