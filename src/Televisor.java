public class Televisor {
    String information;
    boolean standby;

    Televisor(String i, boolean s)
    {
        information = i;
        standby = s;
        standby = false;
    }

    void turnOn()
    {
        standby = true;

    }

    void turnOff()
    {
        standby = false;
    }

    void showStatus()
    {
        System.out.print("TV name is " + information + " and its status: " );
        if(standby == true)
        {
            System.out.print("online");
        }
        else
        {
            System.out.print("offline");
        }
    }

}
