import java.util.Scanner;

public class Main {

    public static int saldo;
    public static int penarikan;
    public static int transfer;
    public static int jumlah;
    public static int stor;
    public static String UserName;
    public static String Password;



    public static void main(String[] args) {
        viewLoginSistem();

    }

    /**
     *Menampilkan Transaksi
     */
    public static void showTransaksi(){
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
            if (penarikan < 50000){
                System.out.println("Minimal Penarikan Rp.50000");
            }else if (saldo < penarikan){
                System.out.println("saldo tidak cukup");
            }else {
                saldo = saldo - penarikan;
                System.out.println("SUCCESS");
            }
    }
    //Test showTarikTunai
//    public static void testShowTarikTunai(){
//        saldo = 300000;
//        penarikan =3000000;
//        showTarikTunai();
//    }

    /**
     * Transfer
     */
    public static void showTransfer(){
        if (transfer < 20000){
            System.out.println("Minimal Transfer Rp.20000");
        }else if(saldo < transfer){
            System.out.println("Saldo Tidak Mencukupi");
        }else{
            saldo = saldo - transfer;
            System.out.println("SUCCESS, Telah di Transfer = Rp." + transfer);
        }
    }
    //test showTransfer
//    public static void testShowTransfer(){
//        saldo = 5000;
//        transfer = 20000;
//        showTransfer();
//    }

    /**
     * Stor Tunai
     */
    public static void showStorTunai(){
        if (stor < 50000){
            System.out.println("Minimal stor tunai Rp.50000");
        }else {
            saldo = stor + saldo;
            System.out.println("SUCESS, Telah di Stor = Rp." + stor);
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
        System.out.println("Saldo Anda Saat Ini Rp."+ saldo);
    }
    //test showCekSaldo
//    public static void testShowCekSaldo(){
//        saldo = 500000;
//        showCekSaldo();
//    }

    /**
     * Login Sistem
     */
    public static void showLoginSistem(){

        if (UserName.equals("suhendri") & Password.equals("123456")){
            viewTransaksi();
        }else {
            System.out.println("User Name & Password Salah");
        }
    }
    //test Login Sistem
//    public static void testLoginSistem(){
//        UserName = "suhendri";
//        Password = "123456";
//        showLoginSistem();
//    }

    /**
     * Input Data
     */
    public static String input(String info){
        Scanner scanner = new Scanner(System.in);

        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;
    }

    /**
     * View Login sistem
     */
    public static void viewLoginSistem(){

        Scanner inputUser = new Scanner(System.in);

        System.out.println("====Login====");

        System.out.print("Input User Name : ");
        UserName = inputUser.nextLine();
        System.out.print("Input password : ");
        Password = inputUser.nextLine();

        showLoginSistem();

        while (true){
            var input = input("ulangi (x)");
            if (input.equals("x")){
                viewLoginSistem();
            }else {
                System.out.println("Pilihan tidak dimengerti");
            }
        }
    }

    /**
     * View Menu Transaksi
     */
    public static void viewTransaksi(){

        Scanner inputUser = new Scanner(System.in);

        System.out.println("====Menu Transaksi====");

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
            viewCekSaldo();
        }
    }

    /**
     * View Stor Tunai
     */
    public static void viewStorTunai() {
        Scanner ipt = new Scanner(System.in);

        System.out.println("====Stor Tunai====");

        System.out.print("Masukkan Jumlah Stor Tunai : RP.");
        stor = ipt.nextInt();

        showStorTunai();
            while (true){
                 var input = input("kembali ke Menu Transaksi (x)");
                if (input.equals("x")){
                    viewTransaksi();
                }else {
                    System.out.println("Pilihan tidak dimengerti");
                }
            }

    }

    /**
     * View Cek saldo
     */
    public static void viewCekSaldo(){
        System.out.println("====Menu Saldo=====");
        showCekSaldo();
        while (true) {
            var input = input("kembali ke Menu Transaksi (x)");
            if (input.equals("x")) {
                viewTransaksi();
            } else {
                System.out.println("Pilihan tidak dimengerti");
            }
        }
    }

    /**
     * View Tarik Tunai
     */
    public static void viewTarikTunai() {
            Scanner inputUser = new Scanner(System.in);
            System.out.println("====Menu Tarik Tunai====");

            System.out.print("Masukkan jumlah penarikan : Rp.");
            penarikan = inputUser.nextInt();

            showTarikTunai();

            while (true){
                var input = input("kembali ke Menu Transaksi (x)");
                if (input.equals("x")){
                    viewTransaksi();
                }else {
                    System.out.println("Pilihan tidak dimengerti");
                }
            }

    }

    /**
     * View Transfer
     */
    public static void viewTransfer(){
        Scanner inputUser = new Scanner(System.in);
        System.out.println("==== Menu Transfer ====");

        System.out.print("Masukkan jumlah yang ingin di Transfer : Rp.");
        transfer = inputUser.nextInt();
        showTransfer();

        while (true) {
            var input = input("kembali ke Menu Transaksi (x)");
            if (input.equals("x")) {
                viewTransaksi();
            } else {
                System.out.println("Pilihan tidak dimengerti");
            }
        }
    }

}
