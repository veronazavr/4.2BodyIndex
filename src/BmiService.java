public class BmiService {
    public double calculate(double weight, double height) {
        height = 170;
        weight = 66;
        double Bmi = weight / (height * height);

        return Bmi;
    }
}
