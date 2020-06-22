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

public class LowCost implements IAccounting {

    private String name;
    private int priceTicket;

    public LowCost() {
    }

    public LowCost(String name, int priceTicket) {
        this.name = name;
        this.priceTicket = priceTicket;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriceTicket() {
        return priceTicket;
    }

    public void setPriceTicket(int priceTicket) {
        this.priceTicket = priceTicket;
    }

    @Override
    public String toString() {
        return "LowCost{" +
                "name='" + name + '\'' +
                ", monthlyTicket=" + priceTicket +
                '}';
    }

    @Override
    public int getTicket() {
        return this.getPriceTicket();
    }
}