package com.example.casestudy.repository.employee;

import com.example.casestudy.model.decentralization.User;
import com.example.casestudy.model.employeeModel.Division;
import com.example.casestudy.model.employeeModel.EducationDegree;
import com.example.casestudy.model.employeeModel.Employee;
import com.example.casestudy.model.employeeModel.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {
    @Modifying
    @Query(value = "update Employee set employee_name=:employeeName, employee_day_of_birth=:employeeDayOfBirth, " +
            " employee_id_card=:employeeIdCard,employee_salary=:employeeSalary, " +
            " employee_phone_number=:employeePhoneNumber,employee_email=:employeeEmail, " +
            " employee_address=:employeeAddress,position_id=:position,education_degree_id=:educationDegree, " +
            " division_id=:division,user_name=:userName where employee_id=:employeeId ",nativeQuery = true)
void updateEmployee(@Param("employeeName")String employeeName, @Param("employeeDayOfBirth")String employeeDayOfBirth, @Param("employeeIdCard")String employeeIdCard,
                    @Param("employeeSalary") double employeeSalary, @Param("employeePhoneNumber")String employeePhoneNumber,
                    @Param("employeeEmail") String employeeEmail, @Param("employeeAddress") String employeeAddress,
                    @Param("position") Position position, @Param("educationDegree") EducationDegree educationDegree,
                    @Param("division") Division division, @Param("userName") User userName, @Param("employeeId")int employeeId);

    @Query(value = "select * from employee where  employee_name like :name ",nativeQuery = true)
    List<Employee> searchByName(@Param("name")String name);
}
