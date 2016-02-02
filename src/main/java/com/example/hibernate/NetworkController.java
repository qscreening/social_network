import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Query;
import java.util.Iterator; 

@RestController
public class NetworkController {
	@RequestMapping("/Network")
 	 public ArrayList network() {
                Session session = HibernateSessionManager.getSessionFactory().openSession();
		session.beginTransaction();
		Query query = session.createQuery("from users");
		ArrayList list = query.list();
 		session.save(list);
 		session.getTransaction().commit();
		return list;
	}
}


