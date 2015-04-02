package uk.co.stevegiller.deadmeatgf.matchtimer;

/**
 * Created by DeadMeatGF on 02/04/2015.
 */
public class Event {
    private int mEventTeam;
    private int mEventPlayer;
    private int mEventType;
    private long mEventTime;

    public Event(int eventTeam, int eventPlayer, int eventType, long eventTime) {
        this.mEventTeam = eventTeam;
        this.mEventPlayer = eventPlayer;
        this.mEventType = eventType;
        this.mEventTime = eventTime;
    }
}
