package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.EmployeeServiceImpl;
import model.Employee;

//@WebServlet annotation ile Servlet tanimini yapabiliriz. 



@WebServlet("/employeeController")//servlet mapping
public class EmployeeController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	// kullanicinin forma girdigi name, surname ve salary bilgilerini aliyoruz ve kayit olarak tabloya ekliyoruz. 
	//Daha sonrasinda tum kayitlari getirip request dispatch ediyoruz.
	@Override//Kayit Ekleme
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String employeeName = req.getParameter("name");
		String employeeSurname = req.getParameter("surname");
		int employeeSalary = Integer.parseInt(req.getParameter("salary"));

		EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
		employeeService.createEmployee(employeeName, employeeSurname, employeeSalary);

		List<Employee> allEmployees = employeeService.findAllEmployees();
		req.setAttribute("allEmployees", allEmployees);//olusturulan instance request edilir.
		RequestDispatcher dispatcher = req.getRequestDispatcher("employee.jsp");//jsp sayfasina dispatch ve forward edilir.
		dispatcher.forward(req, resp);

	}
	
	//id bilgisini aliyoruz ve kaydi sildikten sonra tekrar tum kayitlari getirip request dispatch ediyoruz.
	@Override//Kayit Silme
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
		int employeeId = Integer.parseInt(req.getParameter("employeeId"));
		employeeService.removeEmployee(employeeId);

		List<Employee> allEmployees = employeeService.findAllEmployees();
		req.setAttribute("allEmployees", allEmployees);//olusturulan instance request edilir.
		RequestDispatcher dispatcher = req.getRequestDispatcher("employee.jsp");//jsp sayfasina dispatch ve forward edilir.
		dispatcher.forward(req, resp);
	}

}
