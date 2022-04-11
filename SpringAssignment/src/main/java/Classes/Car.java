package Classes;

public class Car {
    private String company;
    private String model;
    private Vehicle vehicle;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void display()
    {
        System.out.println("Car Details\nCompany : "+getCompany()+"\nModel : "+getModel()+
                "\nVehicle Details\n"+getVehicle());
    }
}
