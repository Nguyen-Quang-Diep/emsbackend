package net.javaguides.emsbackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.emsbackend.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}