package uk.co.stevegiller.deadmeatgf.matchtimer;

/**
 * Created by DeadMeatGF on 02/04/2015.
 */
public class Match {
    private int mVenue;
    private String mHomeTeam;
    private String mAwayTeam;
    private long mMatchStart;
    private int mMatchLength;
    private int mTeamSize;
    private int mSubstitutes;
    private int mHomeScore;
    private int mAwayScore;

    public Match() {
        mVenue = -1;
        mHomeTeam = "Home Team";
        mAwayTeam = "Away Team";
        mMatchStart = 0;
        mMatchLength = 40;
        mTeamSize = 15;
        mSubstitutes = 7;
        mHomeScore = 0;
        mAwayScore = 0;
    }

    public Match(String homeTeam, String awayTeam, int matchLength, int teamSize, int substitutes) {
        this.mVenue = -1;
        this.mHomeTeam = homeTeam;
        this.mAwayTeam = awayTeam;
        this.mMatchStart = 0;
        this.mMatchLength = matchLength;
        this.mTeamSize = teamSize;
        this.mSubstitutes = substitutes;
        this.mHomeScore = 0;
        this.mAwayScore = 0;
    }

    public Match(int venue, String homeTeam, String awayTeam, long matchStart, int matchLength, int teamSize, int substitutes) {
        this.mVenue = venue;
        this.mHomeTeam = homeTeam;
        this.mAwayTeam = awayTeam;
        this.mMatchStart = matchStart;
        this.mMatchLength = matchLength;
        this.mTeamSize = teamSize;
        this.mSubstitutes = substitutes;
        this.mHomeScore = 0;
        this.mAwayScore = 0;
    }
}
