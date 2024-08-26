/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.btl;

/**
 *
 * @author pc
 */
public class Drink extends Dish{
    private boolean themDa;
    
    public Drink(String ten,double gia,String tinhTrang,String thoiDiemBan,boolean anChay){
    super(ten,gia,tinhTrang,thoiDiemBan);
    this.themDa = themDa;
    }

    public Drink(){
    super();
    this.themDa = this.dacTinh;
    }
    @Override
    public void hienThiMa(){
        super.hienThiMa();
        if(this.isThemDa())
            System.out.println("Co da");
        else 
            System.out.println("Khong co da");
}
    /**
     * @return the themDa
     */
    public boolean isThemDa() {
        return themDa;
    }

    /**
     * @param themDa the themDa to set
     */
    public void setThemDa(boolean themDa) {
        this.themDa = themDa;
    }
}
