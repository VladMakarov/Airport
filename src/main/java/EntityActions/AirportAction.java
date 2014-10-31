package EntityActions;

import java.util.List;
import javax.persistence.EntityTransaction;
import MyEntityFactory.MyEntityManager;
import com.academysmart.jpa.model.Airport;


public class AirportAction {
	
	private EntityTransaction tx;

	public Airport getAirportById(long id) {
		Airport result = null;
		try {
			MyEntityManager.setUp();
			result = MyEntityManager.em.find(Airport.class, id);
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
	
	public void addAirport(Airport airport){
		try {
			MyEntityManager.setUp();
			tx = MyEntityManager.em.getTransaction();
			tx.begin();
			MyEntityManager.em.persist(airport);
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
	public List<Airport> getAllAirpors(){
		List<Airport> result = null;
		try {
			MyEntityManager.setUp();
			result = MyEntityManager.em.createNamedQuery("selectAirports").getResultList();
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
