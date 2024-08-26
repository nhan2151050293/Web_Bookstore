/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.btl;

import static com.mycompany.btl.CauHinh.sc;
import java.text.ParseException;


/**
 *
 * @author pc
 */
public class Food extends Dish{
    private boolean anChay;
    
    public Food(String ten,double gia,String tinhTrang,String thoiDiemBan,boolean anChay){
    super(ten,gia,tinhTrang,thoiDiemBan);
    this.anChay = anChay;
    }
    public Food(){
        super();
        //System.out.println("Ca an Chay hong");
      this.anChay= Boolean.parseBoolean("true");
     //  this.anChay = sc.nextBoolean();
    }
    @Override
    public boolean ghiDacTinh(){
        return this.anChay;
}
    
    @Override
    public void hienThiMa() {
        super.hienThiMa();
        if(this.anChay)
            System.out.println("An chay duoc");
        else
            System.out.println("Khong an chay duoc");
         System.out.println("----------------");
    }

    /**
     * @return the anChay
     */
    public boolean isAnChay() {
        return anChay;
    }

    /**
     * @param anChay the anChay to set
     */
    public void setAnChay(boolean anChay) {
        this.anChay = anChay;
    }
    
}
