package test.client;


import org.springframework.context.support.ClassPathXmlApplicationContext;
import test.dao.CustomerDao;

public class Client {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext=new ClassPathXmlApplicationContext("spring-config.xml");
       CustomerDao ob= (CustomerDao)classPathXmlApplicationContext.getBean("CustomerDao");
       ob.saveCustomer();
    }
}