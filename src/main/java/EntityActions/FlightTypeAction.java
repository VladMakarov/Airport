package EntityActions;

import java.util.List;
import javax.persistence.EntityTransaction;
import MyEntityFactory.MyEntityManager;
import com.academysmart.jpa.model.FlightType;

public class FlightTypeAction {
	
	private EntityTransaction tx;

	public FlightType getFlightTypeById(long id) {
		FlightType result = null;
		try {
			MyEntityManager.setUp();
			result = MyEntityManager.em.find(FlightType.class, id);
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
	
	public void addFlightType(FlightType flightType){
		try {
			MyEntityManager.setUp();
			tx = MyEntityManager.em.getTransaction();
			tx.begin();
			MyEntityManager.em.persist(flightType);
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
	public List<FlightType> getAllFlightTypes(){
		List<FlightType> result = null;
		try {
			MyEntityManager.setUp();
			result = MyEntityManager.em.createNamedQuery("selectFlightTypes").getResultList();
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
