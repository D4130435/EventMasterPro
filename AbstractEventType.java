package com.mycompany.eventmasterpro;

public abstract class AbstractEventType {
    
    String nameEvent, typeEvent, nameUniversity, location, date, time, enter;
    int capacity, option;
    float costPerPerson, costperEvent, eventBudget, ticketPrice;
    static int eventCounter;
    
    public AbstractEventType(){
        eventCounter ++;
        System.out.println("------------------------------------------------------------");
        System.out.println("Evento No. "  + eventCounter);
        System.out.println("------------------------------------------------------------");
    }

    public String getNameEvent() {
        return nameEvent;
    }

    public void setNameEvent(String _nameEvent) {
        this.nameEvent = _nameEvent;
    }

    public String getTypeEvent() {
        return typeEvent;
    }

    public void setTypeEvent(String _typeEvent) {
        this.typeEvent = _typeEvent;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String _date) {
        this.date = _date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String _time) {
        this.time = _time;
    }

    public String getNameUniversity() {
        return nameUniversity;
    }

    public void setNameUniversity(String _nameUniversity) {
        this.nameUniversity = _nameUniversity;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String _location) {
        this.location = _location;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int _capacity) {
        this.capacity = _capacity;
    }

    public float getCostPerPerson() {
        return costPerPerson;
    }

    public void setCostPerPerson(float _costPerPerson) {
        this.costPerPerson = _costPerPerson;
    }

    public float getCostperEvent() {
        return costperEvent;
    }

    public void setCostperEvent(float _costperEvent) {
        this.costperEvent = _costperEvent;
    }

    public float getEventBudget() {
        return eventBudget;
    }

    public void setEventBudget(float _eventBudget) {
        this.eventBudget = _eventBudget;
    }

    public float getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(float ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
}
