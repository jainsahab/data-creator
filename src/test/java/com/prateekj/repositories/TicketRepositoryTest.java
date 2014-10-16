package com.prateekj.repositories;

import com.prateekj.models.Employee;
import com.prateekj.models.Ticket;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;

import static com.google.common.collect.Lists.newArrayList;
import static java.util.Arrays.asList;
import static org.junit.Assert.assertTrue;

public class TicketRepositoryTest extends TestBuilder {

  @Override
  @Before
  public void setUp() throws Exception {
    super.setUp();
  }

  @Test
  public void shouldSaveTicket(){
    Employee raj = newSavedEmployeeWith(11, "Raj Kumar");

    Ticket firstTicket = getNewTicket(new Date(), 5000, raj);
    Ticket secondTicket = getNewTicket(new Date(), 6000, raj);
    Ticket thirdTicket = getNewTicket(new Date(), 7000, raj);

    ArrayList<Ticket> tickets = newArrayList(ticketRepository.save(asList(firstTicket, secondTicket, thirdTicket)));

    assertTrue(tickets.contains(firstTicket));
    assertTrue(tickets.contains(secondTicket));
    assertTrue(tickets.contains(thirdTicket));
  }

  private Ticket getNewTicket(Date bookingDate, int cost, Employee employee) {
    Ticket aTicket = new Ticket();
    aTicket.setBookingDate(bookingDate);
    aTicket.setCost(cost);
    aTicket.setEmployee(employee);
    return aTicket;
  }

}