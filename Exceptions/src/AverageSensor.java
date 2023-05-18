import java.util.ArrayList;
import java.util.List;
public class AverageSensor implements Sensor {
    public boolean isOn;
    public List<Sensor> sensors;
    public List<Integer> readings;

    public AverageSensor() {
        sensors = new ArrayList<>();
        readings = new ArrayList<>();
    }
    public void addSensor(Sensor toAdd){
        sensors.add(toAdd);
    }

    public List<Integer> readings() {
        for (Sensor sensor : sensors) {
            readings.add(sensor.read());
        }
        return readings;
    }



    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public void setOn() {
        isOn=true;
    }

    @Override
    public void setOff() {
        isOn=false;
    }

    @Override
    public int read() {
        if (isOn== false || sensors.isEmpty()){
            throw new IllegalStateException("Sensor is not on or is empty in the 'Average Sensor'");
        }
        int sum =0;
        int avg = 0;
        for (Sensor sensor : sensors){
            sum = sum + sensor.read();
        }
        avg = sum/ sensors.size();
        return avg;
    }
}
