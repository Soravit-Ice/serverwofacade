package serverwofacade;

import java.util.Objects;

public class FacadeController {
    private static FacadeController facadeController = null;
    public static FacadeController getFacadeController(){
        if(Objects.isNull(facadeController)){
            facadeController = new FacadeController();
        }
        return facadeController;
    }

    public void startServer(){
        StartServer startServer = new StartServer();
        startServer.startServer();
    }

    public void stopServer(){
        StopServer stopServer = new StopServer();
        stopServer.stopServer();
    }
}
