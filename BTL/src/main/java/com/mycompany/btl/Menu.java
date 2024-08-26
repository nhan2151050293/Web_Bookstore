/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.btl;

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
public class Menu {
 private ArrayList<Dish> ds = new ArrayList<>();
    public void themDish(Dish m){
       // Dish m = new Food
        this.getDs().add(m);
    }

     public void nhapDish(int n) throws ParseException {
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap Mon an%d\n", i + 1);
            Dish m = new Dish();
            m.nhapma();
            this.getDs().add(m);
        }
    }

     public void hienThiMa() {
        this.ds.forEach(h -> h.hienThiMa());
    }

     public void docDsMa(int chon) throws FileNotFoundException, ParseException {
        
         switch(chon){
             case 1 ->{
        File d = new File("src/main/resources/food.txt");
        try ( Scanner sc = new Scanner(d)) {
   boolean dacTinh;
            while (sc.hasNext()) {
                Dish h = new Food();
                h.setTen(sc.nextLine());
                h.setGia(sc.nextDouble());
                String tmp = sc.nextLine();
                h.setTinhTrang(sc.nextLine());
                h.setThoiDiemBan(sc.nextLine());
             dacTinh = Boolean.parseBoolean(sc.nextLine());
                  //String tmp1 = sc.nextLine();
                this.ds.add(h);
            }
            }
         break;
        }
            
             case 2->{
                 File d = new File("src/main/resources/drink.txt");
        try ( Scanner sc = new Scanner(d)) {
            while (sc.hasNext()) {
                Dish h = new Drink();
                h.setTen(sc.nextLine());
                h.setGia(sc.nextDouble());
                String tmp = sc.nextLine();
                h.setTinhTrang(sc.nextLine());
                h.setThoiDiemBan(sc.nextLine());
                h.dacTinh = sc.nextBoolean();
                String tmp1 = sc.nextLine();
                this.ds.add(h);
             }
        }
        break;
    }
         }
}
        public List<Dish> traCuuMon(String tuKhoa) {
        return this.ds.stream().filter(h -> h.getTen().toUpperCase().contains(tuKhoa.toUpperCase())).collect(Collectors.toList());
    }
        
        public List<Dish> traCuuGiaMon(Double a, double b) {
        return this.ds.stream().filter(h -> h.getGia()> a && h.getGia() < b ).collect(Collectors.toList());
    }
          public void sapXep(int n) {
        this.ds.sort((s1, s2) -> {
            double g1 = s1.getGia();
            double g2 = s2.getGia();
            
            if (g1 > g2)
                return n;
            else if (g1 < g2)
                return -n;
            return 0;
        });
    }
    /**
     * @return the ds
     */
    public ArrayList<Dish> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(ArrayList<Dish> ds) {
        this.ds = ds;
    }
}
