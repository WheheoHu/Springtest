package test.service;


import test.dao.CustomerDao;
import test.dao.CustomerDaoImpl;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {

    private String className;
    private Integer classPlace;
    private Date classData;

    private Map<String, String> stringMap;
    private List<String> stringList;

    public void setStringMap(Map<String, String> stringMap) {
        this.stringMap = stringMap;
    }

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
        System.out.println(stringMap);
        System.out.println(stringList);
        customerDao.saveCustomer();
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }
}
