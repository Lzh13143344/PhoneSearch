import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.offcn.dao.MobileDao;
import com.offcn.service.MobileService;

public class App {
public static void main(String[] args) {
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-service.xml","spring-dao.xml");
     MobileService bean = context.getBean(MobileService.class);
	System.out.println(bean.getByMNumber("13000003367"));
}
}
