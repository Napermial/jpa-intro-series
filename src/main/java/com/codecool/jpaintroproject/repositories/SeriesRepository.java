package com.codecool.jpaintroproject.repositories;

import com.codecool.jpaintroproject.entities.Series;
import com.sun.org.apache.bcel.internal.generic.LNEG;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeriesRepository extends JpaRepository<Series, Long> {
}
