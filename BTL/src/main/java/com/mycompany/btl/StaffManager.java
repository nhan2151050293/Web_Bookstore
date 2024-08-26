/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.btl;

import static com.mycompany.btl.CauHinh.f;
import static com.mycompany.btl.CauHinh.sc;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author pc
 */
public class StaffManager {
    private ArrayList<Staff> ds = new ArrayList<>();
    private static Calendar c = Calendar.getInstance();
    
    public void themS(Staff h) {
        this.ds.add(h);
    }
    
    public void nhapDs(int n) throws ParseException {
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap nhan vien %d\n", i + 1);
            Staff h = new Staff();
            h.nhapst();
            this.ds.add(h);
        }
    }
    
    public void hienThiDs() {
        this.ds.forEach(h -> h.hienThi());
    }

    public void docDs() throws FileNotFoundException, ParseException {
        File d = new File("src/main/resources/staff.txt");
        try ( Scanner sc = new Scanner(d)) {
            while (sc.hasNext()) {
                Staff h = new Staff();
                h.setHoTen(sc.nextLine());
                h.setGioiTinh(sc.nextLine());
                h.setQueQuan(sc.nextLine());
                h.setNgaySinh(CauHinh.f.parse(sc.nextLine()));
                h.setNgayVaoLam(CauHinh.f.parse(sc.nextLine()));
                h.setBoPhan(sc.nextLine());
                this.ds.add(h);
            }
        }
    }

    
    public List<Staff> traCuu(String tuKhoa) {
        return this.ds.stream().filter(h -> h.getHoTen().toUpperCase().contains(tuKhoa.toUpperCase()) || h.getQueQuan().toUpperCase().contains(tuKhoa.toUpperCase())|| h.getGioiTinh().toUpperCase().contains(tuKhoa.toUpperCase())|| f.format(h.getNgaySinh()).equals(tuKhoa)).collect(Collectors.toList());
    }
    public void deleteS(int id) throws FileNotFoundException, ParseException{
        this.getDs().removeIf(x -> x.getId()==id);
    }
    
    public List<Staff> sinhnhat(){
        return this.getDs().stream().filter(h -> h.getNgaySinh().getMonth()== c.get(Calendar.MONTH)).collect(Collectors.toList());
    }
   
    //public void xoaNoiDungFile() throws IOException{
    //    File f = new File("src/main/resources/staff.txt");
    //   try(PrintWriter writer = new PrintWriter(f)){
    //    }
    //}
   // public void ghiFile() throws IOException{
    //`    File f = new File("src/main/resources/staff.txt");
       // FileWriter w = new FileWriter(f, true);
       // this.xoaNoiDungFile();
        //try(PrintWriter writer = new PrintWriter(w)){
         //   ds.forEach(x ->{
         //       writer.println(x.getHoTen());
          //      writer.println(x.getGioiTinh());
         //       writer.println(x.getQueQuan());
         //      writer.println(x.getNgaySinh());
         //      writer.println(x.getNgayVaoLam());
           // });
       // }
      //  w.close();
   // }
    //xóa nhân viên theo mã số

    
    
    // public List<Staff> traCuu(Date dob) {
     //   return this.ds.stream().filter(h -> h.getNgaySinh().compareTo(dob)==0).collect(Collectors.toList());
   // }

    /**
     * @return the ds
     */
    public ArrayList<Staff> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(ArrayList<Staff> ds) {
        this.ds = ds;
    }

    /**
     * @return the c
     */
    public static Calendar getC() {
        return c;
    }

    /**
     * @param aC the c to set
     */
    public static void setC(Calendar aC) {
        c = aC;
    }
}

