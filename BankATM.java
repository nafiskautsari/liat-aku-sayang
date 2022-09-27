/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pert5;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class BankATM {

    public static void main(String[] args) {

        Scanner src = new Scanner(System.in);
        int jmlhUang, saldo, pilihan;
        saldo = 100000;

        System.out.println("Menu ATM");
        System.out.println("1. Cek Saldo");
        System.out.println("2. Simpan Uang");
        System.out.println("3. Ambil uang");

        System.out.print("Pilih menu : ");
        pilihan = src.nextInt();

        if (pilihan == 1) {

            System.out.println("Jumlah saldo anda : " + saldo);

        } else if (pilihan == 2) {

            System.out.print("Jumlah uang yang ingin anda simpan : ");
            jmlhUang = src.nextInt();
            
            if (jmlhUang < 0){
                
                System.out.println("Gak boleh negatif mas");
                
            } else {
                
            saldo += jmlhUang;
            System.out.println("Saldo anda sekarang : " + saldo);
            
            }

        } else if (pilihan == 3) {

            System.out.print("Jumlah uang yang ingin anda ambil");
            jmlhUang = src.nextInt();

            if (jmlhUang > saldo) {

                System.out.println("Saldo anda tidak cukup");

            } else {

                saldo -= jmlhUang;
                System.out.println("Saldo anda sekarang : " + saldo);
                
            }

        } else {

            System.out.println("ERROR!!!!!!");

        }

    }
}
