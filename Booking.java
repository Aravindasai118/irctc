package org.example.entities;

import java.sql.Time;
import java.util.Date;

public class Booking {
    private String bookingId;
    private String userId;
    private String fromLocation;
    private String toLocation;
    private Date dateOfTravel;
    private Time timeOfTravel;


    public Booking() {
    }

    public Booking(String bookingId, String userId, String fromLocation, String toLocation, Date dateOfTravel, Time timeOfTravel) {
        this.bookingId = bookingId;
        this.userId=userId;
        this.fromLocation=fromLocation;
        this.toLocation=toLocation;
        this.dateOfTravel=dateOfTravel;
        this.timeOfTravel=timeOfTravel;
    }
    public String getBookingId(){
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFromLocation() {
        return fromLocation;
    }

    public void setFromLocation(String fromLocation) {
        this.fromLocation = fromLocation;
    }

    public String getToLocation() {
        return toLocation;
    }

    public void setToLocation(String toLocation) {
        this.toLocation = toLocation;
    }

    public Date getDateOfTravel() {
        return dateOfTravel;
    }

    public void setDateOfTravel(Date dateOfTravel) {
        this.dateOfTravel = dateOfTravel;
    }

    public Time getTimeOfTravel() {
        return timeOfTravel;
    }

    public void setTimeOfTravel(Time timeOfTravel) {
        this.timeOfTravel = timeOfTravel;
    }
}
