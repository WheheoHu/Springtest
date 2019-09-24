package test.dao;

public class CustomerDaoImpl implements CustomerDao {
    @Override
    public void saveCustomer() {
        System.out.println("Customer saved!");
    }
}
