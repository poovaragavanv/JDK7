public class AggregationDemo {
 
    public static void main(String[] args) {
        Address address = new Address();
        address.setDoorNo("201");
        address.setStreet("Gajuwaka");
        address.setCity("Visakhapatnam");
        Employee employee = new Employee();
        employee.setId(112);
        employee.setName("Rahul");
        employee.setAddress(address);
        System.out.println("Employee :: " + employee);
    }
 
}
 
class Employee {
 
    private int id;
    private String name;
    private Address address;  // Employee Has a Address
 
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public Address getAddress() {
        return address;
    }
 
    public void setAddress(Address address) {
        this.address = address;
    }
 
    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", address=" + address + '}';
    }
 
}
 
class Address {
 
    private String doorNo;
    private String street;
    private String city;
 
    public String getDoorNo() {
        return doorNo;
    }
 
    public void setDoorNo(String doorNo) {
        this.doorNo = doorNo;
    }
 
    public String getStreet() {
        return street;
    }
 
    public void setStreet(String street) {
        this.street = street;
    }
 
    public String getCity() {
        return city;
    }
 
    public void setCity(String city) {
        this.city = city;
    }
 
    @Override
    public String toString() {
        return "Address{" + "doorNo=" + doorNo + ", street=" + street + ", city=" + city + '}';
    }
 
}