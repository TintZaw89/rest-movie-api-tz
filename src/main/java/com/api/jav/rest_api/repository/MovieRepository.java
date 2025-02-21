package com.api.jav.rest_api.repository;

import com.api.jav.rest_api.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer>{

}
