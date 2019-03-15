public class Truck  implements Vehicle{
    private VehicleType type;
    public Truck (VehicleType type){
        this.type= type;
    }
    public VehicleSize getSize(){
        return VehicleSize.SMALL;
    }
    public VehicleType getType(){
        return type;
    }
}

