public class Main {
    public static void main (String[] args) {
        BmiService service = new BmiService();
        double weight = 66;
        double height = 170;
        double Bmi = service.calculate(170, 66);
        System.out.println(Bmi);
    }
}