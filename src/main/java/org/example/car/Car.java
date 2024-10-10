package org.example.car;

public class Car implements Drivable {
    private String make;
    private String model;
    private int yearOfIssue;

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    @Override
    public void start(){
        System.out.println("Трогаемся");
    }
    @Override
    public void stop(){
        System.out.println("Остановка");

    }
    @Override
    public void drive(int distance){
        for (int i = 0; i < distance; i++){
            System.out.print(".");
        }
    }
}
