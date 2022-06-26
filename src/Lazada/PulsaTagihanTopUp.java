package Lazada;
import java.util.Scanner;
//implementasi class interface kosong
public class PulsaTagihanTopUp implements Kosong{
    private String NominalPulsa;
    protected String TokenListrik, NominalDana;
    private int HargaPulsa, HargaDana;
    Scanner scanner = new Scanner(System.in);
    
   //overriding Method
    public void pilihanPulsaTagihanTopUp(){
    System.out.println("*Pulsa, Tagihan & Top Up ovo");
    System.out.println("1. Pulsa");
    System.out.println("2. Token Listrik");
    System.out.println("3. Top Up ovo");
    System.out.print("Masukkan pilihanmu : ");
    }
    //overriding Method
    public void pulsa (){
        System.out.println("");
        System.out.print("Masukkan nomor HP : ");
        String NomorHp=scanner.nextLine();
        System.out.println("Pilihan Pulsa");
        System.out.println("1. Nominal 5.000 = Rp 6000");
        System.out.println("2. Nominal 10.000 = Rp 11000");
        System.out.println("3. Nominal 20.000 = Rp 21000");
        System.out.println("4. Nominal 30.000 = Rp 31000");
        System.out.println("5. Nominal 40.000 = Rp 41000");
        System.out.println("6. Nominal 50.000 = Rp 51000");
        System.out.print("Masukkan pilihanmu : ");
        int PilihanPulsa = scanner.nextInt();
        //seleksi kondisi switch case
        switch (PilihanPulsa){
            case 1: 
                NominalPulsa = "5.000";
                HargaPulsa = 6000;
                break;
            case 2:
                NominalPulsa = "10.000";
                HargaPulsa = 11000;
                break;
            case 3 :
                NominalPulsa = "20.000";
                HargaPulsa = 21000;
                        break;
            case 4 :
                NominalPulsa = "30.000";
                HargaPulsa = 31000;
                break;
            case 5 :
                NominalPulsa = "40.000";
                HargaPulsa = 41000;
                break;
            case 6 :
                NominalPulsa = "50.000";
                HargaPulsa = 51000;
                break;
            default :
            System.out.println("Pilihanmu tidak ada");
             break; 
        }
        System.out.println("*Nota");
        System.out.println("Nomer Hp      = " +NomorHp);
        System.out.println("Nominal Pulsa = " +NominalPulsa);
        System.out.println("Harga Pulsa   = Rp " +HargaPulsa);
    }
    //overriding Method
public void TokenListrik(){
    System.out.println("");
  System.out.print("Masukkan ID PLN : ");
        String IDpln=scanner.nextLine();
        System.out.println("Pilihan Produk");
        System.out.println("1. Token 20.000 = Rp 21000");
        System.out.println("2. Token 50.000 = Rp 51000");
        System.out.print("Masukkan pilihanmu : ");
        int PilihanPulsa = scanner.nextInt();
        //seleksi kondisi switch case
                switch (PilihanPulsa){
            case 1: 
                NominalPulsa = "20.000";
                TokenListrik = "1245 5674 2456 2786 0987";
                HargaPulsa = 21000;
                break;
            case 2:
                NominalPulsa = "50.000";
                TokenListrik = "9076 5674 2456 2786 9654";
                HargaPulsa = 51000;
                break;
            default :
            System.out.println("Pilihan yang anda masukkan tidak ada");
             break; 
        }
        System.out.println("*Nota");
        System.out.println("Id PLN        = " +IDpln);
        System.out.println("Token Listrik = " +TokenListrik);
        System.out.println("Nominal Pulsa = " +NominalPulsa);
        System.out.println("Harga Pulsa   = Rp " +HargaPulsa);
}
 public void TopUpDana(){
     System.out.println("");
        System.out.print("Masukkan nomor ovo : ");
        String NomorDana=scanner.nextLine();
        System.out.println("Mau TopUp berapa");
        System.out.println("1. Nominal 5.000 = Rp 7000");
        System.out.println("2. Nominal 10.000 = Rp 12000");
        System.out.println("3. Nominal 20.000 = Rp 22000");
        System.out.println("4. Nominal 30.000 = Rp 32000");
        System.out.println("5. Nominal 40.000 = Rp 42000");
        System.out.println("6. Nominal 50.000 = Rp 52000");
        System.out.print("Masukkan pilihanmu : ");
        int PilihanPulsa = scanner.nextInt();
        //seleksi kondisi switch case
        switch (PilihanPulsa){
            case 1: 
                NominalDana = "5.000";
                HargaDana = 7000;
                break;
            case 2:
                NominalDana = "10.000";
                HargaDana = 12000;
                break;
            case 3 :
                NominalDana = "20.000";
                HargaDana = 22000;
                break;
            case 4 :
                NominalDana = "30.000";
                HargaDana = 32000;
                break;
            case 5 :
                NominalDana = "40.000";
                HargaDana = 42000;
                break;
            case 6 :
                NominalPulsa = "50.000";
                HargaDana = 52000;
                break;
            default :
            System.out.println("Pilihanmu tidak ada");
             break; 
        }
        System.out.println("*Nota");
        System.out.println("Nomer Dana     = " +NomorDana);
        System.out.println("Nominal Pulsa = " +NominalDana);
        System.out.println("Harga Pulsa   = Rp " +HargaDana);
    }
}
