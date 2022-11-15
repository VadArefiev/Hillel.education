package lesson7.Fitness.Fitness3;

public class HealthDiary {

    private String pressure;
    private double weight;
    private long steps;

    public HealthDiary(String pressure, double weight, long steps) {
        this.pressure = pressure;
        this.weight = weight;
        this.steps = steps;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public long getSteps() {
        return steps;
    }

    public void setSteps(long steps) {
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

