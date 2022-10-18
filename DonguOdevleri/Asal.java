public class Asal {
    public static void main(String[] args) {

        // 1 - 100 arasındaki asal sayıları ekrana yazdıran program.
        // 2'yi kendim yazdırdım, bu sayede diğer çift sayıları sorgulatmadım.


        String asal = "2 ";
        for (int i = 3; i <= 100; i+=2) {
            int sayac = 0;
            for (int j = i; j > 1; j--) {
                if (i % j == 0) {
                    sayac ++;
                }
            }
            if (sayac == 1) {
                asal = asal + i + " ";
            }
        }
        System.out.println(asal);
    }
}