package com.vngilev.homework4;

public class Truck {
    long id;
    String type;
    int capacity;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Truck truck = (Truck) o;

        if (getId() != truck.getId()) return false;
        if (getCapacity() != truck.getCapacity()) return false;
        return getType() != null ? getType().equals(truck.getType()) : truck.getType() == null;

    }

    public Truck() {
    }

    @Override
    public int hashCode() {
        int result = (int) (getId() ^ (getId() >>> 32));
        result = 31 * result + (getType() != null ? getType().hashCode() : 0);
        result = 31 * result + getCapacity();
        return result;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Truck:[" + id +
                ", " + type + ", " + capacity+ "]";
    }

    public Truck(long id, String type, int capacity) {
        this.id = id;
        this.type = type;
        this.capacity = capacity;

    }


}