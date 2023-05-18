public class StandardSensor implements Sensor{
    public int num;
    public boolean isOn;

    public StandardSensor(int num) {
        this.num = num;
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
        isOn =false;

    }

    public int read(){
        return num;
    }
}
