/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasTokoOnline;

/**
 *
 * @author Galaxy
 */
public class Main {

    public static void main(String[] args) {
        Barang barang = new Barang();
        Karyawan karyawan = new Karyawan();
        Member member = new Member();
        Laporan laporan = new Laporan();
        Transaksi transaksi = new Transaksi();
        
        laporan.laporan(barang);
        laporan.laporan(member);
        laporan.laporan(transaksi, barang);
        
        
    }

}
