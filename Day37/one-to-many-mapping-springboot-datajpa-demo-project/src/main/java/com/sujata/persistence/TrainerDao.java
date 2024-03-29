package com.sujata.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sujata.bean.Trainer;

@Repository
public interface TrainerDao extends JpaRepository<Trainer, Integer> {

}
