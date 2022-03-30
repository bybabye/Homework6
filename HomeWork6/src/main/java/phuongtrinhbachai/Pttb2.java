/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phuongtrinhbachai;

/**
 *
 * @author OS
 */
public class Pttb2 {
    public int a;
    public int b;
    public int c;
    public String result;
    
    
    void Pttb1() {
        // bx + c = 0
        // a = 0 
        if(b == 0 && c == 0){
            result = "Phuong trinh co vo so nghiem";
        } else if(b == 0 && c != 0) {
            result = "Phuong trinh vo nghiem";
        } else{
            float x = (float) - c / b;
            result = "Phuong trinh co  nghiem  : " + x;
        }
    }
    
    void Pttb2(){
        // ax^2 + bx + c = 0
        if(a == 0) { // bx + c = 0
            Pttb1();
        }else{
            float del = (float) (b*b) - (4 * a * c);
            if(del < 0){
                result = "Phuong trinh da cho vo nghiem";
            } else if(del == 0) {
                float x = (float) - b / (2 * a);
                result = "Phuong trinh co nghiem kep x1 = x2  : " + x;
            }else{
                float x1 = (float) (-b + del)/(2*a);
                float x2 = (float) (-b - del)/(2*a);
                result = "Phuong trinh co nghiem kep x1 = " + x1 + ", x2 = " + x2;
            }
        }
    }
    
}
