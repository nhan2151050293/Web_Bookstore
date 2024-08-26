/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.btl;

import java.text.ParseException;

/**
 *
 * @author pc
 */
public class Dish {

    private String ten;
    private double gia;
    private String tinhTrang;
    private String thoiDiemBan;
  boolean dacTinh;
  

     public Dish() {
         
    }
     
       public Dish(String ten, double gia, String tinhTrang, String thoiDiemBan) {
        this.ten = ten;
        this.gia = gia;
        this.tinhTrang = tinhTrang;
        this.thoiDiemBan = thoiDiemBan;
    }
       
     
      public void nhapma() throws ParseException {
        System.out.print("Ten mon an = ");
        this.ten= CauHinh.sc.nextLine();
        System.out.print("Gia = ");
        this.gia= CauHinh.sc.nextDouble();
        String tmp = CauHinh.sc.nextLine();
        System.out.print("Tinh trang = ");
        this.tinhTrang = CauHinh.sc.nextLine();
        System.out.print("Thoi gian ban = ");
        this.thoiDiemBan= CauHinh.sc.nextLine();
    }
    
    public void hienThiMa() {
        System.out.printf("\nTen: %s\n", this.ten);
        System.out.printf("Gia: %s\n", this.gia);
        System.out.printf("Tinh trang: %s\n", this.tinhTrang);
        System.out.printf("Thoi diem ban: %s\n", this.thoiDiemBan);
        System.out.printf("Dac tinh: %s\n", this.dacTinh);
        
    }
    
    public boolean ghiDacTinh(){
        return true;
}
    /**
     * @return the ten
     */
    public String getTen() {
        return ten;
    }

    /**
     * @param ten the ten to set
     */
    public void setTen(String ten) {
        this.ten = ten;
    }

    /**
     * @return the gia
     */
    public double getGia() {
        return gia;
    }

    /**
     * @param gia the gia to set
     */
    public void setGia(double gia) {
        this.gia = gia;
    }

    /**
     * @return the tinhTrang
     */
    public String isTinhTrang() {
        return getTinhTrang();
    }

    /**
     * @param tinhTrang the tinhTrang to set
     */
    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    /**
     * @return the tinhTrang
     */
    public String getTinhTrang() {
        return tinhTrang;
    }

    /**
     * @return the thoiDiemBan
     */
    public String getThoiDiemBan() {
        return thoiDiemBan;
    }

    /**
     * @param thoiDiemBan the thoiDiemBan to set
     */
    public void setThoiDiemBan(String thoiDiemBan) {
        this.thoiDiemBan = thoiDiemBan;
    }

}
