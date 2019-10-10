package test.service;



import java.util.Date;

public class CustomerServiceImpl implements CustomerService {

    private String className;
    private Integer classPlace;
    private Date classData;

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

    public CustomerServiceImpl() {
        System.out.println("bean created!");
    }

   // private CustomerDao customerDaoImpl = new CustomerDaoImpl();

    public void saveCustomer() {
        System.out.println("Service"+getClassName()+getClassPlace()+getClassData());
      //  customerDaoImpl.saveCustomer();
    }
}
