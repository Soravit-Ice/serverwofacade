package serverwofacade;

public class StopServer {
    public void stopServer(){
        ScheduleServer scheduleServer = new ScheduleServer();
        System.out.println("After work done.........");
        scheduleServer.releaseProcesses();
        scheduleServer.destory();
        scheduleServer.destroySystemObjects();
        scheduleServer.destoryListeners();
        scheduleServer.destoryContext();
        scheduleServer.shutdown();
    }
}
