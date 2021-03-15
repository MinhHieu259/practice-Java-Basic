/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai21_25;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai21_DiemDaiHoc {   
    public static double tongdiem(double dc, double d1, double d2, double d3,String kv, int dt){
        double tong=0 ;
            if("x".equals(kv) && dt==0)
            tong=d1+d2+d3;
        else
            if("x".equals(kv) && dt==1)
            tong=d1+d2+d3+2.5;
        else
            if("x".equals(kv) && dt==2)
            tong=d1+d2+d3+1.5;
        else
            if("x".equals(kv) && dt==3)
            tong=d1+d2+d3+1;
        else
            if("a".equals(kv)&&dt==1)
            tong=d1+d2+d3+2+2.5;
        else
            if("a".equals(kv)&&dt==2)
            tong=d1+d2+d3+2+1.5;
        else
            if("a".equals(kv) && dt==3)
            tong=d1+d2+d3+2+1;
        else
            if("a".equals(kv) && dt==0)
            tong=d1+d2+d3+2;
        else
            if("b".equals(kv)&&dt==1)
            tong=d1+d2+d3+1+2.5;
        else
            if("b".equals(kv)&&dt==2)
            tong=d1+d2+d3+1+1.5;
        else
            if("b".equals(kv) && dt==3)
            tong=d1+d2+d3+1+1;
        else
                 
            if("b".equals(kv) && dt==0)
            tong=d1+d2+d3+1;      
            if("c".equals(kv)&&dt==1)
            tong=d1+d2+d3+0.5+2.5;
        else
            if("c".equals(kv)&& dt==2)
            tong=d1+d2+d3+0.5+1.5;
        else
            if("c".equals(kv) && dt==3)
            tong=d1+d2+d3+0.5+1;
        else
            if("c".equals(kv) && dt==0)
            tong=d1+d2+d3+0.5;
        return tong;
    }
    public static void kiemtra(double sum, double diemchuan){
        if(sum>diemchuan)
            System.out.println("Đậu["+sum+"]>["+diemchuan+"]");
        else
            System.out.println("Rớt["+sum+"]<["+diemchuan+"]");
    }
    public static void main(String[] args) {
        do
        {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập điểm chuẩn:");
            double diemchuan=sc.nextDouble();
        System.out.println("Nhập điểm của 3 môn:");
            double d1=sc.nextDouble();
            double d2=sc.nextDouble();
            double d3=sc.nextDouble();
        System.out.println("Nhập khu vực(A,B,C,X):");
            String kv=new Scanner(System.in).nextLine();
        System.out.println("Nhập đối tượng(1,2,3,0):");
        int dt=sc.nextInt();
        double kq=tongdiem( diemchuan,  d1,  d2,  d3, kv,  dt);
        System.out.println("Tổng điểm: "+kq);
            kiemtra( kq,  diemchuan);
            System.out.println("Bạn có muốn làm tiếp không ? (c/k)");
            String line=new Scanner(System.in).nextLine();
            if(line.equalsIgnoreCase("k"))
                break;
        }
        while(true);
        System.out.println("Bye. See you later");
}
}
    

