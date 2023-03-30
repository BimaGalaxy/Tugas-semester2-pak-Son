/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasTokoOnline;

import java.util.ArrayList;

/**
 *
 * @author Galaxy
 */
public class Member implements User {

    private ArrayList<String> namaMember = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> saldo = new ArrayList<Integer>();

    public Member() {
        this.namaMember.add("Bima");
        this.alamat.add("Pakis");
        this.telepon.add("082232826073");
        this.saldo.add(1000000);

        this.namaMember.add("Galaxy");
        this.alamat.add("Malang");
        this.telepon.add("08322231954");
        this.saldo.add(20000);
    }

    public void setSaldo(int saldo) {
        this.saldo.add(saldo);
    }

    public int getSaldo(int idMember) {
        return this.saldo.get(idMember);
    }

    public void editSaldo(int idMember, int saldo) {
        this.saldo.set(idMember, saldo);;
    }

    public int getJmlMember() {
        return this.saldo.size();
    }

    @Override
    public void setNama(String namaMember) {
        this.namaMember.add(namaMember);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    @Override
    public String getNama(int idMember) {
        return this.namaMember.get(idMember);
    }

    @Override
    public String getAlamat(int idMember) {
        return this.alamat.get(idMember);
    }

    @Override
    public String getTelepon(int idMember) {
        return this.telepon.get(idMember);
    }

}
