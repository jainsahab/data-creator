package com.prateekj.repositories;

import com.prateekj.models.Employee;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:/Beans.xml"})
@Ignore
public class TestBuilder {

  @Before
  public void setUp() throws Exception {
    ticketRepository.deleteAll();
    employeeRepository.deleteAll();
  }

  @Autowired
  protected TicketRepository ticketRepository;

  @Autowired
  protected EmployeeRepository employeeRepository;


  protected Employee newSavedEmployeeWith(Integer id, String name){
    Employee employee = new Employee();
    employee.setEmp_id(id);
    employee.setName(name);
    return employeeRepository.save(employee);
  }
}
