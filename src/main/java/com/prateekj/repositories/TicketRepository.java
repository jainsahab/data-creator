package com.prateekj.repositories;

import com.prateekj.models.Ticket;
import org.springframework.data.repository.CrudRepository;


public interface TicketRepository extends CrudRepository<Ticket, Integer> {
}
