/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b2_Rizal;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Volume23420001 extends b1_Rizal.Luas23420001 {
    Scanner InputData = new Scanner (System.in);
    
    /*----- fungsi volume balok -----*/
    public int VolumeBalok(int p, int l, int t)
{
return LuasPersegiPanjang(p,l) * t;
}
    /*----- prosedur volume balok -----*/
public void Balok()
{
    
int p;
int l;
int t;
System.out.println("\n\n VOLUME BALOK");
System.out.println(" ------------");
System.out.print(" PANJANG : ");
p = InputData.nextInt();
System.out.print(" LEBAR : ");
l = InputData.nextInt();
System.out.print(" TINGGI : ");
t = InputData.nextInt();
System.out.print(" VOLUME : ");
System.out.print(VolumeBalok(p,l,t));
}

    /*----- fungsi volume kubus -----*/
public int VolumeKubus(int sisi)
{
return (int)(LuasPersegi(sisi) * sisi); 
}

    /*----- prosedur kubus -----*/
public void Kubus()
{
int sisi;
System.out.println("\n\n VOLUME KUBUS");
System.out.println(" ------------");
System.out.print(" PANJANG SISI : ");
sisi = InputData.nextInt();
System.out.print(" VOLUME : ");
System.out.print(VolumeKubus(sisi));
}

    /*----- fungsi hitung volume tabung -----*/
public float VolumeTabung(int jari2, int tinggi)
{
return (float)(LuasLingkaran(jari2) * tinggi);
}

    /*----- prosedur tabung -----*/
public void Tabung()
{
int jari2;
int tinggi;
System.out.println("\n\n VOLUME TABUNG");
System.out.println(" -------------");
System.out.print(" JARI-JARI : ");
jari2 = InputData.nextInt();
System.out.print(" TINGGI : ");
tinggi = InputData.nextInt();
System.out.print(" VOLUME : ");
System.out.print(VolumeTabung(jari2,tinggi));
}

    /*----- fungsi hitung volume kerucut -----*/
public float VolumeKerucut(int jari2, int tinggi)
{
return (float)((1.0 / 3) * LuasLingkaran(jari2) * tinggi);
}

    /*----- prosedur kerucut -----*/
public void Kerucut()
{
int jari2;
int tinggi;
System.out.println("\n\n VOLUME KERUCUT");
System.out.println(" --------------");
System.out.print(" JARI-JARI : ");
jari2 = InputData.nextInt();
System.out.print(" TINGGI : ");
tinggi = InputData.nextInt();
System.out.print(" VOLUME : ");
System.out.print(VolumeKerucut(jari2,tinggi));
}

    /*----- fungsi hitung volume limas segiempat -----*/
public float VolumeLimasSegi4(int panjang, int lebar, int tinggi)
{
return (float)((1.0 / 3) * LuasPersegiPanjang(panjang,lebar) * tinggi);
}

    /*----- prosedur limas segi empat -----*/
public void LimasSegiempat()
{
int panjang;
int lebar;
int tinggi;
System.out.println("\n\n VOLUME LIMAS SEGI EMPAT");
System.out.println(" -----------------------");
System.out.print(" PANJANG : ");
panjang = InputData.nextInt();
System.out.print(" LEBAR : ");
lebar = InputData.nextInt();
System.out.print(" TINGGI : ");
tinggi = InputData.nextInt();
System.out.print(" VOLUME : ");
System.out.print(VolumeLimasSegi4(panjang,lebar,tinggi));
}

}
