package br.com.viniccius.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.viniccius.model.TicketModel;

public interface TicketRepository extends JpaRepository<TicketModel, String> {
}
