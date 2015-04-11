package com.pluralsight.service;

import com.pluralsight.model.Goal;
import com.pluralsight.model.GoalReport;

import java.util.List;

/**
 * Created by GPrabhu on 4/7/2015.
 */
public interface GoalService {
    Goal save(Goal goal);

    List<Goal> findAllGoals();

    List<GoalReport> getGoalReports();
}
