package healthWealth;

import java.util.Date;

class SleepRecord {
    private Date sleepTime;
    private Date wakeUpTime;

    public SleepRecord(Date sleepTime, Date wakeUpTime) {
        this.sleepTime = sleepTime;
        this.wakeUpTime = wakeUpTime;
    }

    public Date getSleepTime() {
        return sleepTime;
    }

    public Date getWakeUpTime() {
        return wakeUpTime;
    }
}