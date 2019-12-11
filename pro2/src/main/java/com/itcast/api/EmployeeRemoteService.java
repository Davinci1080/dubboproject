package com.itcast.api;

import com.itcast.entity.Employee;

import java.util.List;

public interface EmployeeRemoteService {

    List<Employee> getEmployeeByConditionRemote(Employee employee);
}
