package com.prateekj.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Date;

@Setter
@Getter
@Entity
@Table(name = "TICKETS")
@EqualsAndHashCode
public class Ticket {

  @Id
  @Column(name = "BOOKING_ID")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer booking_id;

  @Column(name = "COST")
  private Integer cost;

  @ManyToOne
  @JoinColumn(name = "EMP_ID")
  private Employee employee;

  @Column(name = "BOOKING_DATE")
  private Date bookingDate;
}
