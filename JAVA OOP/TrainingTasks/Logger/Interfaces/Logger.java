package Logger.Interfaces;

public interface Logger {

    //Info > Warning > Error > Critical > Fatal.

    void logInfo(String time,String message);
    void logWarning(String time,String message);
    void logError(String time,String message);
    void logCritical(String time,String message);
    void logFatal(String time,String message);
}
