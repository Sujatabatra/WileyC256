package com.sujata.persistence;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sujata.bean.Husband;

@Repository
public interface HusbandDao extends JpaRepository<Husband, String> {

}
