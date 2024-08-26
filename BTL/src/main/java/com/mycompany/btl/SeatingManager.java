/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.btl;

import static com.mycompany.btl.CauHinh.f;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author pc
 */
public class SeatingManager {
     private ArrayList<Seating> ds = new ArrayList<>();
    
    public void themBan(Seating a) {
        this.ds.add(a);
    }

     public void nhapBan(int n) throws ParseException {
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap Ban %d\n", i + 1);
            Seating a = new Seating();
            a.nhapb();
            this.ds.add(a);
        }
    }
     
     public void hienThiDsB() {
        this.ds.forEach(h -> h.hienThib());
    }

    public void docDsB() throws FileNotFoundException, ParseException {
        File f = new File("src/main/resources/table.txt");
        try ( Scanner sc = new Scanner(f)) {
            while (sc.hasNext()) {
                Seating g = new Seating();
                g.setSoLuong(sc.nextInt());
                  String tmp = sc.nextLine();
                g.setTinhTrang(sc.nextLine());
                this.ds.add(g);
            }
        }
    }
    
        public List<Seating> traCuuBan(int a) {
        return this.ds.stream().filter(h -> h.getSoLuong()==a).collect(Collectors.toList());
    }
        public List<Seating> traCuuBanTrong(String tuKhoa) {
        return this.ds.stream().filter(h -> h.getTinhTrang().contains(tuKhoa)).collect(Collectors.toList());
    }
        
        public void delete(int id) throws FileNotFoundException, ParseException{
        this.getDs().removeIf(x -> x.getIdb()==id);
    }
    /**
     * @return the ds
     */
    public ArrayList<Seating> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(ArrayList<Seating> ds) {
        this.ds = ds;
    }
    
}
