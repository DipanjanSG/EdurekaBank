package CreateAccount;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import AuthorizeCCTransactions.CreditCard;
import BusinessLogic.SessionFactoryCreation;

public class CustomerDaoImpl implements CustomerDao{
	
	@Autowired
	HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Transactional(readOnly = false)
	public void save(Customer customer) {
		hibernateTemplate.save(customer);
	}
	
	@Transactional(readOnly = false)
	public void update(Customer customer) {
		hibernateTemplate.update(customer);
		
	}
	
	@Transactional(readOnly = false)
	public void delete(Customer customer) {
		hibernateTemplate.delete(customer);
	}
	
	@Transactional(readOnly = false)
	public List<Customer> getCustomers() {
		return hibernateTemplate.loadAll(Customer.class);
	}

	
	
}
