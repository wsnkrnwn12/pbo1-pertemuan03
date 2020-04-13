package percabangan;

public class PercabanganIfElse {
    public static void main(String[] args) {
        double totalBelanja = 499999;
        double uangDiDompet = 520000;

        if(uangDiDompet<totalBelanja) {
            System.out.println("Uangnya kurang, Silahkan kurangi jajan anda");
        }else if(uangDiDompet>totalBelanja){
            double Kembalian = uangDiDompet-totalBelanja;
            System.out.println("Uang Kelebihan, Silahkan terima kembalian anda : "+Kembalian);
        }else{
            System.out.println("Uang masih bersisa, Horeee");
        }

    }
}
