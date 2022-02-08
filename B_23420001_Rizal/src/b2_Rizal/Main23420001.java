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
public class Main23420001 extends b2_Rizal.Volume23420001 {
    static Scanner input = new Scanner (System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Main23420001 hitung = new Main23420001();
	int pilih;
	do
	{
	System.out.println(" VOLUME BANGUN 3D");
	System.out.println(" ----------------");
	System.out.println(" 1. BALOK");
	System.out.println(" 2. KUBUS");
	System.out.println(" 3. TABUNG");
	System.out.println(" 4. KERUCUT");
	System.out.println(" 5. LIMAS SEGIEMPAT");
	System.out.println(" 6. KELUAR");
	System.out.print("\n PILIHAN [1-6] : ");
	pilih = input.nextInt();
	switch (pilih)
	{
	case 1 : hitung.Balok();
        break;
	case 2 : hitung.Kubus();
        break;
	case 3 : hitung.Tabung();
        break;
	case 4 : hitung.Kerucut();
        break;
	case 5 : hitung.LimasSegiempat();
        break;
        case 6 : System.exit(0);
        break;
        default : {
            System.out.println("\n\n Salah input nomor pilihan...");
            System.out.println(" Coba lagi...");
            }
	}
	if (pilih != 6)
	{
	System.out.println();
	}
        System.out.println();
            } while (pilih != 6);
                }
}
