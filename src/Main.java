import java.util.Scanner;

public class Main {

    public static int saldo;
    public static int penarikan;
    public static int transfer;



    public static void main(String[] args) {

        viewTransaksi();
    }

    /**
     *Menampilkan Transaksi
     */
    public static void showTransaksi(){
        System.out.println("====Menu Transaksi====");
        System.out.println("1. Tarik Tunai");
        System.out.println("2. Transfer");
        System.out.println("3. Stor Tunai");
        System.out.println("4. Cek saldo");
    }
    //Test showTransaksi
//    public static void testShowTransaksi(){
//        showTransaksi();
//    }

    /**
     *Tarik Tunai
     */
    public static void showTarikTunai(){
            if (saldo < penarikan){
                System.out.println("saldo tidak cukup");
            }else if (penarikan < 50000){
                System.out.println("Minimal Penarikan Rp.50000");
            }else {
                var jumlah = saldo - penarikan;
                System.out.println("SUCCESS, sisa saldo anda = Rp." + jumlah);
            }
    }
    //Test showTarikTunai
//    public static void testShowTarikTunai(){
//        saldo = 300000;
//        penarikan =30000;
//        showTarikTunai();
//    }

    /**
     * Transfer
     */
    public static void showTransfer(){
        if (saldo < transfer){
            System.out.println("Jumlah Saldo Tidak mencukupi");
        }else if(transfer < 20000){
            System.out.println("Minimal Transfer Rp.20000");
        }else{
            var jumlah = saldo - transfer;
            System.out.println("SUCCESS, sisa saldo anda = Rp." + jumlah);
        }
    }
    //test showTransfer
//    public static void testShowTransfer(){
//        saldo = 50000;
//        transfer = 20000;
//        showTransfer();
//    }

    /**
     * Stor Tunai
     */
    public static void showStorTunai(int stor){
        var jumlah = saldo + stor;
        if (stor < 50000){
            System.out.println("Minimal stor tunai Rp.50000");
        }else {
            System.out.println("SUCESS, total saldo anda = Rp." + jumlah);
        }
    }
    //Test showStorTunai
//    public static void testShowStorTunai(){
//        saldo = 50000;
//        showStorTunai(50000);
//    }

    /**
     * Cek Saldo
     */
    public static void showCekSaldo(){
        System.out.println(saldo);
    }
    //test showCekSaldo
//    public static void testShowCekSaldo(){
//        saldo = 500000;
//        showCekSaldo();
//    }

    /**
     * View Login sistem
     */
    public static void viewLoginSistem(){

        Scanner inputUser = new Scanner(System.in);

        System.out.print("Input User Name : ");
        String userName = inputUser.nextLine();
        System.out.print("Input password : ");
        String password = inputUser.nextLine();

        if (userName.equals("suhendri") && password.equals("123456")){
            showTransaksi();
        }else {
            System.out.println("Try Again, your input it's Wrong!");
        }




    }

    /**
     * View Menu Transaksi
     */
    public static void viewTransaksi(){
        Scanner inputUser = new Scanner(System.in);

        showTransaksi();

        System.out.print("silahkan pilih transaksi(masukkan nomor transaksi) : ");
        String inp = inputUser.nextLine();
        if (inp.equals("1")){
            viewTarikTunai();
        }else if (inp.equals("2")){
            viewTransfer();
        }else if (inp.equals("3")){
            viewStorTunai();
        }else if (inp.equals("4")){
            viewStorTunai();
        }
    }

    /**
     * View Tarik Tunai
     */
    public static void viewTarikTunai(){

    }

    /**
     * View Transfer
     */
    public static void viewTransfer(){

    }

    /**
     * View Cek saldo
     */
    public static void viewCekSaldo(){

    }

    /**
     * View Stor Tunai
     */
    public static void viewStorTunai(){

    }
}
