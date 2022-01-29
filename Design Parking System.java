class ParkingSystem {

    protected int bigCapacity;
    protected int mediumCapacity;
    protected int smallCapacity;

    public ParkingSystem(int big, int medium, int small) {
        bigCapacity = big; mediumCapacity = medium; smallCapacity = small;
    }

    public boolean addCar(int carType) {
        switch (carType){
            case 1 : return bigCapacity-- > 0;
            case 2 : return mediumCapacity-- > 0;
            case 3 : return smallCapacity-- > 0;
            default:
        }
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
