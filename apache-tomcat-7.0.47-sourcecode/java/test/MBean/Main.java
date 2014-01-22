package test.MBean;

import javax.management.*;
import java.lang.management.ManagementFactory;

/**
 * User: Nathanchen Date: 22/01/14 Time: 1:29 PM Description:
 */
public class Main
{
    public static void main(String[] args) throws MalformedObjectNameException, NotCompliantMBeanException, InstanceAlreadyExistsException, MBeanRegistrationException, InterruptedException
    {
        MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
        ObjectName name = new ObjectName("test.MBean:type=Hello");
        Hello mbean = new Hello();
        mbs.registerMBean(mbean, name);


        System.out.println("Waiting forever...");
        Thread.sleep(Long.MAX_VALUE);
    }
}
