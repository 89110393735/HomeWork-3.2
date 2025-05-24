public class BmiService {
    public int calculate(int weightInKq, double heightInMeters) {
        double bmi = weightInKq / heightInMeters / heightInMeters;
        return (int) bmi;

    }
}
