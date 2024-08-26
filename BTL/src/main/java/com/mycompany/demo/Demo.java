/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demo;
import static com.mycompany.btl.CauHinh.sc;
import com.mycompany.btl.Menu;
import com.mycompany.btl.SeatingManager;
import com.mycompany.btl.StaffManager;
import com.mycompany.btl.Staff;
import com.mycompany.btl.Food;
import java.io.FileNotFoundException;
import java.text.ParseException;
/**
 *
 * @author pc
 */
public class Demo {
         public static void main(String[] args) throws ParseException, FileNotFoundException, Exception  {
        
         StaffManager st = new StaffManager();
         SeatingManager sm = new SeatingManager();
         Menu mn = new Menu();
         int n=0,a=0,m=0;
         double b,c;
         String s = null;
         do{
          System.out.print("1.Quan ly nhan vien (chon 1) \n");
          System.out.print("2.Quan ly thong tin ban (chon 2) \n");
          System.out.print("3.Quan ly thuc an va thuc uong (chon 3) \n");
          System.out.print("4.Dat ban (chon 4) \n");
          System.out.print("5.Thanh toan hoa don (chon 5) \n");
          System.out.print("6.Thong ke (chon 6) \n");
          System.out.print("7.Thoat (chon 7) \n");
          System.out.print("Nhap lua chon = ");
          n = sc.nextInt();
          String tmp = sc.nextLine();
          System.out.print("\n====================\n");
          switch(n){
              case 1->{
                  do{
                  st.docDs();
                  System.out.print("Xem danh sach nhan vien (chon 1) \n");
                  System.out.print("Tra cuu nhan vien (chon 2) \n");
                  System.out.print("Them nhan vien (chon 3) \n");
                  System.out.print("Xoa nhan vien (chon 4) \n");
                  System.out.print("Cap nhat thong tin nhan vien (chon 5) \n");
                  System.out.print("Xem danh sach nhan vien sinh nhat thang nay (chon 6) \n");
                  System.out.print("Thoat (chon 7) \n");
                  System.out.print("Nhap lua chon = ");
                  a = sc.nextInt();
                  System.out.print("\n====================\n");
                  switch(a){
                      case 1-> {
                          st.hienThiDs();
                      }
                      case 2->{
                          System.out.print("Nhap thong tin muon tra cuu: ");
                          s = sc.nextLine();
                          st.traCuu(s).forEach(h -> h.hienThi());
                      }
                      case 3->{
                          System.out.print("Nhap so luong nhan vien muon them ");
                          m = sc.nextInt();
                          String tmp1 = sc.nextLine();
                          st.nhapDs(m);
                          System.out.print("Danh sach sau khi them \n");
                          st.hienThiDs();
                      }
                      case 4->{
                        System.out.print("Nhap id nhan vien muon xoa ");
                          m = sc.nextInt();
                          String tmp1 = sc.nextLine();
                          st.deleteS(m);
                          System.out.print("Danh sach sau khi xoa\n");
                          st.hienThiDs();
                      }
                      case 5->{}
                      case 6->{
                          System.out.print("Cac nhan vien co sinh nhat trong thang nay \n");
                          st.sinhnhat().forEach(h -> h.hienThi());
                      }
                  }
              }while(a < 7 );
              }
              case 2->{
                  do{
                  sm.docDsB();
                  System.out.print("Xem danh sach ban trong (chon 1) \n");
                  System.out.print("Them Ban (chon 2) \n");
                  System.out.print("Xoa Ban(chon 3) \n");
                  System.out.print("Cap nhat Ban (chon 4) \n");
                  System.out.print("Tim kiem ban theo suc chua (chon 5) \n");
                  System.out.print("Thoat (chon 6) \n");
                  System.out.print("Nhap lua chon = ");
                  a = sc.nextInt();
                  System.out.print("\n====================\n");
                  switch(a){
                      case 1-> {
                          sm.traCuuBanTrong("con").forEach(h -> h.hienThib());
                           System.out.print("\n ");
                      }
                      case 2->{
                         System.out.print("Nhap so luong ban muon them ");
                          m = sc.nextInt();
                          String tmp1 = sc.nextLine();
                          sm.nhapBan(m);
                          System.out.print("Danh sach sau khi them \n");
                          sm.hienThiDsB();
                           System.out.print("\n ");
                      }
                      case 3->{
                          System.out.print("Nhap id ban muon xoa ");
                          m = sc.nextInt();
                          String tmp1 = sc.nextLine();
                          sm.delete(m);
                          System.out.print("Danh sach sau khi xoa\n");
                          sm.hienThiDsB();
                           System.out.print("\n ");
                      }
                      case 4->{}
                      case 5->{
                         System.out.print("Nhap so luong muon tim kiem: ");
                          m = sc.nextInt();
                          sm.traCuuBan(m).forEach(h -> h.hienThib());
                          System.out.print("\n ");
                      }
                  }
              }while(a <6);
              }
               case 3->{
                  do{
                  System.out.print("Them thuc an (chon 1) \n");
                  System.out.print("Xoa thuc an (chon 2) \n");
                  System.out.print("Them thuc uong (chon 3) \n");
                  System.out.print("Xoa thuc uong (chon 4) \n");
                  System.out.print("Tim kiem thuc an (chon 5) \n");
                  System.out.print("Tim kiem thuc uong (chon 6) \n");
                  System.out.print("Tim kiem thuc an theo gia (chon 7) \n");
                  System.out.print("Tim kiem thuc uong theo gia(chon 8) \n");
                  System.out.print("Sap xep thuc an theo giá (chon 9) \n");
                  System.out.print("Sap xep thuc uong theo giá (chon 10) \n");
                  System.out.print("Thoat (chon 11) \n");
                  System.out.print("Nhap lua chon = ");
                  a = sc.nextInt();
                  System.out.print("\n====================\n");
                  if (a==1 ||a==2||a==5||a==7||a==9)
                      mn.docDsMa(1);
                  else
                      mn.docDsMa(2);
                  switch(a){
                      case 1-> {

                          System.out.print("Nhap so luong thuc an muon them ");
                          m = sc.nextInt();
                          String tmp1 = sc.nextLine();
                          if (a==1 ||a==2||a==5||a==7)
                          mn.nhapDish(m);
                          System.out.print("Danh sach sau khi them \n");
                          mn.hienThiMa();
                      }
                      case 2->{
                          
                      }
                      case 3->{
                          System.out.print("Nhap so luong thuc uong muon them ");
                          m = sc.nextInt();
                          String tmp1 = sc.nextLine();
                          mn.nhapDish(m);
                          System.out.print("Danh sach sau khi them \n");
                          mn.hienThiMa();
                      }
                      case 4->{
                       
                      }
                      case 5->{
                        System.out.print("Nhap ten mon ");
                        String tmp1 = sc.nextLine();
                           s = sc.nextLine();
                          mn.traCuuMon(s).forEach(h -> h.hienThiMa());
                      }
                      case 6->{
                          System.out.print("Nhap ten mon ");
                        String tmp1 = sc.nextLine();
                           s = sc.nextLine();
                          mn.traCuuMon(s).forEach(h -> h.hienThiMa());
                      }
                      case 7->{
                          System.out.print("Nhap khoang gia tim kiem tu: ");
                           b= sc.nextInt();
                          String tmp1 = sc.nextLine();
                          System.out.print("Den: ");
                           c = sc.nextInt();
                          String tmp2 = sc.nextLine();
                          //System.out.print(" \n ");
                          mn.traCuuGiaMon(b,c).forEach(h -> h.hienThiMa());
                      }
                      case 8->{
                          System.out.print("Nhap khoang gia tim kiem tu: ");
                           b= sc.nextInt();
                          String tmp1 = sc.nextLine();
                          System.out.print("Den: ");
                           c = sc.nextInt();
                          String tmp2 = sc.nextLine();
                          //System.out.print(" \n ");
                          mn.traCuuGiaMon(b,c).forEach(h -> h.hienThiMa());
                      }
                      case 9->{
                          System.out.print("Giam dan chon 1\n");
                          System.out.print("Tang dan chon -1\n");
                          System.out.print("Nhap lua chon cua ban: ");
                          m = sc.nextInt();
                          String tmp1 = sc.nextLine();
                          mn.sapXep(m);
                          mn.hienThiMa();
                      }
                      case 10->{
                          System.out.print("Giam dan chon 1\n");
                          System.out.print("Tang dan chon -1\n");
                          System.out.print("Nhap lua chon cua ban: ");
                          m = sc.nextInt();
                          String tmp1 = sc.nextLine();
                          mn.sapXep(m);
                          mn.hienThiMa();
                      }
                  }
              }while(a < 11 );
         }}
         }while(n < 7);

        //  staff h1 = new staff("Tran Thi B","Nam", "Tp.HCM", "11/12/1999","02/02/2022","Le tan");
        //  staff h2 = new staff("Dang Van D","Nu", "Binh Duong", "08/10/200/","03/03/2022","Phuc Vu");
      // ql.themHv(h1);
       // ql.themHv(h2);
      // ql.nhapDs(1);
      //  ql.docDs();
//       // ql.traCuu("13/10/2003").forEach(h -> h.hienThi());
//       
//       
//       ql.docDs();
//       ql.sinhnhat().forEach(h -> h.hienThi());
     //   ql.hienThiDs();
      ////    sm.docDsB();
//          sm.nhapBan(1);
          //sm.traCuuBanTrong("con").forEach(h -> h.hienThib());
        //  sm.traCuuBan("12").forEach(h -> h.hienThib());
   //     sm.hienThiDsB();
//        System.out.print("Chon = ");
//        int n = 0;
//        n = sc.nextInt();
//        String tmp = sc.nextLine();
//        mn.docDsMa(n);
       // mn.traCuuMon("Hamburger").forEach(h -> h.hienThiMa());
//       double a = 12000;
//       double b = 20000;
//       mn.traCuuGiaMon(a,b).forEach(h -> h.hienThiMa());
//        mn.nhapDish(1);
//      System.out.print("nhap k = ");
//      int k = 0;
//      k = sc.nextInt();
//      String tmp1 = sc.nextLine();
//      mn.sapXep(k);
//      mn.hienThiMa();
    }
}
