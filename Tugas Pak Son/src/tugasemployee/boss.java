/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasemployee;

import java.util.Scanner;

/**
 *
 * @author Galaxy
 */
public class boss extends employee {

    String statVal;
    int totalgaji;

    @Override
    public void isiData() {
        System.out.println("");
        System.out.println("====== BOSS ======");
        System.out.println("Nama                : " + super.nama);
        System.out.println("Nomor induk pegawai : " + super.nip);
        System.out.println("Status              : " + statVal);
        System.out.println("Jam kerja perhari   : " + super.jamKerja);
        System.out.println("Gaji perjam         : " + super.gaji);

    }

    @Override
    public void inputData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama : ");
        super.nama = input.nextLine();
        System.out.print("Masukkan NIP  : ");
        super.nip = input.nextInt();
        System.out.print("sudah menikah?\njawab dengan true/false : ");
        super.status = input.nextBoolean();

        if (super.status == true) {
            statVal = "Sudah menikah";
        } else {
            statVal = "Belum menikah";
        }

        System.out.print("jam kerja perhari : ");
        super.jamKerja = input.nextInt();
        System.out.print("Gaji perjam :");
        super.gaji = input.nextInt();

        // sudah menikah jam kerja normal
        if (super.status == true && super.jamKerja == 8) {

            isiData();
            totalgaji = super.gaji * super.jamKerja * 30;
            super.bonusnikah = 5000000;
            int totalbonus = super.bonusnikah + totalgaji;
            System.out.println("bonus menikah       : " + super.bonusnikah);
            System.out.println("Total gaji          : " + totalbonus);
            System.out.println("==================");

            // Belum menikah jam kerja normal
        } else if (super.status == false && super.jamKerja == 8) {

            isiData();
            totalgaji = super.gaji * super.jamKerja * 30;
            System.out.println("bonus               : Tidak ada bonus");
            System.out.println("Total gaji          : " + totalgaji);
            System.out.println("==================");

            // menikah dan lembur
        } else if (super.status == true && super.jamKerja > 8) {

            isiData();
            totalgaji = super.gaji * super.jamKerja * 30;
            super.bonusnikah = 5000000;
            super.bonuslembur = 2000000;
            int totalbonus = super.bonusnikah + super.bonuslembur + totalgaji;
            System.out.println("bonus menikah       : " + super.bonusnikah);
            System.out.println("bonus lembur        : " + super.bonuslembur);
            System.out.println("Total gaji          : " + totalbonus);
            System.out.println("==================");

            // lembur belum menikah
        } else if (super.status == false && super.jamKerja > 8) {

            isiData();
            totalgaji = super.gaji * super.jamKerja * 30;
            super.bonuslembur = 2000000;
            int totalbonus = super.bonuslembur + totalgaji;
            System.out.println("bonus lembur        : " + super.bonuslembur);
            System.out.println("Total gaji          : " + totalbonus);
            System.out.println("==================");

        }

    }

}
