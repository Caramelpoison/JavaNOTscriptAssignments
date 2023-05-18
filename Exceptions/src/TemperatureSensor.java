import java.util.Random;
public class TemperatureSensor implements Sensor {
    public Random random;
    public boolean isOn;

    public TemperatureSensor() {
        random = new Random();
    }

    public int read() {
        if (!isOn()) {
            throw new IllegalStateException("Sensor is off.");
        }

        int minTemperature = -30;
        int maxTemperature = 30;
        return random.nextInt(maxTemperature - minTemperature + 1) + minTemperature;
    }

    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public void setOn() {
        isOn = true;
    }

    @Override
    public void setOff() {
        isOn = false;

    }
}