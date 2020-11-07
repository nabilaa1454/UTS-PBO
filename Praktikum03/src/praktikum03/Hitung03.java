/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum03;

/**
 *
 * @author Nabilaa Noor'Aini 
 */
import java.util.Random;
import java.util.Scanner;

public class Hitung03 {
    int Tebakan;
    int AngkaBenar;
    int Score=100;
    int Bonus=5;
      
    void menebak(){
        Random r1 = new Random();
        this.AngkaBenar = r1.nextInt(101);
        System.out.println("Hai... Nama saya Mr. Liem, saya telah meilih bilangan bulat secara acak antara 0 s/d\n" + "100. Silahkan ditebak ya! ");
        
        do{
           Scanner s1 = new Scanner(System.in);
           System.out.println("Tebakan Anda = ");
           this.Tebakan = s1.nextInt();
           
           if(Score == 0){
               System.out.println("Yahhh... GAME OVER");
               break;
           }
           if(Tebakan > AngkaBenar){
               System.out.println("Hehey... Tebakan anda terlalu besar");
               Score -=2;
               Bonus -=1;
           }else if (Tebakan < AngkaBenar){
               System.out.println("Hehey... Tebakan anda terlalu kecil");
               Score -=2;
               Bonus -=1;
           }else{
               System.out.println("Yeayyy... Tebakan anda benar");
               if(Bonus > 0){
                   Score +=50;
                   System.out.println("Total Nilai Anda = " + Score);
                   break;
               }
           } 
        }while(Tebakan != AngkaBenar);
    }
}  



        