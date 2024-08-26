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
public class Seating {
        private static int dem=0;
    private int idb = ++dem;
    private int soLuong;
    private String tinhTrang;
//    private String maBan;
//    {
//        setMaBan(String.format("B%03d", this.getIdb()));
//        //idb = ++dem;
//    }
    
    public Seating() {
    }

    public Seating(int soLuong,String tinhTrang) {
        this.soLuong = soLuong;
        this.tinhTrang = tinhTrang;
    }

    
  public void nhapb() throws ParseException {
        System.out.print("So luong = ");
        this.soLuong = CauHinh.sc.nextInt();
        String tmp = CauHinh.sc.nextLine();
        System.out.print("Tinh trang = ");
        this.tinhTrang= CauHinh.sc.nextLine();
    }

     public void hienThib() {
        System.out.printf("\nId: B00%d\n", this.idb);
        System.out.printf("So luong: %s\n", this.soLuong);
        System.out.printf("Tinh trang: %s\n", this.tinhTrang);
    }

    /**
     * @return the soLuong
     */
    public int getSoLuong() {
        return soLuong;
    }

    /**
     * @param soLuong the soLuong to set
     */
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    /**
     * @return the tinhTrang
     */
    public String getTinhTrang() {
        return tinhTrang;
    }

    /**
     * @param tinhTrang the tinhTrang to set
     */
    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    /**
     * @return the dem
     */
    public static int getDem() {
        return dem;
    }

    /**
     * @param aDem the dem to set
     */
    public static void setDem(int aDem) {
        dem = aDem;
    }

    /**
     * @return the idb
     */
    public int getIdb() {
        return idb;
    }

    /**
     * @param idb the idb to set
     */
    public void setIdb(int idb) {
        this.idb = idb;
    }

//    /**
//     * @return the maBan
//     */
//    public String getMaBan() {
//        return maBan;
//    }
//
//    /**
//     * @param maBan the maBan to set
//     */
//    public void setMaBan(String maBan) {
//        this.maBan = maBan;
//    }

    
}
