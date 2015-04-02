package uk.co.stevegiller.deadmeatgf.matchtimer;

/**
 * Created by DeadMeatGF on 02/04/2015.
 */
public class Venue {
    private int mVenueId;
    private String mVenueName;
    private long mLongitude;
    private long mLatitude;
    private String mPostcode;

    public Venue(String venueName) {
        this.mVenueName = venueName;
    }

    public Venue(String venueName, String postcode) {
        this.mVenueName = venueName;
        this.mPostcode = postcode;
    }

    public Venue(String venueName, long longitude, long latitude, String postcode) {
        this.mVenueName = venueName;
        this.mLongitude = longitude;
        this.mLatitude = latitude;
        this.mPostcode = postcode;
    }

    public Venue(int venueId, String venueName, long longitude, long latitude, String postcode) {
        this.mVenueId = venueId;
        this.mVenueName = venueName;
        this.mLongitude = longitude;
        this.mLatitude = latitude;
        this.mPostcode = postcode;
    }
}
