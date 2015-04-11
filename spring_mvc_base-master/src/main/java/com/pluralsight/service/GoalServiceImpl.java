package com.pluralsight.service;

import com.pluralsight.model.Goal;
import com.pluralsight.model.GoalReport;
import com.pluralsight.repository.GoalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by GPrabhu on 4/7/2015.
 */

@Service()
public class GoalServiceImpl implements GoalService {

    @Qualifier("goalRepository")
    @Autowired
    private GoalRepository goalRepository;

    @Override
    @Transactional
    public Goal save(Goal goal) {
        return goalRepository.save(goal);
    }

    @Override
    public List<Goal> findAllGoals() {
        return goalRepository.findAll();
    }

    @Override
    public List<GoalReport> getGoalReports() {
        return goalRepository.loadAllGoalReport();
    }
}
