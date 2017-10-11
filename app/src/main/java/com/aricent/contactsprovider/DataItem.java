package com.aricent.contactsprovider;

public class DataItem {

    private String name, ph;

    public DataItem() {
    }

    public DataItem(String name, String ph) {
        this.name = name;
        this.ph = ph;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPh() {
        return ph;
    }

    public void setPh(String ph) {
        this.ph = ph;
    }
}
