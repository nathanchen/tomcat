package test.MBean;

/**
 * User: Nathanchen Date: 22/01/14 Time: 1:29 PM Description:
 */
public interface HelloMBean
{
    public void sayHello();
    public int add(int x, int y);

    public String getName();

    public int getCacheSize();
    public void setCacheSize(int size);
}
