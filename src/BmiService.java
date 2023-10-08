public class BmiService {

    public double calculate(double height_in_meters, double weight_in_kilos) {
        double bmiIndex;
        bmiIndex = (int) weight_in_kilos / (height_in_meters * height_in_meters);
        return bmiIndex;

    }
}
