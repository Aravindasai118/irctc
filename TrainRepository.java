package org.example.repository;

import org.example.entities.Train;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class TrainRepository {
    private List<Train> trainList=new ArrayList<>();
    public TrainRepository() {
        trainList.add(new Train("T101", "Godavari Express", "Vizag", "Hyderbad", LocalDate.of(2026, 02, 01), LocalTime.of(18, 40), 50));
        trainList.add(new Train("T102", "Visakha Express", "Hyderbad", "Vizag", LocalDate.of(2026, 02, 01), LocalTime.of(09, 01), 60));
        trainList.add(new Train("T103", "Bangalore Express", "Vizag", "Bangalore", LocalDate.of(2026, 02, 01), LocalTime.of(12, 15), 70));
    }
    public List<Train> getAllTrains(){
        return new ArrayList<>(trainList);
    }
    
    public Train findById(String trainId){
        for(Train train : trainList){
            if(train.getTrainId().equalsIgnoreCase(trainId)){
                return train;
            }
        }
        return null;
        }
}

