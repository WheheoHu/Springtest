package test.client;


import org.springframework.context.support.ClassPathXmlApplicationContext;
import test.service.CustomerService;
import test.service.CustomerServiceImpl;

public class Client {
    public static void main(String[] args) {
        //use beanfactory
//        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("spring-config.xml"));
//        CustomerService customerService_2 = (CustomerServiceImpl) beanFactory.getBean("CustomerService");
//        customerService_2.saveCustomer();

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        CustomerService customerService = (CustomerServiceImpl) classPathXmlApplicationContext.getBean("CustomerService");
        customerService.saveCustomer();
    }
}