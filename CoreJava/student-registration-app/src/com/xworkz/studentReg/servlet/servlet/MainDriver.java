package com.xworkz.studentReg.servlet.servlet;

import com.xworkz.studentReg.dto.EmployeeDto;

public class MainDriver {
    public void setValues(EmployeeDto employeeDto){
        employeeDto.setEmployeeId(404);
        employeeDto.setName("Vinod Kumar");
        employeeDto.setSalary(70000);

//        EmployeeService employeeService=new EmployeeService();
//        employeeService.process(employeeDto);
    }
}
