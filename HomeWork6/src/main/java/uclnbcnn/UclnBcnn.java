/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uclnbcnn;

/**
 *
 * @author OS
 */
public class UclnBcnn {
    public int a;// so thu nhat
    public int b; // so thu hai
    
    
    int USCLN(int a,int b){
        if (b == 0) 
            return a;
        return USCLN(b, a % b);
    }
    int BSCNN(int a, int b) {
        return (a * b) / USCLN(a, b);
    }
}
