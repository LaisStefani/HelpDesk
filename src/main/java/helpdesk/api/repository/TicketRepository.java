package helpdesk.api.repository;

import java.awt.print.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.mongodb.repository.MongoRepository;

import helpdesk.api.entity.Ticket;

public interface TicketRepository extends MongoRepository<Ticket, String> {
	//IgnoreCase: Sem letras maiusculas 
	//Containing: 'like' no sql
	
	Page<Ticket> findByUserIdOrderByDateDesc(Pageable pages, String userId);  

	Page<Ticket> findByTitleIgnoreCaseContainingAndStatusAndPriorityOrderByDateDesc(
			String title, String status, String priority, Pageable pages);

	Page<Ticket> findByTitleIgnoreCaseContainingAndStatusAndPriorityAndUserIdOrderByDateDesc(
			String title, String status, String priority, Pageable pages);

	Page<Ticket> findByTitleIgnoreCaseContainingAndStatusAndPriorityAndAssisnedUserIdOrderByDateDesc(
			String title, String status, String priority, Pageable pages);

	Page<Ticket> findByNumber(Integer number, Pageable pages);
	
}