import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimedExit {
Timer timer = new Timer();
TimerTask exitApp = new TimerTask() {
public void run() {
    System.exit(0);
    }
};

public void TimedExit1() {
timer.schedule(exitApp, new Date(System.currentTimeMillis()+3*1000));
    }

}
