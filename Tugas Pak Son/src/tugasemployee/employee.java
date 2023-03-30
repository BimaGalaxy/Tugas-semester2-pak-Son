package tugasemployee;

import java.util.Scanner;

public class employee {

    private String jab;
    int nip, jabatan;
    boolean status;
    String nama;
    int gaji, bonusnikah, bonuslembur, jamKerja;

    public void Jabatan() {
        Scanner input = new Scanner(System.in);
        System.out.println("=======================");
        System.out.println("jabatan\n"
                + "1. Boss\n"
                + "2. Manager\n"
                + "3. Karyawan\n"
                + "4. Security");
        System.out.println("=======================");
        System.out.print("Masukkan jabatan anda : ");
        jabatan = input.nextInt();
        System.out.println("=======================");

        if (jabatan == 1) {
            boss pBoss = new boss();
            pBoss.inputData();
        } else if (jabatan == 2) {
            manager pManager = new manager();
            pManager.inputData();
        } else if (jabatan == 3) {
            Karyawan pCleaningService = new Karyawan();
            pCleaningService.inputData();
        } else if (jabatan == 4) {
            security pSecurity = new security();
            pSecurity.inputData();
        } else {
            System.out.println("Data tidak valid");
        }

    }

    public void dataKaryawan() {

    }

    public void inputData() {

    }

    public void isiData() {

    }

}
