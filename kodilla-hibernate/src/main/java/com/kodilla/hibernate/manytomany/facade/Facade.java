package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Facade {

    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    public List<Company> retrieveCompanyByPartOfName (String partOfName){
        List<Company> companies =companyDao.retrieveCompanyByPartOfName("%"+partOfName+"%");
        return companies;
    }

    public List<Employee> retrieveEmployeeByPartOfName (String partOfName){
        List<Employee> employees=employeeDao.retrieveEmployeeByLastname("%"+partOfName+"%");
        return employees;
    }


}
