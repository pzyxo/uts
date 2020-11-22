/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Pzyxo
 */
public class randomInt {
    private int angkaAcak1;
    private int angkaAcak2;
    private int jml;
    private int kali;
    private int bagi;
    private int kurang;
    private int cond = 1;
    
    
    
    //method level 1 -3
    private void generator1(){
    Random r = new Random();
    angkaAcak1 = r.nextInt(10 - 0) + 0;
    angkaAcak2 = r.nextInt(10 - 0) + 0;
    }
    
    private void generator2(){
    Random r = new Random();
    angkaAcak1 = r.nextInt(-1 - -10) + -10;
    angkaAcak2 = r.nextInt(-1 - -10) + -10;
    }
    
    private void generator3(){
    Random r = new Random();
    angkaAcak1 = r.nextInt(10 - -10) + -10;
    angkaAcak2 = r.nextInt(10 - -10) + -10;
    }
    //end of level
    
    
    
    public void game(){
        Scanner input = new Scanner(System.in); //agar bisa menginput
            while ( cond == 1 ) {
                
                
                System.out.println("**********************\nGame Math\n**********************");
                System.out.print("Masukkan namamu : ");
                String name = input.next();
                
                while (true){
                    int level = 1;
                    int skor = 90;
                    int lives = 3;
                    
                    
                    System.out.println("**********************\nGame Math\n**********************");
                    System.out.println("Menu :\n1. Penjumlahan\n2. Pengurangan\n3. Keluar");
                    System.out.print("Pilih nomor menu : ");
                    int menu = input.nextInt();

                    if ( menu == 1 ){
                        System.out.println("**********************\nGame Math - Penjumlahan\n**********************");
                        while (true){
                            
                            if (skor <= 100){
                                level = 1;
                                generator1();
                            } else if (skor > 100 && skor <= 200){
                                level = 2;
                                generator2();
                            } else if (skor > 200 && skor < 300){
                                level = 3;
                                generator3();
                            } else if (skor >= 300){
                                System.out.println("Selamat " + name + "!!! Kamu telah menyelesaikan Game\nYuk coba menu Pengurangan ^^");
                                break;
                            }
                            if (angkaAcak1 < 0 && angkaAcak2 < 0){
                                System.out.println("Berapakah hasil dari (" + angkaAcak1 + ") + (" + angkaAcak2 + ")");
                            } else if (angkaAcak1 < 0){
                                System.out.println("Berapakah hasil dari (" + angkaAcak1 + ") + " + angkaAcak2 );
                            } else if (angkaAcak2 < 0){
                                System.out.println("Berapakah hasil dari " + angkaAcak1 + " + (" + angkaAcak2 + ")");
                            } else {
                                System.out.println("Berapakah hasil dari " + angkaAcak1 + " + " + angkaAcak2);
                            }

                            int jwbBenar = angkaAcak1 + angkaAcak2;
                            System.out.print("Jawab : ");
                            int jwb = input.nextInt();
                            if (jwb == jwbBenar){
                                skor += 5;
                                System.out.println("Selamat " + name + ", jawaban anda benar");
                                System.out.println("[Skor: " + skor + "][Lives: " + lives + "][Level: " + level + "]");
                                if (skor % 100 >= 0 && skor % 100 <= 3){
                                    System.out.println("-------------------------------");
                                    System.out.println("Horay, Kamu telah naik level");
                                }
                            } else {
                                skor -= 2;
                                lives -= 1;                                
                                System.out.println("Wahh, salah dehh :((");
                                System.out.println("[Skor: " + skor + "][Lives: " + lives + "][Level: " + level + "]");
                                if ( lives < 1 ){
                                System.out.println("Hai " + name + ". Jangan menyerah yaa untuk mencoba lagi");
                                break;
                                } 
                            }
                            
                            System.out.println("-------------------------------");
                        }
                    } else if ( menu == 2 ){
                        System.out.println("**********************\nGame Math - Pengurangan\n**********************");
                        while (true){
                            if (skor > 100){
                                level = 2;
                            }
                            if (skor > 200){
                                level = 3;
                            } 
                            if(skor >= 300){
                                System.out.println("Selamat " + name + "!!! Kamu telah menyelesaikan Game\nYuk coba menu Penjumlahan ^^");
                                break;
                            }
                            if (skor <= 100){
                                generator1();
                                while (angkaAcak1 < angkaAcak2){
                                    generator1();
                                }
                            } else if (skor > 100 && skor <= 200){
                                generator2();
                            } else if (skor > 200){
                                generator3();
                            }
                            if (angkaAcak1 < 0 && angkaAcak2 < 0){
                                System.out.println("Berapakah hasil dari (" + angkaAcak1 + ") - (" + angkaAcak2 + ")");
                            } else if (angkaAcak1 < 0){
                                System.out.println("Berapakah hasil dari (" + angkaAcak1 + ") - " + angkaAcak2 );
                            } else if (angkaAcak2 < 0){
                                System.out.println("Berapakah hasil dari " + angkaAcak1 + " - (" + angkaAcak2 + ")");
                            } else {
                                System.out.println("Berapakah hasil dari " + angkaAcak1 + " - " + angkaAcak2);
                            }

                            int jwbBenar = angkaAcak1 - angkaAcak2;
                            System.out.print("Jawab : ");
                            int jwb = input.nextInt();
                            if (jwb == jwbBenar){
                                skor += 5;
                                System.out.println("Selamat " + name + ", jawaban anda benar");
                                System.out.println("[Skor: " + skor + "][Lives: " + lives + "][Level: " + level + "]");
                                if (skor % 100 == 0){
                                    System.out.println("-------------------------------");
                                    System.out.println("Horay, Kamu telah naik level");
                                }
                            } else {
                                skor -= 2;
                                lives -= 1;                                
                                System.out.println("Wahh, salah dehh :((");
                                System.out.println("[Skor: " + skor + "][Lives: " + lives + "][Level: " + level + "]");
                                if ( lives < 1 ){
                                System.out.println("Hai " + name + ". Jangan menyerah yaa untuk mencoba lagi");
                                break;
                                } 
                            }
                            System.out.println("-------------------------------");
                        }
                    } else if (menu == 3){
                        cond -= 1;
                        break;
                    } 
                }
            }
    }
}

