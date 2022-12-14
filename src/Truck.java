public class Truck extends Transport implements Competing {

    private final String downloadAddress;                    //адрес загрузки

    private final double maximumCargoVolume;             //максимальный объем груза

    private final double maximumCargoWeight;         //максимальный вес груза

    private final String downloadType;              //тип загрузки

    private TypeLoadCapacity typeLoadCapacity;

    protected Truck (String marka, String model, double engineVolume, String downloadAddress, double maximumCargoVolume,
                     double maximumCargoWeight, String downloadType, TypeLoadCapacity typeLoadCapacity) {
        super(marka, model, engineVolume);
        this.downloadAddress = downloadAddress;
        this.maximumCargoVolume = maximumCargoVolume;
        this.maximumCargoWeight = maximumCargoWeight;
        this.downloadType = downloadType;
        this.typeLoadCapacity = typeLoadCapacity;
    }

    public TypeLoadCapacity getTypeLoadCapacity() {
        return typeLoadCapacity;
    }

    public void setTypeLoadCapacity(TypeLoadCapacity typeLoadCapacity) {
        this.typeLoadCapacity = typeLoadCapacity;
    }

    public String getDownloadAddress() {
        return downloadAddress;
    }

    public double getMaximumCargoVolume() {
        return maximumCargoVolume;
    }

    public double getMaximumCargoWeight() {
        return maximumCargoWeight;
    }

    public String getDownloadType() {
        return downloadType;
    }

    @Override
    public void startMoving() {

    }

    @Override
    public void spopMoving() {

    }

    @Override
    public void determineTypeCar() {
        if (typeLoadCapacity == null) {
            System.out.println("Данных по авто недостаточно");
        } else {
            String from = typeLoadCapacity.getFrom() == null ? "" : "от " + typeLoadCapacity.getFrom();
            String to = typeLoadCapacity.getTo() == null ? "" : " до " + typeLoadCapacity.getTo();
            System.out.println("Тип авто по грузоподьемности - " + from + to + " тонн.");
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                ", адрес загрузки -  - " + downloadAddress  +
                ", максимальный объем груза - " + maximumCargoVolume +
                ", максимальный вес груза - " + maximumCargoWeight +
                ", тип загрузки ТС -  " + downloadType;
    }

    @Override
    public String[] pitStop() {
        System.out.println(getMarka() + " - заехать на Пит-Стоп");
        return new String[0];
    }

    @Override
    public String[] bestLapTime() {
        System.out.println(getMarka() + " - лушее время круга");
        return new String[0];
    }

    @Override
    public int[] maxSpeed() {
        System.out.println(getMarka() +  " - максимальная скорость");
        return new int[0];
    }
}
