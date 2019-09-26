package test.client;


import org.springframework.context.support.ClassPathXmlApplicationContext;
import test.dao.CustomerDao;
import test.service.CustomerService;
import test.service.CustomerServiceImpl;

public class Client {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        CustomerService customerService = (CustomerServiceImpl) classPathXmlApplicationContext.getBean("CustomerService");
       // CustomerDao customerDao = (CustomerDao) classPathXmlApplicationContext.getBean("CustomerDao");
        customerService.saveCustomer();
    }
}