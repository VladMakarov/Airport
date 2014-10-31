package EntityActions;

import java.util.List;
import javax.persistence.EntityTransaction;
import MyEntityFactory.MyEntityManager;
import com.academysmart.jpa.model.FlightSpecific;

public class FlightSpecificAction {
	
	private EntityTransaction tx;

	public FlightSpecific getFlightSpecificById(long id) {
		FlightSpecific result = null;
		try {
			MyEntityManager.setUp();
			result = MyEntityManager.em.find(FlightSpecific.class, id);
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
	
	public void addFlightSpecific(FlightSpecific flightSpecific){
		try {
			MyEntityManager.setUp();
			tx = MyEntityManager.em.getTransaction();
			tx.begin();
			MyEntityManager.em.persist(flightSpecific);
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
	public List<FlightSpecific> getAllFlightSpecifics(){
		List<FlightSpecific> result = null;
		try {
			MyEntityManager.setUp();
			result = MyEntityManager.em.createNamedQuery("selectFlightSpecifics").getResultList();
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
