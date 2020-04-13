package percabangan;

public class PercabanganIfElse {
    public static void main(String[] args) {
        double totalBelanja = 500000;
        double uangDiDompet = 400000;

        if(uangDiDompet<totalBelanja) {
            System.out.println("Uangnya kurang, Silahkan kurangi jajan anda");
        }else{
            System.out.println("Uang Kelebihan, Silahkan jajan lebih banyak");
        }

    }
}
