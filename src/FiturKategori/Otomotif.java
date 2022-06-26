package FiturKategori;
import java.util.Scanner;
//konsep inheritance
//subclass
public class Otomotif extends Elektronik{
    Scanner user =new Scanner(System.in);
    //overriding method
    public void produk(){
        System.out.println("");
        System.out.println("Categories Otomotif");
        System.out.println("-Oli Motor Evalube- Rp. 50000");
    }
    //overriding method
    public void Beli(){
        produk="Oli Motor Evalube";
        HargaProduk = 50000;
    //Jasa Pengiriman   
    System.out.println("");
    System.out.println("Jasa Kirim");
    System.out.println("Pilih Jasa Kirim");
    System.out.println("1. JNE regular");
    System.out.println("2. SiCepat REG");
    System.out.println("3. J&T Express");
    System.out.println("4. Ninja Xpress");
    System.out.println("5. ID Express");
          System.out.print("Input pilihanmu : ");
          int Kurir= user.nextInt();
          //seleksi kondisi switch case
                    switch (Kurir){
              case 1 :
                  JasaKirim = "JNE regular"; BiayaOngkir = 50000;
                  break;
              case 2 :
                  JasaKirim = "SiCepat REG"; BiayaOngkir = 40000;
                  break;
              case 3:
                  JasaKirim = "J&T Express"; BiayaOngkir= 60000;
                  break;
              case 4:
                  JasaKirim= "Ninja Xpress"; BiayaOngkir = 50000;
                  break;
              case 5:
                  JasaKirim = "JNE regular"; BiayaOngkir = 40000;
                  break;
                    }

    //Voucher GratisOngkir
    int pilihGratisOngkir;
    System.out.println("");
    System.out.println("*Gratis Ongkir*"); 
    System.out.println("Pilih voucher Gratis ongkir kamu");
    System.out.println("1. Gratis ongkir 10%");
    System.out.println("2. Gratis ongkir 20%");
    System.out.println("3. Gratis ongkir 30%");
    System.out.println("4. Gratis ongkir 40%");
    System.out.println("5. Gratis ongkir 50%");
    System.out.print("Input Pilihanmu : ");
    pilihGratisOngkir=user.nextInt();
    //seleksi kondisi if else if
    if (pilihGratisOngkir==1){
    DiskonOngkir=BiayaOngkir*10/100;
    }
    else if (pilihGratisOngkir==2){
    DiskonOngkir=BiayaOngkir*20/100;
 
    }
    else if (pilihGratisOngkir==3){
    DiskonOngkir=BiayaOngkir*30/100;
    }
    else if (pilihGratisOngkir==4){
    DiskonOngkir=BiayaOngkir*40/100;   
    }
    else if (pilihGratisOngkir==5){
    DiskonOngkir=BiayaOngkir*50/100; 
    }
    
    //Voucher Diskon dan Cashback
    System.out.println("");
    System.out.println("*Voucher/Diskon*");
    System.out.println("Pilih voucher Diskon / Cashback kamu");  
    System.out.println("1. Diskon 10%");
    System.out.println("2. Diskon 30%");
    System.out.println("3. Diskon 50%");
    System.out.print("Input Pilihanmu : ");
    int pilihDiskon=user.nextInt();
    //seleksi kondisi if else if
    if (pilihDiskon==1){
    DiskonBarang=HargaProduk*10/100;
    }
    else if (pilihDiskon==2){
    DiskonBarang=HargaProduk*30/100;
    }
    else if (pilihDiskon==3){
    DiskonBarang=HargaProduk*50/100;
    }   
    }
    //overriding method
    public void InputOutputUser(){
        int TotalBayar = HargaProduk+BiayaOngkir-DiskonOngkir-DiskonBarang;
        System.out.print("Input Penerima : ");
        String penerima=user.next();
        System.out.print("Input Alamat   : ");
        String alamat=user.next();
        System.out.println("");
        System.out.println("-Rincian Transaksi-");
        System.out.println("Penerima      : "+penerima);
        System.out.println("Alamat        : "+alamat);
        System.out.println("");
        System.out.println("Nama Produk   : "+produk);
        System.out.println("Jasa Kirim    : "+JasaKirim);
        System.out.println("Harga Produk  : Rp "+HargaProduk);
        System.out.println("Ongkir        : Rp "+BiayaOngkir);
        System.out.println("Diskon Produk : Rp "+DiskonBarang);
        System.out.println("Diskon Ongkir : Rp "+DiskonOngkir);
        System.out.println("Total Bayar   : Rp "+TotalBayar);
    }
}

