/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projek.gui;
import java.util.Scanner;

/**
 *
 * @author BuahPir
 */
public class ProjekGUI {
    public static float volumeBalok(float panjang, float lebar, float tinggi) {
        float volume = panjang * lebar * tinggi;
        return volume;
    }
    public static void main(String[] args) {
        float panjang, lebar, tinggi;
        Scanner console = new Scanner(System.in);
        
        System.out.print("Masukkan panjang balok :");
        panjang = console.nextFloat();
        
        System.out.print("Masukkan lebar balok :");
        lebar = console.nextFloat();
        
        System.out.print("Masukkan tinggi balok :");
        tinggi = console.nextFloat();
    }
}
