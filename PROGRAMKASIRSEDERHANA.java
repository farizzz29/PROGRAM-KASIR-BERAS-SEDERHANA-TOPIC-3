package program.kasir.sederhana;
import java.util.Scanner;
public class PROGRAMKASIRSEDERHANA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double harga, jumlah, total, diskon, hargadiskon, uangpembeli, uangkembali;
        
        System.out.print("masukkan jumlah beras yang ingin dibeli(KG)\t:");
        jumlah=input.nextDouble();
        
        System.out.print("masukkan harga beras per kilo\t :Rp");
        harga=input.nextDouble();
        
       total=harga*jumlah;
       
        System.out.println("total belanjaan\t:Rp"+ total);
        
        diskon=total*0.05;
        System.out.println("jumlah diskon\t:Rp"+ diskon);
        
        hargadiskon=total-diskon;
        
        System.out.println("harga setelah diskon\t:Rp"+ hargadiskon);
        System.out.print("uang pembeli\t:Rp");
        
        uangpembeli=input.nextDouble();
        
        uangkembali=uangpembeli-hargadiskon;
        
        System.out.println("uang kembali\t:Rp"+ uangkembali);
        
        
        
        
        
        
    }
    
}
