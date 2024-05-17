public class biayaParkir {
    public static void main(String[] args) {
        hargaKarcis(1); // $1
        hargaKarcis(5); // $1
        hargaKarcis(8); // $6.5
        hargaKarcis(24); // $15
        hargaKarcis(26); // $16.0
    }

    public static void hargaKarcis(int jam) {
        double totalFee = 0;

        if (jam <= 5) {
            totalFee = 1;
        } else if (jam <= 24) {
            totalFee = 5.0 + (jam - 5) * 0.5;
        } else {
            totalFee = 15.0;
            int extraHours = jam - 24;
            totalFee += extraHours * 0.5;
        }

        System.out.println("$" + totalFee);
    }
}
