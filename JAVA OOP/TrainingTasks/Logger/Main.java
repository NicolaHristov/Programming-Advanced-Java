package Logger;

import Logger.Appenders.FileAppender;
import Logger.Appenders.LogFile;
import Logger.Interfaces.Appender;
import Logger.Interfaces.File;
import Logger.Interfaces.Layout;
import Logger.Interfaces.Logger;
import Logger.Appenders.ConsoleAppender;
import Logger.enums.ReportLevel;
import Logger.impl.MessageLogger;
import Logger.layout.SimpleLayout;
import Logger.layout.XmlLayout;

public class Main {
    public static void main(String[] args) {

        Layout simpleLayout = new SimpleLayout();
        Appender consoleAppender = new ConsoleAppender(simpleLayout);
        consoleAppender.setReportLevel(ReportLevel.INFO);

        Logger logger = new MessageLogger(consoleAppender);

        logger.logInfo("3/31/2015 5:33:07 PM", "Everything seems fine");
        logger.logWarning("3/31/2015 5:33:07 PM", "Warning: ping is too high - disconnect imminent");
        logger.logError("3/31/2015 5:33:07 PM", "Error parsing request");
        logger.logCritical("3/31/2015 5:33:07 PM", "No connection string found in App.config");
        logger.logFatal("3/31/2015 5:33:07 PM", "mscorlib.dll does not respond");

        System.out.println(logger);



    }
}
