package com.pluralsight.model;

/**
 * Created by GPrabhu on 4/9/2015.
 */
public class GoalReport {
    private int goalMinutes;
    private int exerciseMinutes;
    private String exerciseActivity;

    public String getExerciseActivity() {
        return exerciseActivity;
    }

    public GoalReport(int goalMinutes, int exerciseMinutes, String exerciseActivity) {
        this.goalMinutes = goalMinutes;
        this.exerciseMinutes = exerciseMinutes;
        this.exerciseActivity = exerciseActivity;
    }

    public void setGoalMinutes(int goalMinutes) {
        this.goalMinutes = goalMinutes;
    }

    public int getExerciseMinutes() {
        return exerciseMinutes;
    }

    public void setExerciseMinutes(int exerciseMinutes) {
        this.exerciseMinutes = exerciseMinutes;
    }

    public int  getGoalMinutes() {
        return goalMinutes;
    }

    public void setGoalMinutes(String goalMinutes) {
        this.exerciseActivity = goalMinutes;
    }


}
