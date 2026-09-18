public class Statistics {
    public static double sdCalc(double[] data) {
        int n = data.length;
        if (n <= 1) {
            return 0.0;
        }
        double mean = avgCalc(data);
        double sd = 0.0;
        for (double el : data) {
            sd += Math.pow(el - mean, 2);
        }
        return Math.sqrt(sd / (n - 1));
    }

    public static double avgCalc(double[] data) {
        int n = data.length;
        if (n <= 1) {
            return data[0];
        }
        double sum = 0.0;
        for (double el : data) {
            sum += el;
        }
        return sum / n;
    }
}
