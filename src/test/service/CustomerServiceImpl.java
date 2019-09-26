package test.service;


import org.springframework.context.support.ClassPathXmlApplicationContext;
import test.dao.CustomerDao;
import test.dao.CustomerDaoImpl;

public class CustomerServiceImpl implements CustomerService {
    public CustomerServiceImpl(){
        System.out.println("bean created!");
    }

    private CustomerDao customerDaoImpl=new CustomerDaoImpl();
    public void saveCustomer() {
        System.out.println("Service");
        customerDaoImpl.saveCustomer();
    }
}
