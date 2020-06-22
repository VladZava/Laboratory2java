package edu.slovak.model;

import edu.slovak.IAccounting;

/**
 *   Lab. Work 2
 *   Task: 6. Air fly : low-cost and business-class.
 *
 *
 *@version 1.0 [22] [06] [2020]
 * @author Vladyslav Zavada
 */

public class BusinessClass implements IAccounting {

    private String name; // name ticket
    private double price; //suitcase weight
    private int hours; //landing time

    public BusinessClass() {
    }

    public BusinessClass(String name, double price, int hours) {
        this.name = name;
        this.price = this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getprice() {
        return price;
    }

    public void setRate(double price) {
        this.price = price;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "BusinessClass{" +
                "name='" + name + '\'' +
                ", rate=" + price +
                ", hours=" + hours +
                '}';
    }

    @Override
    public int getTicket() {
        return (int) (this.getHours() * this.getprice());
    }
}