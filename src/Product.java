import java.io.Serializable;

public class Product implements Serializable {
    private String MaSp;
    private String TenSp;
    private String HangXS;
    private int Gia;

    public Product(String maSp, String tenSp, String hangXS, int gia) {
        MaSp = maSp;
        TenSp = tenSp;
        HangXS = hangXS;
        Gia = gia;
    }

    public String getMaSp() {
        return MaSp;
    }

    public void setMaSp(String maSp) {
        MaSp = maSp;
    }

    public String getTenSp() {
        return TenSp;
    }

    public void setTenSp(String tenSp) {
        TenSp = tenSp;
    }

    public String getHangXS() {
        return HangXS;
    }

    public void setHangXS(String hangXS) {
        HangXS = hangXS;
    }

    public int getGia() {
        return Gia;
    }

    public void setGia(int gia) {
        Gia = gia;
    }

    @Override
    public String toString() {
        return "Product{" +
                "MaSp='" + MaSp + '\'' +
                ", TenSp='" + TenSp + '\'' +
                ", HangXS='" + HangXS + '\'' +
                ", Gia=" + Gia +
                '}';
    }
}
