/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.btl;

/**
 *
 * @author pc
 */
public class ôn {
    class Parent {
        protected static int x;
        public Parent(){
            x = 0;
    }
        public final void show(){
            System.out.println(x);
        }
        protected void inc1(){
            x++;
        }
        private void inc2(){
            x+=2;
        }
        public void inc(){
            this.inc1();
            this.inc2();
            x+=2;
        }
        class child extends Parent{
            public void inc1 () {
                x+=5;
            }
            public void inc2 () {
                x+=10;
            }
        }
    }
     public void main(String[] args){
         Parent o1 = new Parent();
         o1.inc();
         o1.show();
     }
}
