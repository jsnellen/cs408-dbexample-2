package edu.jsu.mcis.cs408.dbexample;

public class Contact {

    private int id;
    private String name;
    private String address;

    public Contact(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Contact(String name, String address) {
        this.name = name;
        this.address = address;
    }

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("Name: ").append(name).append("\n");
        s.append("Address: ").append(address).append("\n");
        return s.toString();
    }

}