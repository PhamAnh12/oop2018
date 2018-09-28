package week2.task2;

public class Fraction {

    // TODO: khai báo các thuộc tính
    private int numerator;
    private int denominator;// denominator != 0;

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int USCLN(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    public void toiGianPhanSo() {
        int i = USCLN(this.getNumerator(), this.getDenominator());
        this.setNumerator(this.getNumerator() / i);
        this.setDenominator(this.getDenominator() / i);
    }

    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới

        int ts = this.getNumerator() * other.getDenominator() + other.getNumerator() * this.getDenominator();
        int ms = this.getDenominator() * other.getDenominator();
        Fraction p = new Fraction(ts, ms);
        if (p.numerator != 0) {
            p.toiGianPhanSo();
        }
        return p;
    }


    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        int ts = this.getNumerator() * other.getDenominator() - other.getNumerator() * this.getDenominator();
        int ms = this.getDenominator() * other.getDenominator();
        Fraction p = new Fraction(ts, ms);
        if (p.numerator != 0) {
            p.toiGianPhanSo();
        }
        return p;

    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        int ts = this.numerator * other.numerator;
        int ms = this.getDenominator() * other.getDenominator();
        Fraction p = new Fraction(ts, ms);
        if (p.numerator != 0) {
            p.toiGianPhanSo();
        }
        return p;
    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        int ts = this.numerator * other.denominator;
        int ms = this.getDenominator() * other.numerator;
        Fraction p = new Fraction(ts, ms);
        if (p.numerator != 0) {
            p.toiGianPhanSo();
        }
        return p;
    }

    public static void hienthiphanso(Fraction p) {
        if (p.numerator == 0 || p.denominator == 1) System.out.println(p.numerator);
        else System.out.println(p.numerator + "/" + p.denominator);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else return false;
    }

    public static void main(String[] args) {

        Fraction ps1 = new Fraction(1, 5);
        Fraction ps2 = new Fraction(1, 3);
        if (ps1.denominator == 0 || ps2.denominator == 0) {
            System.out.println("Phan so khong hop le:");
        } else {
            if (ps1.numerator == 0) {
                System.out.println("Phan so 1 toi gian:");
                System.out.println("0");
            } else {
                System.out.println("Phan so 1 toi gian:");
                ps1.toiGianPhanSo();
                System.out.println(ps1.numerator + "/" + ps1.denominator);
            }
            if (ps2.numerator == 0) {
                System.out.println("Phan so 2 toi gian:");
                System.out.println("0");
            } else {
                System.out.println("Phan so 2 toi gian:");
                ps2.toiGianPhanSo();
                System.out.println(ps2.numerator + "/" + ps2.denominator);
            }
            System.out.println("Tong hai phan so:");
            hienthiphanso(ps1.add(ps2));
            System.out.println("Hieu hai phan so:");
            hienthiphanso(ps1.subtract(ps2));
            System.out.println("tich hai phan so:");
            hienthiphanso(ps1.multiply(ps2));

            if (ps2.numerator == 0) {
                System.out.println("Nhap sai tu so");
                System.out.println("Khong thuc hien phep chia phanso1/phanso2");
            } else {
                System.out.println("Thuong hai phan so:");
                hienthiphanso(ps1.divide(ps2));
            }
            System.out.println("So sanh hai phan so:");


            System.out.println(ps1.equals(ps2) ? "phan so 1 bang phan so 2" : "phan so 1 khac  phan so 2");
        }
    }
}
