/*
package com.pluralsight.repository;

import com.pluralsight.model.Goal;
import com.pluralsight.model.GoalReport;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository("goalRepository")
public class GoalRepositoryImpl implements GoalRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Goal save(Goal goal) {
        entityManager.persist(goal);
        entityManager.flush();
        if(goal.getId() == null){
            entityManager.persist(goal);
            entityManager.flush();
        }
        else {
         goal= entityManager.merge(goal);
        }
        return goal;
    }

    @Override
    public List<Goal> loadAll() {
        Query query = entityManager.createQuery("select g from Goal g");
        return query.getResultList();
    }

    @Override
    public List<GoalReport> loadAllGoalReport() {
        */
/*Query query = entityManager.createQuery("Select new com.pluralsight.model.GoalReport(g.minutes,e.minutes,e.activity) " +
                "from Goal g, Exercise e where g.id= e.goal.id");*//*

        TypedQuery<GoalReport> query = entityManager.createNamedQuery(Goal.FIND_GOAL_REPORT,GoalReport.class );
        return query.getResultList();
    }
}
*/
