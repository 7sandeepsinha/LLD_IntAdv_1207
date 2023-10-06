package parkingLot.repository;

import parkingLot.exception.ParkingFloorNotFoundException;
import parkingLot.models.ParkingFloor;

import java.util.HashMap;

public class ParkingFloorRepository {
    private HashMap<Integer, ParkingFloor> parkingFloorMap;

    public ParkingFloorRepository() {
        this.parkingFloorMap = new HashMap<>();
    }

    public ParkingFloor get(int parkingFloorId) throws ParkingFloorNotFoundException {
        ParkingFloor parkingFloor = parkingFloorMap.get(parkingFloorId);
        if(parkingFloor == null){
            throw new ParkingFloorNotFoundException("ParkingFloor not found for Id : " + parkingFloorId);
        }
        return parkingFloor;
    }

    public ParkingFloor put(ParkingFloor parkingFloor){
        parkingFloorMap.put(parkingFloor.getId(), parkingFloor);
        return parkingFloor;
    }
}
