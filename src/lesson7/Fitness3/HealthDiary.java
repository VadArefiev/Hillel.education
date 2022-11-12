package lesson7.Fitness3;

public class HealthDiary {

    private String pressure;
    private double weight;
    private long steps;

    public HealthDiary(String pressure, double weight, long steps) {
        this.pressure = pressure;
        this.weight = weight;
        this.steps = steps;
    }

    @Override
    public String toString() {
        return "HealthDiary{" +
                "pressure='" + pressure + '\'' +
                ", weight=" + weight +
                ", steps=" + steps +
                '}';
    }
}
