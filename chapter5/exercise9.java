public class Car {

    private String manufacturer;
    private String modelName;
    private int modelYear;
    private String licensePlate;
    
    public Car(String manufacturer, String modelName, int modelYear, String licensePlate){
        this.manufacturer = manufacturer;
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.licensePlate = licensePlate;
    }

    public Car(String manufacturer, String modelName, int modelYear){
        this.manufacturer = manufacturer;
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.licensePlate = "";
    }

    public Car(String manufacturer, String modelName, String licensePlate){
        this.manufacturer = manufacturer;
        this.modelName = modelName;
        this.modelYear = -1;
        this.licensePlate = licensePlate;
    }

    public Car(String manufacturer, String modelName){
        this.manufacturer = manufacturer;
        this.modelName = modelName;
        this.modelYear = -1;
        this.licensePlate = "";
    }
    
    public String getManufacturer(){
        return manufacturer;
    }

    public String getModelName(){
        return modelName;
    }
    
    public int getModelYear(){
        return modelYear;
    }

    public String getLicensePlate(){
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate){
        this.licensePlate = licensePlate;
    }
}

// The java class, written idiomatically with correct styling is about 52 lines longer than its scala equivalent.
