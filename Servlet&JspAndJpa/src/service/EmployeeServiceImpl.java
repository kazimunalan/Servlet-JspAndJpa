package service;

import java.util.List;

import model.Employee;
import dao.EmployeeDAOImpl;
//Crud islemleri icin gerekli anatosyanlardir. Servis saglar
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDAOImpl employeeDAOImpl;

	public EmployeeServiceImpl() {
		employeeDAOImpl = new EmployeeDAOImpl();
	}
	//name surname ve salary ye parametrelerine gore employee kayit!.
	@Override
	public Employee createEmployee(String name, String surname, int salary) {
		return employeeDAOImpl.createEmployee(name, surname, salary);
	}

	@Override
	public Employee findEmployee(int id) {
		return employeeDAOImpl.findEmployee(id);
	}
	//Kayitli employee leri listeleme
	@Override
	public List<Employee> findAllEmployees() {
		return employeeDAOImpl.findAllEmployees();

	}
	//id parametresine gore kaldirir
	@Override
	public void removeEmployee(int id) {
		employeeDAOImpl.removeEmployee(id);
	}
}
