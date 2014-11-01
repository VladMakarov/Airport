package EntityActions;

import java.util.List;
import javax.persistence.EntityTransaction;
import MyEntityFactory.MyEntityManager;
import com.academysmart.jpa.model.Ticket;

public class TicketAction {
	
	private EntityTransaction tx;

	public Ticket getTicketById(long id) {
		Ticket result = null;
		try {
			MyEntityManager.setUp();
			result = MyEntityManager.em.find(Ticket.class, id);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				MyEntityManager.tearDown();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	public double calculatePrice(Ticket ticket) {
		double result = 0;
		double bagageCost = 0;
		bagageCost = ticket.getBaggage() * 40;
		result = ticket.getFlight().getPrice() + ticket.getFlight().getFlightType().getPrice();
		if(ticket.getChild()){
			result *= 0.8;
		}
		result += bagageCost;
		return result;
	}
	
	public void addTicket(Ticket ticket){
		try {
			MyEntityManager.setUp();
			tx = MyEntityManager.em.getTransaction();
			tx.begin();
			MyEntityManager.em.persist(ticket);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				MyEntityManager.tearDown();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<Ticket> getAllTickets(){
		List<Ticket> result = null;
		try {
			MyEntityManager.setUp();
			result = MyEntityManager.em.createNamedQuery("selectTickets").getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				MyEntityManager.tearDown();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return result;
	}

}
