package org.niit;

import com.configration.EmployeeConfig;
import com.domain.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class EmployeeImpl
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(EmployeeConfig.class);

        Employee e1 = applicationContext.getBean("emp1",Employee.class);

        System.out.println(e1);
    }
}
