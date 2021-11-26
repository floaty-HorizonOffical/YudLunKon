package YudLunKon.official.util;

public class Break {
    public static void PauseMs(Integer ms) {
        try {
            Thread.currentThread().sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void PauseSec(Integer sec) {
        int seconds = sec * 1000;
        try {
            Thread.currentThread().sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void PauseMin(Integer min) {
        int mins = min * 1000;
        try {
            Thread.currentThread().sleep(mins*60);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
