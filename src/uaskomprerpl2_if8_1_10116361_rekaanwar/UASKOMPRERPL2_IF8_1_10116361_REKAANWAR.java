/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uaskomprerpl2_if8_1_10116361_rekaanwar;

import java.util.Scanner;

/**
 *
 * @author RSA
 * HARI/TANGGAL : Kamis, 7 Februari 2019

NO SOAL : 1

KELAS : IF8

NIM : 10110269

NAMA : RIZKI ADAM KURNIAWAN
 */
public class UASKOMPRERPL2_IF8_1_10116361_REKAANWAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          String grade;
        double mm, na;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Nilai Akhir Anda  : " );
        na =input.nextDouble();

        mm = na;

        if(mm >=80)
        {
        grade= "A" ;
        }
        else if (mm >=68)
        {
        grade= "B" ;
        }

        else if (mm >=56)
        {
        grade= "C" ;
        }
        else if (mm >=45)
        {
        grade= "D" ;
        }
        else
        {
        grade="E" ;

        }
        
        System.out.println("Index Anda adalah  "+ grade);
    }
    
}
