/* This way seems wrong but is both functionally identical to the solution asked for and more idiomatic of the scala language */
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

    public Car(String manufacturer, String modelName, int modelYear, String licensePlate){
        this.manufacturer = manufacturer;
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.licensePlate = licensePlate;
    }

    public Car(String manufacturer, String modelName, int modelYear, String licensePlate){
        this.manufacturer = manufacturer;
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.licensePlate = licensePlate;
    }

    public Car(String manufacturer, String modelName, int modelYear, String licensePlate){
        this.manufacturer = manufacturer;
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.licensePlate = licensePlate;
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
        this.licensePlate = licensePlate
            }

}
