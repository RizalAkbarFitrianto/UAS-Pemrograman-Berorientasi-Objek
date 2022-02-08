/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b1_Rizal;

/**
 *
 * @author LENOVO
 */
public class Luas23420001 {
    
    /*----- fungsi hitung luas persegi panjang -----*/
    public int LuasPersegiPanjang(int p, int l)
{
return p * l;
}

    /*----- fungsi hitung luas persegi -----*/
    public int LuasPersegi(int sisi)
{
return (int)Math.pow((double)sisi,2.0); //pow=power=pangkat
}
    
    /*----- fungsi hitung luas lingkaran -----*/
    public float LuasLingkaran(int jari2)
{
return (float)(Math.PI * Math.pow((double)jari2,2.0));
}

}
