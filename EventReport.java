package com.mycompany.eventmasterpro;

public class EventReport {

    float eventIncome, eventExpenses;

    public EventReport() {
    }

    public float getEventIncome() {
        return eventIncome;
    }

    public void setEventIncome(float _eventIncome) {
        this.eventIncome = _eventIncome;
    }

    public float getEventExpenses() {
        return eventExpenses;
    }

    public void setEventExpenses(float _eventExpenses) {
        this.eventExpenses = _eventExpenses;
    }

    public float toCreateExpenses(float _eCost, float _aCost) {
        eventExpenses = _eCost + _aCost;
        return eventExpenses;
    }
    
    public float toCreateIncome(float _tCost, float _capacity) {
        eventIncome = _tCost * _capacity;
        return eventIncome;
    }
}
