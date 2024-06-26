/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaphinh;

/**
 *
 * @author oanht
 */
import java.text.DecimalFormat;
 
public class HinhTron extends HinhHoc {
    private int banKinh;
    DecimalFormat dcf = new DecimalFormat("#.##");
 
    public HinhTron() {
        super();
    }
 
    public HinhTron(int banKinh) {
        super();
        this.banKinh = banKinh;
    }
 
    @Override
    public double tinhDienTich() {
        return 3.14 * banKinh * banKinh;
    }
     
    @Override
    public String toString() {
        return "Hình tròn có bán kính = " + this.banKinh + 
            ", diện tích = " + dcf.format(tinhDienTich());
    }
 
}
