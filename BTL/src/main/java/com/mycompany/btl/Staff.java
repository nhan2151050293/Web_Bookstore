/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.btl;

import java.text.ParseException;
import java.util.Date;

/**
 *
 * @author pc
 */
public class Staff {
    private static int dem;
    private int id;
    private String hoTen;
    private String gioiTinh;
    private String queQuan;
    private Date ngaySinh;
    private Date ngayVaoLam;
    private String boPhan;
    
    {
        id = ++dem;
    }

     public Staff() {
    }
     
      public Staff(String hoTen, String gioiTinh, String queQuan, Date ngaySinh, Date ngayVaoLam, String boPhan) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.queQuan = queQuan;
        this.ngaySinh = ngaySinh;
        this.ngayVaoLam = ngayVaoLam;
        this.boPhan= boPhan;
    }
    
    public Staff(String hoTen, String gioiTinh, String queQuan, String ngaySinh, String ngayVaoLam, String boPhan) throws ParseException {
        this(hoTen, gioiTinh, queQuan, CauHinh.f.parse(ngaySinh),CauHinh.f.parse(ngayVaoLam),boPhan);
    }
     
    public void nhapst() throws ParseException {
        System.out.print("Ho ten = ");
        this.hoTen = CauHinh.sc.nextLine();
        System.out.print("Gioi tinh = ");
        this.gioiTinh = CauHinh.sc.nextLine();
        System.out.print("Que quan = ");
        this.queQuan = CauHinh.sc.nextLine();
        System.out.print("Ngay sinh (dd/MM/yyyy) = ");
        this.ngaySinh = CauHinh.f.parse(CauHinh.sc.nextLine());
        System.out.print("Ngay vao lam (dd/MM/yyyy) = ");
        this.ngayVaoLam= CauHinh.f.parse(CauHinh.sc.nextLine());
         System.out.print("Bo Phan = ");
        this.boPhan = CauHinh.sc.nextLine();
    }
    
    public void hienThi() {
        System.out.printf("\nId: %d\n", this.id);
        System.out.printf("Ho ten: %s\n", this.hoTen);
        System.out.printf("GioiTinh: %s\n", this.gioiTinh);
        System.out.printf("Que quan: %s\n", this.queQuan);
        System.out.printf("Ngay sinh: %s\n", CauHinh.f.format(this.ngaySinh));
        System.out.printf("Ngay vao lam: %s\n", CauHinh.f.format(this.ngayVaoLam));
        System.out.printf("boPhan: %s\n", this.boPhan);
        System.out.print("\n--------------------------------------------\n");
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
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the hoTen
     */
    public String getHoTen() {
        return hoTen;
    }

    /**
     * @param hoTen the hoTen to set
     */
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    /**
     * @return the queQuan
     */
    public String getQueQuan() {
        return queQuan;
    }

    /**
     * @param queQuan the queQuan to set
     */
    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    /**
     * @return the ngaySinh
     */
    public Date getNgaySinh() {
        return ngaySinh;
    }

    /**
     * @param ngaySinh the ngaySinh to set
     */
    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    /**
     * @return the ngayVaoLam
     */
    public Date getNgayVaoLam() {
        return ngayVaoLam;
    }

    /**
     * @param ngayVaoLam the ngayVaoLam to set
     */
    public void setNgayVaoLam(Date ngayVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
    }

    /**
     * @return the boPhan
     */
    public String getBoPhan() {
        return boPhan;
    }

    /**
     * @param boPhan the boPhan to set
     */
    public void setBoPhan(String boPhan) {
        this.boPhan = boPhan;
    }

    /**
     * @return the gioiTinh
     */
    public String getGioiTinh() {
        return gioiTinh;
    }

    /**
     * @param gioiTinh the gioiTinh to set
     */
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

}

    