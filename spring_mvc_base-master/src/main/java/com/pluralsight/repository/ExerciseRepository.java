package com.pluralsight.repository;

import com.pluralsight.model.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by GPrabhu on 4/8/2015.
 */
public interface ExerciseRepository extends JpaRepository<Exercise,Long> {

}
