package in.akarshitnigam.springbootwebapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.akarshitnigam.springbootwebapp.entity.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
