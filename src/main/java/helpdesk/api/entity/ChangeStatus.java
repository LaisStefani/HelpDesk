package helpdesk.api.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import helpdesk.api.enums.StatusEnum;

@Document
public class ChangeStatus {
	
	@Id
	private String id;
	
	@DBRef
	private Ticket ticket; 
	
	@DBRef(lazy = true)
	private User user;
	
	private Date dateChangeStatus;
	
	private StatusEnum status;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getDateChangeStatus() {
		return dateChangeStatus;
	}

	public void setDateChangeStatus(Date dateChangeStatus) {
		this.dateChangeStatus = dateChangeStatus;
	}

	public StatusEnum getStatus() {
		return status;
	}

	public void setStatus(StatusEnum status) {
		this.status = status;
	}
	
}
