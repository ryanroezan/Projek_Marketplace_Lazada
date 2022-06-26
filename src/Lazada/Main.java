package Lazada;
import FiturKategori.Elektronik;
import FiturKategori.Food;
import FiturKategori.Fashion;
import FiturKategori.Laptop;
import FiturKategori.Otomotif;
import java.util.Scanner;
 class main{
    public static void main(String[] args) {
        int lanjut = 0;
        Scanner user = new Scanner(System.in);
        //objek
        Elektronik elektronik = new Elektronik();
        Fashion fashion = new Fashion();
        Otomotif otomotif = new Otomotif();
        Food food = new Food();
        Laptop laptop = new Laptop("Asus ROG 5U", 25000000);
        PulsaTagihanTopUp PlsaTghnTopUp = new PulsaTagihanTopUp();
        
        do{
        System.out.println("--------------+ Lazada +--------------");
        System.out.println("Lazada Categories");
        System.out.println("1. Elektronik\n2. Fashion\n3. Otomotif\n4. Food\n5. Laptop\n6. Pulsa, Tagihan & Top Up Dana");
        System.out.print("Masukkan Pilihanmu ");
        int pilih = user.nextInt();
        switch (pilih){
        case 1 :
        elektronik.produk();
        System.out.println("1. Beli\n2. Tidak");
            System.out.print("Masukkan Pilihanmu : ");
        int beli = user.nextInt();
        if (beli==1){
            elektronik.Beli();
            elektronik.InputOutputUser();
        }
            break;
        
        
        case 2 :
            fashion.produk();
        System.out.println("1. Beli\n2. Tidak");
            System.out.print("Masukkan Pilihanmu : ");
        beli = user.nextInt();
        if (beli==1){
            fashion.Beli();
            fashion.InputOutputUser();
        }
            break;
        
        
        case 3 :
           otomotif.produk();
        System.out.println("1. Beli\n2. Tidak");
            System.out.print("Masukkan Pilihanmu : ");
        beli = user.nextInt();
        if (beli==1){
            otomotif.Beli();
            otomotif.InputOutputUser();
        }
            break;
        
        case 4 :
            food.produk();
        System.out.println("1. Beli\n2. Tidak");
            System.out.print("Masukkan Pilihanmu : ");
        beli = user.nextInt();
        if (beli==1){
            food.Beli();
            food.InputOutputUser();
        }
            break;
        
        case 5 :
            laptop.produk();
        System.out.println("1. Beli\n2. Tidak");
            System.out.print("Masukkan Pilihanmu : ");
        beli = user.nextInt();
        if (beli==1){
            laptop.Beli();
            laptop.InputOutputUser();
        }
        break;
        
        case 6 :
        PlsaTghnTopUp.pilihanPulsaTagihanTopUp();
        int pilihan =user.nextInt();
        if (pilihan==1){
            PlsaTghnTopUp.pulsa();
        }
        else if (pilihan==2){
            PlsaTghnTopUp.TokenListrik();
        }
         else if (pilihan==3){
            PlsaTghnTopUp.TopUpDana();
        }
        }     
System.out.println("_________________________________________");
System.out.println("Beli Produk Lainya?");
System.out.println("1. Beli\n2. Tidak");
System.out.print("Masukkan pilihanmu : ");
lanjut=user.nextInt();
System.out.println("");   
        }
while(lanjut==1);
        }
 }