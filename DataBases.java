/*
La variable <historyData> de la clase <HashMap> la declaro *STATIC*
para que sea de la clase y no de cada objeto independiente y pueda
almacenar el histórico de todos los eventos creados
 */

package com.mycompany.eventmasterpro;

import java.util.HashMap;

public class DataBases {

    HashMap<String, String> eventData = new HashMap();
    HashMap<String, String> artistData = new HashMap();
    HashMap<String, Float> reportData = new HashMap();
    static HashMap<String, String> historyData = new HashMap();

    public DataBases() {

    }

    public void toShowHD() {
        System.out.println("------------------------------------------------------------");
        System.out.println("           H I S T O R Y    I N F O R M A T I O N");
        System.out.println("------------------------------------------------------------");
        System.out.println("No: " + historyData.get("No: "));
        System.out.println("Artis name: "  + historyData.get("Artis name: "));
        System.out.println("Date: " + historyData.get("Date: "));
        System.out.println("Time: " + historyData.get("Time: "));
        System.out.println("Hours: " + historyData.get("Hours: "));
        System.out.println("Cost per hours: " + historyData.get("Cost per hours: "));
        System.out.println("------------------------------------------------------------");
    }

    public void toShowRD() {
        System.out.println("------------------------------------------------------------");
        System.out.println("           R E P O R T S    I N F O R M A T I O N");
        System.out.println("------------------------------------------------------------");
        System.out.println("Budget: " + reportData.get("Budget: "));
        System.out.println("Income: " + reportData.get("Income: "));
        System.out.println("Expenses: " + reportData.get("Expenses: "));
        System.out.println("Event cost: " + reportData.get("Event cost: "));
        System.out.println("Artist Cost: " + reportData.get("Artist Cost: "));
        System.out.println("Tickets sold: " + reportData.get("Tickets sold: "));
        System.out.println("Ticket price: " + reportData.get("Ticket price: "));
        System.out.println("------------------------------------------------------------");
    }

    public void toShowAD() {
        System.out.println("------------------------------------------------------------");
        System.out.println("           A R T I S T    I N F O R M A T I O N");
        System.out.println("------------------------------------------------------------");
        System.out.println("Artist name: " + artistData.get("Artist name: "));
        System.out.println("Cellphone: " + artistData.get("Cellphone: "));
        System.out.println("Genre: " + artistData.get("Genre: "));
        System.out.println("Hours: " + artistData.get("Hours: "));
        System.out.println("Cost per hours: " + artistData.get("Cost per hours: "));
        System.out.println("Total cost: " + artistData.get("Total cost: "));
        System.out.println("------------------------------------------------------------");
    }

    public void ToShowED() {
        System.out.println("------------------------------------------------------------");
        System.out.println("            E V E N T    I N F O R M A T I O N");
        System.out.println("------------------------------------------------------------");
        System.out.println("Event name: " + eventData.get("Event name: "));
        System.out.println("Event type: " + eventData.get("Event type: "));
        System.out.println("University Name: " + eventData.get("University: "));
        System.out.println("Event date: " + eventData.get("Date: "));
        System.out.println("Event time: " + eventData.get("Time: "));
        System.out.println("Event location: " + eventData.get("Location: "));
        System.out.println("Capacity: " + eventData.get("Capacity: "));
        System.out.println("Cost per person: " + eventData.get("Cost per person: "));
        System.out.println("Total cost of the event: " + eventData.get("Cost per Event: "));
        System.out.println("------------------------------------------------------------");
    }
}
