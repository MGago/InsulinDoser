package model;

import java.util.concurrent.LinkedBlockingQueue;

/**
 *
 * @author Sérgio
 */
public class TimeController extends Thread {

    private final int TIME_LIMIT = 2000;
    private LinkedBlockingQueue<ThreadControll> threadsToControll;

    public TimeController() {
        threadsToControll = new LinkedBlockingQueue();
    }

    public void regist(Thread thread, Voter voter, Value value) {
        long currentTimeMillis = System.currentTimeMillis();
        threadsToControll.add(new ThreadControll(currentTimeMillis, thread, voter, value));
    }

    @Override
    public void run() {
        ThreadControll take;
        while (true) {
            try {
                take = threadsToControll.take();
                long currentTimeMillis = System.currentTimeMillis();
                long timePassed = currentTimeMillis - take.getTime();

                if (timePassed < TIME_LIMIT) {
                    Thread.sleep(TIME_LIMIT - timePassed);
                }
                if (take.getThread().isAlive()) {
                    take.getThread().stop();
                    take.getValue().setValue(-9);
                    take.getValue().setState("Timeout");
                    take.getVoter().callWSs(1);
                }
            } catch (InterruptedException ex) {
                System.err.println("Erro no TimeController: " + ex);
            }
        }
    }
}

class ThreadControll {

    private long time;
    private Thread thread;
    private Voter voter;
    private Value value;

    public ThreadControll(long time, Thread thread, Voter voter, Value value) {
        this.time = time;
        this.thread = thread;
        this.voter = voter;
        this.value = value;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public Thread getThread() {
        return thread;
    }

    public void setThread(Thread thread) {
        this.thread = thread;
    }

    public Voter getVoter() {
        return voter;
    }

    public void setVoter(Voter voter) {
        this.voter = voter;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }
    
    
}
