package com.pradipto.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pradipto.Entity.Ticket;

public interface TicketRepo extends JpaRepository<Ticket, Integer> {

}
