public class HarmonicAverage {
    public static void main(String[] args) {
        double[] arr = {10, 20, 30, 40, 50, 60};
        double harSum = 0;
        for (double v : arr) {
            harSum += (1 / v);
        }
        System.out.println(arr.length / harSum);
    }
}