package com.example.demospringdatajpa.responsitory;

import com.example.demospringdatajpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface EmployeeReponsitory extends CrudRepository<Employee,Long> {
    Employee findById(long id);

    List<Employee> findEmployeesByLastNameContaining(String str);
    @Transactional
    @Modifying
    @Query("update Employee e set e.firstName=?2 where e.id=?1")
    public void updateFirstNameByID(Long id,String firstName);
}
