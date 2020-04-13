package percabangan;

public class Switch {
    public static void main(String[] args) {
        char nilai='D';
        switch (nilai){
            case 'A':
                System.out.println("Murid : \"Selamat pagi pak!!!\"");
                System.out.println("Guru  : \"Iya selamat pagi nak, ada apa?\"");
                break;
            case 'B':
                System.out.println("Murid : \"Saya mau komplain nilai!!\"");
                System.out.println("Guru  : \"....\"");
                break;
            case 'C':
                System.out.println("Murid : \"Saya minta tugas tambahan pak untuk memperbaiki nilai\"");
                System.out.println("Guru  : \"Emang nilai kamu berapa jadi minta tambah tugas?\"");
                System.out.println("Murid : \"Nilai saya C padahal saya cuma jarang kerjain tugas, tapi si palui yang jarang absen nilainya A\"");
                System.out.println("Guru  : \"Yaudah protesnya sama palui jangan sama saya!!\"");
                break;
            default:
                System.out.println("Murid : \"Jadi boleh ga pak saya minta tugas tambahan?\"");
                System.out.println("Guru  : \"Kalo saya kasih tugas tambahan, kamu kasih saya apa?\"");
                System.out.println("Murid : \"Saya kasih tanda tangan saya aja gimana pak?\"");
                System.out.println("Guru  : \"Yasudah tunggu disini, saya ambil tugas buat kamu dulu..\"");
                System.out.println("5 menit kemudian...\"");
                System.out.println("Guru  : \"Nih tugasnya.. *ngasih pel sama ember*\"");
                System.out.println("Murid : \"Loh? kok jadi ngasih ginian pak?\"");
                System.out.println("Guru  : \"Kamu pel seluruh sekolah nanti saya kasih nilai AAA\"");
                System.out.println("Murid : \"Ga jadi deh pak saya pindah sekolah aja!!! *lempar ember sama pel*\"");
                System.out.println("Guru  : \"...\"");
                break;
        }
    }
}
