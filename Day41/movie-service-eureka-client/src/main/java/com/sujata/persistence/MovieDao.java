package com.sujata.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sujata.bean.Movie;

@Repository
public interface MovieDao extends JpaRepository<Movie, String> {

}
