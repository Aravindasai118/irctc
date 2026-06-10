package org.example.entities;

import java.sql.Time;
import java.util.Date;

public class Train {
    private String trainId;
    private String trainName;
    private String source;
    private String destination;
    private Date traindate;
    private Time traintime;
    private int seats;
    public Train(){
    }
    public Train(String trainId,String trainName,String source,String destination,Date traindate,Time traintime,int seats){
        this.trainId=trainId;
        this.trainName=trainName;
        this.source=source;
        this.destination=destination;
        this.traindate=traindate;
        this.traintime=traintime;
        this.seats=seats;
    }

    public String getTrainId() {
        return trainId;
    }

    public String getTrainName() {
        return trainName;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public Date getTraindate() {
        return traindate;
    }

    public Time getTraintime() {
        return traintime;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

}



