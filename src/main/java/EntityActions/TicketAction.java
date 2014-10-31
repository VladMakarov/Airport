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
	
//	private void calculatePrice(Ticket ticket, Session session) {
//		double price = ticket.getFlight().getRoute().getPrice();
//		if (ticket.getType().toLowerCase().equals("adult")) {
//		ticket.setPrice(price + (ticket.getBaggage() * 40));
//		} else ticket.setPrice((price + (ticket.getBaggage() * 40)) * 0.8);
//		if (ticket.getNumberofclass() == 1 && (ticket.getType().equals("adult")) && ticket.getFlight().getFirstClass() != 0) {
//		session.update(ticket.getFlight());
//		ticket.getFlight().setFirstClass((ticket.getFlight().getFirstClass()) - 1);
//		ticket.setPrice(ticket.getPrice() + 300);
//		} else if (ticket.getNumberofclass() == 2 && (ticket.getType().equals("adult")) && ticket.getFlight().getSecondClass() != 0) {
//		session.update(ticket.getFlight());
//		ticket.getFlight().setSecondClass((ticket.getFlight().getSecondClass()) - 1);
//		ticket.setPrice(ticket.getPrice() + 200);
//		} else if (ticket.getNumberofclass() == 3 && !(ticket.getType().equals("adult")) && ticket.getFlight().getSecondClass() != 0) {
//		session.update(ticket.getFlight());
//		ticket.getFlight().setSecondClass((ticket.getFlight().getSecondClass()) - 1);
//		}
//		}
	
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
