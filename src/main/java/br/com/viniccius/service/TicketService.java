package br.com.viniccius.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.viniccius.model.TicketModel;
import br.com.viniccius.repository.TicketRepository;

@Service
public class TicketService {

  private final TicketRepository ticketRepository;

  public TicketService(TicketRepository ticketRepository) {
    this.ticketRepository = ticketRepository;
  }

  public List<TicketModel> getAllTickets() {
    return ticketRepository.findAll();
  }

  public TicketModel createTicket(TicketModel ticket) {
    return ticketRepository.save(ticket);
  }

  public void deleteTicket(String id) {
    ticketRepository.deleteById(id);
  }
}