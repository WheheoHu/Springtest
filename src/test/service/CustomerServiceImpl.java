package test.service;


import test.dao.CustomerDao;
import test.dao.CustomerDaoImpl;

import java.util.Date;

public class CustomerServiceImpl implements CustomerService {

    private String className;
    private Integer classPlace;
    private Date classData;

    private CustomerDao customerDao = null;

    public void setCustomerDao(CustomerDaoImpl customerDao) {
        this.customerDao = customerDao;
    }

    public CustomerServiceImpl(String className, Integer classPlace, Date classData) {
        this.className = className;
        this.classPlace = classPlace;
        this.classData = classData;
    }

    private Date getClassData() {
        return classData;
    }

    private Integer getClassPlace() {
        return classPlace;
    }

    private String getClassName() {
        return className;
    }


    public void saveCustomer() {
        System.out.println("Service" + " " + getClassName() + " " + getClassPlace() + " " + getClassData());
        customerDao.saveCustomer();
    }
}
