package healthWealth;

import java.util.Date;

class ExerciseActivity {
    private Date date;
    private String exerciseType;
    private double duration;
    private double caloriesBurned;

    public ExerciseActivity(Date date, String exerciseType, double duration, double caloriesBurned) {
        this.date = date;
        this.exerciseType = exerciseType;
        this.duration = duration;
        this.caloriesBurned = caloriesBurned;
    }

    public Date getDate() {
        return date;
    }

    public String getExerciseType() {
        return exerciseType;
    }

    public double getDuration() {
        return duration;
    }

    public double getCaloriesBurned() {
        return caloriesBurned;
    }
}