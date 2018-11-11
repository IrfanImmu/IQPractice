package info.callisto;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import info.callisto.controller.EmployeeController;
import info.callisto.entity.Employee;

/**
 * Hello world!
 *
 */
@Configuration
@ComponentScan(basePackages="info.callisto")
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
    	Employee employee = new Employee();
    	employee.setEno(20);
    	employee.setName("chaan");
    	employee.setSalary(2000f);
        AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(App.class);
        EmployeeController controller = container.getBean(EmployeeController.class);
        controller.saveEmployeeController(employee);
        container.close();
        
        
    }
}
