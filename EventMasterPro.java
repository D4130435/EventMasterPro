// ----------------------------------------------------------------------------------------------------- //
//  Software creado para gestionar los eventos en las fiestas de las universidades públicas de Medellín  //
// ----------------------------------------------------------------------------------------------------- //

// Sólo cree un evento para demostrar la función de mi software


package com.mycompany.eventmasterpro;

import java.util.Scanner;

public class EventMasterPro {

    public static void main(String[] args) {

        int opt;

        //Instanciar objeto de clase <DataBases>
        DataBases DB = new DataBases();

        //Instanciación objeto de la clase <ManagerEvent>
        ManagerEvent eventOne = new ManagerEvent();

        //Instanciar objeto de la clase <ArtistEvent>
        ArtistEvent artistOne = new ArtistEvent();
        
        //Instanciar objeto de la clase <EventReport>
        EventReport reportOne = new EventReport();

        Scanner sc = new Scanner(System.in);

        OUTER:
        while (true) {
            System.out.println("------------------------------------------------------------");
            System.out.println("             E V E N T    M A S T E R    P R O");
            System.out.println("------------------------------------------------------------");
            System.out.println("What do you want to do: ");
            System.out.println("------------------------------------------------------------");
            System.out.println("1 - Create event/artist");
            System.out.println("2 - Modify event/artist");
            System.out.println("3 - Delete event/artist");
            System.out.println("4 - Show informartion");
            System.out.println("5 - Exit");
            System.out.println("------------------------------------------------------------");
            System.out.print("Enter option: ");
            opt = sc.nextInt();
            System.out.println("------------------------------------------------------------");
            switch (opt) {
                case 1 -> {
                    OUTER2:
                    while (true) {
                        System.out.println("------------------------------------------------------------");
                        System.out.println("What do you want to do: ");
                        System.out.println("------------------------------------------------------------");
                        System.out.println("1 - Create event");
                        System.out.println("2 - Create artist");
                        System.out.println("3 - Exit");
                        System.out.println("------------------------------------------------------------");
                        System.out.print("Enter option: ");
                        opt = sc.nextInt();
                        System.out.println("------------------------------------------------------------");
                        switch (opt) {
                            case 1 -> {
                                eventOne.toCreateEvent();
                            }

                            case 2 -> {
                                artistOne.toCreateArtist();
                            }

                            case 3 -> {
                                break OUTER2;
                            }

                            default -> {
                                System.out.println("------------------------------------------------------------");
                                System.out.println("                     Invalid option");
                                System.out.println("------------------------------------------------------------");
                            }
                        }
                    }
                }

                case 2 -> {
                    OUTER3:
                    while (true) {
                        System.out.println("------------------------------------------------------------");
                        System.out.println("What do you want to do: ");
                        System.out.println("------------------------------------------------------------");
                        System.out.println("1 - Modify event");
                        System.out.println("2 - Modify artist");
                        System.out.println("3 - Exit");
                        System.out.println("------------------------------------------------------------");
                        System.out.print("Enter option: ");
                        opt = sc.nextInt();
                        System.out.println("------------------------------------------------------------");
                        switch (opt) {
                            case 1 -> {
                                eventOne.toModifyEvent();
                            }

                            case 2 -> {
                                artistOne.toModifyArtist();
                            }

                            case 3 -> {
                                break OUTER3;
                            }

                            default -> {
                                System.out.println("------------------------------------------------------------");
                                System.out.println("                     Invalid option");
                                System.out.println("------------------------------------------------------------");
                            }
                        }
                    }
                }

                case 3 -> {
                    OUTER4:
                    while (true) {
                        System.out.println("------------------------------------------------------------");
                        System.out.println("What do you want to do: ");
                        System.out.println("------------------------------------------------------------");
                        System.out.println("1 - Delete event");
                        System.out.println("2 - Delete artist");
                        System.out.println("3 - Exit");
                        System.out.println("------------------------------------------------------------");
                        System.out.print("Enter option: ");
                        opt = sc.nextInt();
                        System.out.println("------------------------------------------------------------");
                        switch (opt) {
                            case 1 -> {
                                eventOne.toDeleteEvent();
                            }

                            case 2 -> {
                                artistOne.toDeleteArtist();
                            }

                            case 3 -> {
                                break OUTER4;
                            }

                            default -> {
                                System.out.println("------------------------------------------------------------");
                                System.out.println("                     Invalid option");
                                System.out.println("------------------------------------------------------------");
                            }
                        }
                    }
                }

                case 4 -> {
                    //Base de datos tabla evento
                    DB.eventData.put("Event name: ", eventOne.getNameEvent());
                    DB.eventData.put("Event type: ", eventOne.getTypeEvent());
                    DB.eventData.put("University: ", eventOne.getNameUniversity());
                    DB.eventData.put("Date: ", eventOne.getDate());
                    DB.eventData.put("Time: ", eventOne.getTime());
                    DB.eventData.put("Location: ", eventOne.getLocation());
                    DB.eventData.put("Capacity: ", String.valueOf(eventOne.getCapacity()));
                    DB.eventData.put("Cost per person: ", String.valueOf(eventOne.getCostPerPerson()));
                    DB.eventData.put("Cost per Event: ", String.valueOf(eventOne.getCostperEvent()));
                    
                    //Base de datos tabla artistas
                    DB.artistData.put("Artist name: ", artistOne.getArtistname());
                    DB.artistData.put("Cellphone: ", artistOne.getCellphone());
                    DB.artistData.put("Genre: ", artistOne.getGenre());
                    DB.artistData.put("Hours: ", String.valueOf(artistOne.getHours()));
                    DB.artistData.put("Cost per hours: ", String.valueOf(artistOne.getCostPerHour()));
                    DB.artistData.put("Total cost: ", String.valueOf(artistOne.getTotalCost()));
                    
                    //Base de datos tabla reportes
                    DB.reportData.put("Budget: ", eventOne.getEventBudget());
                    DB.reportData.put("Event cost: ", eventOne.getCostperEvent());
                    DB.reportData.put("Artist Cost: ", artistOne.getTotalCost());
                    DB.reportData.put("Income: ", reportOne.toCreateIncome(eventOne.getTicketPrice(), eventOne.getCapacity()));
                    DB.reportData.put("Expenses: ", reportOne.toCreateExpenses(eventOne.getCostperEvent(), artistOne.getTotalCost()));
                    DB.reportData.put("Tickets sold: ", (float)eventOne.getCapacity());
                    DB.reportData.put("Ticket price: ", eventOne.getTicketPrice());
                    
                    //Base de datos tabla historial
                    DataBases.historyData.put("No: ", String.valueOf(AbstractEventType.eventCounter));
                    DataBases.historyData.put("Artis name: ", artistOne.getArtistname());
                    DataBases.historyData.put("Date: ", eventOne.getDate());
                    DataBases.historyData.put("Time: ", eventOne.getTime());
                    DataBases.historyData.put("Hours: ", String.valueOf(artistOne.getHours()));
                    DataBases.historyData.put("Cost per hours: ", String.valueOf(artistOne.getCostPerHour()));
                    
                    OUTER5:
                    while (true) {
                        System.out.println("------------------------------------------------------------");
                        System.out.println("What do you want to do: ");
                        System.out.println("------------------------------------------------------------");
                        System.out.println("1 - Show event information");
                        System.out.println("2 - Show artist information");
                        System.out.println("3 - Show reports information");
                        System.out.println("4 - Show history information");
                        System.out.println("5 - Exit");
                        System.out.println("------------------------------------------------------------");
                        System.out.print("Enter option: ");
                        opt = sc.nextInt();
                        System.out.println("------------------------------------------------------------");
                        switch (opt) {
                            case 1 -> {
                                DB.ToShowED();
                            }

                            case 2 -> {
                                DB.toShowAD();
                            }

                            case 3 -> {
                                DB.toShowRD();
                            }

                            case 4 -> {
                                DB.toShowHD();
                            }

                            case 5 -> {
                                break OUTER5;
                            }

                            default -> {
                                System.out.println("------------------------------------------------------------");
                                System.out.println("                     Invalid option");
                                System.out.println("------------------------------------------------------------");
                            }
                        }
                    }
                }

                case 5 -> {
                    break OUTER;
                }

                default -> {
                    System.out.println("------------------------------------------------------------");
                    System.out.println("                     Invalid option");
                    System.out.println("------------------------------------------------------------");
                }
            }
        }
    }
}
