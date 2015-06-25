package listener;
import java.util.ArrayList;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import model.*;
 

public class ListWebServices implements ServletContextListener {

    public static ArrayList<WebService> availableWS;
    public static TimeController timeController;
    
    @Override
    public void contextDestroyed(ServletContextEvent arg0) {
        System.out.println("Listener destroyed");
        //When server shutsdown
    }

    //Run this before web application is started
    @Override
    public void contextInitialized(ServletContextEvent arg0) {
        System.out.println("Listener initialized");
        
        timeController = new TimeController();
        timeController.start();
        
        availableWS = new ArrayList<WebService>();
        availableWS.add(new WebService6()); //nosso webservice
        availableWS.add(new WebService1());
        availableWS.add(new WebService2());
        availableWS.add(new WebService3());
        availableWS.add(new WebService4());
        availableWS.add(new WebService5());
        availableWS.add(new WebService7());
        availableWS.add(new WebService8());
        availableWS.add(new WebService9());
        System.out.println("Arraylist populated");
    }
    
}
