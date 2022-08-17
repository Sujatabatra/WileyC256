package com.sujata.persistence;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sujata.bean.Wife;

@Repository
public interface WifeDao extends JpaRepository<Wife, String> {

}
