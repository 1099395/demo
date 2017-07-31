package com.tcs.mcoe.repository;
import com.tcs.mcoe.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.*;


public interface EmployeeRepository extends MongoRepository<Employee, String>{
}
