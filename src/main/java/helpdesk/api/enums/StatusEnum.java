package helpdesk.api.enums;

public enum StatusEnum {
	New,
	Assigned,
	Resolved,
	Aproved,
	Disapproved,
	Closed;
	
	public static StatusEnum getStatus(String status) {
		switch(status) {
			case "New" : return New;
			case "Assigned" : return Assigned;
			case "Resolved" : return Resolved;
			case "Disapproved" : return Disapproved;
			case "Closed" : return Closed;
			default : return New;
		}
	}
}
