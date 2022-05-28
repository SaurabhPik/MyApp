package com.saurabh.mystarterapp.usingJpa.entity;

import org.springframework.stereotype.Service;

import javax.management.InstanceNotFoundException;

@Service
public class EmpService {
    EmpRepository empRep;

    public EmpService(EmpRepository empRep) {
        this.empRep = empRep;
    }


    public void addEmp(EmpEntity u) {
        empRep.save(u);
    }

    public EmpEntity getEmp(String name) throws Exception {
        EmpEntity emp = empRep.findByName(name);
        if (emp == null) {
            throw new InstanceNotFoundException();
        }
        System.out.println(emp);
        return emp;
    }
}
