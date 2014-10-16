package com.prateekj.models;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@EqualsAndHashCode
@Table(name = "EMPLOYEE")
public class Employee {

  @Id
  @Column(name = "EMP_ID")
  private Integer emp_id;

  @Column(name = "NAME")
  private String name;
}
