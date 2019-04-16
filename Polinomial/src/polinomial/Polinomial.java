
package polinomial;

import java.util.Scanner;

public class Polinomial {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        System.out.print("input:");
        double a = in.nextDouble(); //a adalah nilai konstanta dari ax^2
        double b = in.nextDouble();
        double c = in.nextDouble();
        
        if (a != 0){
            double D = (b * b) - (4 * a * c); 
            double x1, x2, x11, x12;
            double ts = -b/(2 * a);
            double y = (a*ts*ts) + (b*ts) + c;
            String X1, X2, Ts = null, lokal = null;
            
        if (D>=0){
            x1 = (-b+Math.sqrt(D)) / 2*a; X1 = ("" + x1);
            x2 = (-b-Math.sqrt(D)) / 2*a; X2 = ("" + x2);
        }
        else{
            x1 = -b / 2*a; x11 = Math.sqrt(Math.abs(D))/ 2*a; X1 = ("" + x1 + "+" + x11 + "i");
            x2 = -b / 2*a; x12 = -Math.sqrt(Math.abs(D)) / 2*a; X2 = ("" + x2 + "+" + x11 + "i");
        }
        if (a>0 || 2*a>0){
            Ts = "Atas"; lokal ="minimum";}
        else if (a<0 || 2*a < 0){
            Ts = "Bawah"; lokal = "maksimum";}
        
        System.out.println("\nOutput: ");
        System.out.println("Polinomial" + a+"x^2 +" + b+"x+ " +c + "memiliki");
        System.out.println("1. Diskriminan              :" + D);
        System.out.println("2. Akar akar dari polinomial:" + X1 + " dan " + X2);
        System.out.println("3. Titik stasioner          : (" + ts + "," + y +")");
        System.out.println("4. Kecekungan kurva         : " + Ts);
        System.out.println("5. Nilai " + lokal + "lokal :" + y);
        }
        
        else
            System.out.println("\nOutput: \nNilai a tidak boleh 0!");
    }
        }
       