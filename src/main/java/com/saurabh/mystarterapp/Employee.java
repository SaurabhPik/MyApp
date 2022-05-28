package com.saurabh.mystarterapp;

import com.saurabh.mystarterapp.usingJpa.entity.EmpEntity;
import com.saurabh.mystarterapp.usingJpa.entity.EmpService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/home")
public class Employee {
    EmpService empSer;

    public Employee(EmpService empSer) {
        this.empSer = empSer;
    }

    //@RequestMapping(value="/home/{age}/{name}", method = RequestMethod.GET)
    //http://localhost:8090/home?name=Saurabh
    //http://localhost:8090/home/Saurabh
    @GetMapping("/{age}/{name}")
    public ResponseEntity<EmpEntity> getInfo(@PathVariable String name, @PathVariable int age) {
        EmpEntity emp = null;
        try {
            emp = empSer.getEmp(name);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(emp);
    }

    @PostMapping("/")
    public ResponseEntity<EmpEntity> createEmp(@RequestBody EmpEntity u) {
        System.out.println(u.getName() + " - " + u.getAge());
        empSer.addEmp(u);
        return ResponseEntity.status(201).body(u);
    }
}
