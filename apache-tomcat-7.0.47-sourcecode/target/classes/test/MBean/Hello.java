package test.MBean;

/**
 * User: Nathanchen Date: 22/01/14 Time: 1:29 PM Description:
 */
public class Hello implements HelloMBean
{
    private final String NAME = "Reginald";
    private static final int DEFAULT_CACHE_SIZE = 200;
    private int cacheSize = DEFAULT_CACHE_SIZE;

    @Override
    public void sayHello ()
    {
        System.out.println("hello, world");
    }

    @Override
    public int add (int x, int y)
    {
        return x + y;
    }

    @Override
    public String getName ()
    {
        return this.NAME;
    }

    @Override
    public int getCacheSize ()
    {
        return this.cacheSize;
    }

    @Override
    public void setCacheSize (int size)
    {
        this.cacheSize = size;
        System.out.println("Cache size now " + this.cacheSize);
    }
}
