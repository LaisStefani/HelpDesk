package helpdesk.api.service.impl;

import helpdesk.api.entity.ChangeStatus;
import helpdesk.api.entity.Ticket;
import helpdesk.api.repository.ChangeStatusRepository;
import helpdesk.api.repository.TicketRepository;
import helpdesk.api.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    @Autowired
    private ChangeStatusRepository changeStatusRepository;

    @Override
    public Ticket createOrUpdate(Ticket ticket) {
        return null;
    }

    @Override
    public Ticket findById(String id) {
        return null;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public Page<Ticket> listTicket(int page, int count) {
        return null;
    }

    @Override
    public ChangeStatus createChangeStatus(ChangeStatus changeStatus) {
        return null;
    }

    @Override
    public Iterable<ChangeStatus> listChangeStatus(String ticketId) {
        return null;
    }

    @Override
    public Page<Ticket> findByCurrentUser(int page, int count, String userId) {
        return null;
    }

    @Override
    public Page<Ticket> findByParameters(int page, int count, String title, String status, String priority) {
        return null;
    }

    @Override
    public Page<Ticket> findByParametersAndCurrentUser(int page, int count, String title, String status, String priority, String userId) {
        return null;
    }

    @Override
    public Page<Ticket> findByNumber(int page, int count, Integer number) {
        return null;
    }

    @Override
    public Page<Ticket> findAll() {
        return null;
    }

    @Override
    public Page<Ticket> findByParameterAndAssignedUser(int page, int count, String title, String status, String priority, String assignedUser) {
        return null;
    }
}
