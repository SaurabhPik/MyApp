package com.saurabh.mystarterapp.usingJpa.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepository extends JpaRepository<EmpEntity, Integer> {

    EmpEntity findByName(String name);

    @Query(value = "select * from emp_entity e where e.empId=?1 and e.name=?2", nativeQuery = true)
    EmpEntity findByIdAndName(@Param("empId") int empId, String name);
}
