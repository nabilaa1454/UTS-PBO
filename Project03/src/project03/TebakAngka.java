/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project03;

/**
 *
 * @author Nabilaa Noor'Aini
 */
import java.util.Scanner;
import java.util.Random;

public class TebakAngka {
    int Tebakan;
    int AngkaBenar;
    
    void menebak(){
        Random r1 = new Random();
        this.AngkaBenar = r1.nextInt(101);
        System.out.println("Hai... Nama saya Mr. Liem, saya telah meilih bilangan bulat secara acak antara 0 s/d\n" + "100. Silahkan ditebak ya! ");
        
        do{
           Scanner s1 = new Scanner(System.in);
           System.out.println("Tebakan Anda = ");
           this.Tebakan = s1.nextInt();
           
           if(Tebakan > AngkaBenar){
               System.out.println("Hehey... Tebakan anda terlalu besar");
           }else if (Tebakan < AngkaBenar){
               System.out.println("Hehey... Tebakan anda terlalu kecil");
           }else{
               System.out.println("Yeayyy... Tebakan anda benar");
               break;
           } 
        }while(Tebakan != AngkaBenar);
    }
}  

