package parkingLot.dto;

public class TicketResponseDTO {
    private String entryTime;
    private String vehicleNumber;
    private int slotNumber;

    @Override
    public String toString() {
        return "TicketResponseDTO{" +
                "entryTime='" + entryTime + '\'' +
                ", vehicleNumber='" + vehicleNumber + '\'' +
                ", slotNumber=" + slotNumber +
                '}';
    }

    public String getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(String entryTime) {
        this.entryTime = entryTime;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public int getSlotNumber() {
        return slotNumber;
    }

    public void setSlotNumber(int slotNumber) {
        this.slotNumber = slotNumber;
    }
}
