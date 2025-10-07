package br.com.viniccius.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.viniccius.model.TicketModel;
import br.com.viniccius.service.TicketService;

@RestController
@RequestMapping("/ticket")
public class TicketController {

  private final TicketService ticketService;

  public TicketController(TicketService ticketService) {
    this.ticketService = ticketService;
  }

  @GetMapping
  public List<TicketModel> getTicket() {
    return ticketService.getAllTickets();
  }

  @PostMapping
  public TicketModel createTicket(@RequestBody TicketModel ticket) {
    return ticketService.createTicket(ticket);
  }
}
