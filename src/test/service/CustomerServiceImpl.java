package test.service;

import test.dao.CustomerDao;
import test.dao.CustomerDaoImpl;
//import test.factory.BeanFactory;

public class CustomerServiceImpl implements CustomerService {
   // private CustomerDao customerDaoImpl= (CustomerDaoImpl) BeanFactory.getBean("CUSTOMERDAO");
    @Override
    public void saveCustomer() {
        System.out.println("Service");
        //customerDaoImpl.saveCustomer();
    }
}
