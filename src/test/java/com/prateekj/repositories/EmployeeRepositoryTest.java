package com.prateekj.repositories;

import com.prateekj.models.Employee;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:/Beans.xml"})
public class EmployeeRepositoryTest extends TestBuilder{

  @Override
  @Before
  public void setUp() throws Exception {
    super.setUp();
  }

  @Test
  public void shouldSaveAEmployee(){
    Employee aEmployee = new Employee();
    aEmployee.setName("Raj Kumar2");
    aEmployee.setEmp_id(112);

    Employee savedEmployee = employeeRepository.save(aEmployee);

    assertThat(aEmployee, is(savedEmployee));
  }

  @Test
  public void shouldSaveAEmployee2(){
    Employee aEmployee = new Employee();
    aEmployee.setName("Pallavi2");
    aEmployee.setEmp_id(111);

    Employee savedEmployee = employeeRepository.save(aEmployee);

    assertThat(aEmployee, is(savedEmployee));
  }

}