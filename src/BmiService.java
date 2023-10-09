public class BmiService {

    public double calculate(double heightInMeters, double weightInKilos) {
        double bmiIndex;
        bmiIndex = (int) weightInKilos / (heightInMeters * heightInMeters);
        return bmiIndex;

    }
}
