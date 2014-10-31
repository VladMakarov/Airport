package EntityActions;

import java.util.List;
import javax.persistence.EntityTransaction;
import MyEntityFactory.MyEntityManager;
import com.academysmart.jpa.model.Flight;

public class FlightAction {
	
	private EntityTransaction tx;

	public Flight getFlightById(long id) {
		Flight result = null;
		try {
			MyEntityManager.setUp();
			result = MyEntityManager.em.find(Flight.class, id);
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
	
	public void addFlight(Flight flight){
		try {
			MyEntityManager.setUp();
			tx = MyEntityManager.em.getTransaction();
			tx.begin();
			MyEntityManager.em.persist(flight);
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
	public List<Flight> getAllFlights(){
		List<Flight> result = null;
		try {
			MyEntityManager.setUp();
			result = MyEntityManager.em.createNamedQuery("selectFlights").getResultList();
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
