/*
Esta clase la dejé sin Setters para que la forma de acceder
y modificar los atributos del evento sea por medio del método
toModifyEvent
 */

 /*
Todas los valores deben indicarse en USD(dólares)
por ejemplo 520, 1000, 215...
 */

 /*
El costo por persona hace referencia a lo que le cuesta
cada persona a la universidad en el evento
 */
package com.mycompany.eventmasterpro;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ManagerEvent extends AbstractEventType {

    LocalDate dateEvent;
    LocalTime timeEvent;

    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm");

    Scanner sx = new Scanner(System.in);

    public ManagerEvent() {
        super();
    }

    @Override
    public String getNameEvent() {
        return super.nameEvent;
    }

    @Override
    public String getTypeEvent() {
        return super.typeEvent;
    }

    @Override
    public String getDate() {
        return super.date;
    }

    @Override
    public String getTime() {
        return super.time;
    }

    @Override
    public String getNameUniversity() {
        return super.nameUniversity;
    }

    @Override
    public String getLocation() {
        return super.location;
    }

    @Override
    public int getCapacity() {
        return super.capacity;
    }

    @Override
    public float getCostPerPerson() {
        return super.costPerPerson;
    }

    @Override
    public float getCostperEvent() {
        return super.costperEvent;
    }

    @Override
    public float getEventBudget() {
        return eventBudget;
    }

    @Override
    public float getTicketPrice() {
        return ticketPrice;
    }

    public void toCreateEvent() {
        OUTER_:
        while (true) {
            System.out.println("------------------------------------------------------------");
            System.out.println("                 E V E N T    C R E A T O R");
            System.out.println("------------------------------------------------------------");
            System.out.println("1 - Create new event");
            System.out.println("2 - Exit");
            System.out.println("------------------------------------------------------------");
            System.out.print("Enter option: ");
            super.option = sx.nextInt();
            System.out.println("------------------------------------------------------------");
            switch (option) {
                case 1 -> {
                    System.out.print("Enter event name: ");
                    sx.nextLine();
                    super.nameEvent = sx.nextLine();
                    System.out.println("------------------------------------------------------------");
                    OUTER:
                    while (true) {
                        System.out.println("------------------------------------------------------------");
                        System.out.println("Choose event type:");
                        System.out.println("------------------------------------------------------------");
                        System.out.println("1 - Concert");
                        System.out.println("2 - Talent show");
                        System.out.println("3 - Themed party");
                        System.out.println("4 - Sport games");
                        System.out.println("5 - Videogame tournament");
                        System.out.println("6 - boardgame tournament");
                        System.out.println("------------------------------------------------------------");
                        System.out.print("Enter option: ");
                        super.option = sx.nextInt();
                        System.out.println("------------------------------------------------------------");
                        switch (option) {
                            case 1 -> {
                                super.typeEvent = "Concert";
                                break OUTER;
                            }

                            case 2 -> {
                                super.typeEvent = "Talent show";
                                break OUTER;
                            }

                            case 3 -> {
                                super.typeEvent = "Themed party";
                                break OUTER;
                            }

                            case 4 -> {
                                super.typeEvent = "Sport games";
                                break OUTER;
                            }

                            case 5 -> {
                                super.typeEvent = "Videogame tournament";
                                break OUTER;
                            }

                            case 6 -> {
                                super.typeEvent = "Boardgame tournament";
                                break OUTER;
                            }

                            default -> {
                                System.out.println("------------------------------------------------------------");
                                System.out.println("                     Invalid option");
                                System.out.println("------------------------------------------------------------");
                            }
                        }
                    }
                    System.out.println("------------------------------------------------------------");
                    System.out.print("Enter event date (dd/MM/yyyy): ");
                    sx.nextLine();
                    enter = sx.nextLine();
                    System.out.println("------------------------------------------------------------");
                    dateEvent = LocalDate.parse(enter, dateFormat);
                    super.date = dateEvent.format(dateFormat);
                    System.out.println("------------------------------------------------------------");
                    System.out.print("Enter event time (HH:mm): ");
                    enter = sx.nextLine();
                    System.out.println("------------------------------------------------------------");
                    timeEvent = LocalTime.parse(enter, timeFormat);
                    super.time = timeEvent.format(timeFormat);
                    OUTER2:
                    while (true) {
                        System.out.println("------------------------------------------------------------");
                        System.out.println("Choose university:");
                        System.out.println("------------------------------------------------------------");
                        System.out.println("1 - ITM");
                        System.out.println("2 - TdeA");
                        System.out.println("3 - UdeA");
                        System.out.println("4 - UNAL Medellin");
                        System.out.println("5 - Pascual Bravo");
                        System.out.println("6 - Colmayor");
                        System.out.println("7 - U digital");
                        System.out.println("------------------------------------------------------------");
                        System.out.print("Enter option: ");
                        super.option = sx.nextInt();
                        System.out.println("------------------------------------------------------------");
                        switch (option) {
                            case 1 -> {
                                super.nameUniversity = "ITM";
                                break OUTER2;
                            }

                            case 2 -> {
                                super.nameUniversity = "TdeA";
                                break OUTER2;
                            }

                            case 3 -> {
                                super.nameUniversity = "UdeA";
                                break OUTER2;
                            }

                            case 4 -> {
                                super.nameUniversity = "UNAL Medellin";
                                break OUTER2;
                            }

                            case 5 -> {
                                super.nameUniversity = "Pascual Bravo";
                                break OUTER2;
                            }

                            case 6 -> {
                                super.nameUniversity = "Colmayor";
                                break OUTER2;
                            }

                            case 7 -> {
                                super.nameUniversity = "U digital";
                                break OUTER2;
                            }

                            default -> {
                                System.out.println("------------------------------------------------------------");
                                System.out.println("                     Invalid option");
                                System.out.println("------------------------------------------------------------");
                            }
                        }
                    }
                    OUTER3:
                    while (true) {
                        System.out.println("------------------------------------------------------------");
                        System.out.println("Choose event location");
                        System.out.println("------------------------------------------------------------");
                        System.out.println("1 - Court");
                        System.out.println("2 - Library");
                        System.out.println("3 - Parking");
                        System.out.println("4 - Auditorium");
                        System.out.println("5 - Classrooms");
                        System.out.println("6 - Computer lab");
                        System.out.println("7 - Other");
                        System.out.println("------------------------------------------------------------");
                        System.out.print("Enter option: ");
                        option = sx.nextInt();
                        System.out.println("------------------------------------------------------------");
                        switch (option) {
                            case 1 -> {
                                super.location = "Court";
                                break OUTER3;
                            }

                            case 2 -> {
                                super.location = "Library";
                                break OUTER3;
                            }

                            case 3 -> {
                                super.location = "Parking";
                                break OUTER3;
                            }

                            case 4 -> {
                                super.location = "Auditorium";
                                break OUTER3;
                            }

                            case 5 -> {
                                super.location = "Classrooms";
                                break OUTER3;
                            }

                            case 6 -> {
                                super.location = "Computer lab";
                                break OUTER3;
                            }

                            case 7 -> {
                                super.location = "Other";
                                break OUTER3;
                            }

                            default -> {
                                System.out.println("------------------------------------------------------------");
                                System.out.println("                     Invalid option");
                                System.out.println("------------------------------------------------------------");
                            }
                        }
                    }
                    System.out.println("------------------------------------------------------------");
                    System.out.print("Enter event capacity: ");
                    super.capacity = sx.nextInt();
                    System.out.println("------------------------------------------------------------");
                    System.out.println("------------------------------------------------------------");
                    System.out.print("Enter cost per person: ");
                    super.costPerPerson = sx.nextFloat();
                    super.costperEvent = super.capacity * super.costPerPerson;
                    System.out.println("------------------------------------------------------------");
                    System.out.println("------------------------------------------------------------");
                    System.out.print("Enter event budget: ");
                    super.eventBudget = sx.nextFloat();
                    System.out.println("------------------------------------------------------------");
                    System.out.println("------------------------------------------------------------");
                    System.out.print("Enter ticket price: ");
                    super.ticketPrice = sx.nextFloat();
                    System.out.println("------------------------------------------------------------");
                }

                case 2 -> {
                    System.out.println("------------------------------------------------------------");
                    System.out.println("                Exiting the event creator");
                    System.out.println("------------------------------------------------------------");
                    break OUTER_;
                }

                default -> {
                    System.out.println("------------------------------------------------------------");
                    System.out.println("                     Invalid option");
                    System.out.println("------------------------------------------------------------");
                }
            }
        }
    }

    public void toModifyEvent() {
        OUTER4:
        while (true) {
            System.out.println("------------------------------------------------------------");
            System.out.println("                E V E N T    M O D I F I E R");
            System.out.println("------------------------------------------------------------");
            System.out.println("What do you want to modify: ");
            System.out.println("------------------------------------------------------------");
            System.out.println("1 - Event name");
            System.out.println("2 - University name");
            System.out.println("3 - Event type");
            System.out.println("4 - Date");
            System.out.println("5 - Time");
            System.out.println("6 - Capacity");
            System.out.println("7 - Location");
            System.out.println("8 - Capacity");
            System.out.println("9 - Cost per person");
            System.out.println("10 - Budget");
            System.out.println("11 - Ticket price");
            System.out.println("12 - Exit");
            System.out.println("------------------------------------------------------------");
            System.out.print("Enter option: ");
            option = sx.nextInt();
            System.out.println("------------------------------------------------------------");
            switch (option) {
                case 1 -> {
                    System.out.println("------------------------------------------------------------");
                    System.out.print("Enter new event name: ");
                    sx.nextLine();
                    super.nameEvent = sx.nextLine();
                    System.out.println("------------------------------------------------------------");
                    break;
                }

                case 2 -> {
                    System.out.println("------------------------------------------------------------");
                    System.out.println("Choose new university:");
                    System.out.println("------------------------------------------------------------");
                    System.out.println("1 - ITM");
                    System.out.println("2 - TdeA");
                    System.out.println("3 - UdeA");
                    System.out.println("4 - UNAL Medellin");
                    System.out.println("5 - Pascual Bravo");
                    System.out.println("6 - Colmayor");
                    System.out.println("7 - U digital");
                    System.out.println("------------------------------------------------------------");
                    System.out.print("Enter new option: ");
                    super.option = sx.nextInt();
                    System.out.println("------------------------------------------------------------");
                    switch (option) {
                        case 1 -> {
                            super.nameUniversity = "ITM";
                            break;
                        }

                        case 2 -> {
                            super.nameUniversity = "TdeA";
                            break;
                        }

                        case 3 -> {
                            super.nameUniversity = "UdeA";
                            break;
                        }

                        case 4 -> {
                            super.nameUniversity = "UNAL Medellin";
                            break;
                        }

                        case 5 -> {
                            super.nameUniversity = "Pascual Bravo";
                            break;
                        }

                        case 6 -> {
                            super.nameUniversity = "Colmayor";
                            break;
                        }

                        case 7 -> {
                            super.nameUniversity = "U digital";
                            break;
                        }

                        default -> {
                            System.out.println("------------------------------------------------------------");
                            System.out.println("                     Invalid option");
                            System.out.println("------------------------------------------------------------");
                        }
                    }
                }

                case 3 -> {
                    System.out.println("------------------------------------------------------------");
                    System.out.println("Choose new event:");
                    System.out.println("------------------------------------------------------------");
                    System.out.println("1 - Concert");
                    System.out.println("2 - Talent show");
                    System.out.println("3 - Themed party");
                    System.out.println("4 - Sport games");
                    System.out.println("5 - Videogame tournament");
                    System.out.println("6 - boardgame tournament");
                    System.out.println("------------------------------------------------------------");
                    System.out.print("Enter new option: ");
                    super.option = sx.nextInt();
                    System.out.println("------------------------------------------------------------");
                    switch (option) {
                        case 1 -> {
                            super.typeEvent = "Concert";
                            break;
                        }

                        case 2 -> {
                            super.typeEvent = "Talent show";
                            break;
                        }

                        case 3 -> {
                            super.typeEvent = "Themed party";
                            break;
                        }

                        case 4 -> {
                            super.typeEvent = "Sport games";
                            break;
                        }

                        case 5 -> {
                            super.typeEvent = "Videogame tournament";
                            break;
                        }

                        case 6 -> {
                            super.typeEvent = "Boardgame tournament";
                            break;
                        }

                        default -> {
                            System.out.println("------------------------------------------------------------");
                            System.out.println("                     Invalid option");
                            System.out.println("------------------------------------------------------------");
                        }
                    }
                }

                case 4 -> {
                    System.out.println("------------------------------------------------------------");
                    System.out.print("Enter new date (dd/MM/yyyy): ");
                    sx.nextLine();
                    enter = sx.nextLine();
                    System.out.println("------------------------------------------------------------");
                    dateEvent = LocalDate.parse(enter, dateFormat);
                    super.date = dateEvent.format(dateFormat);
                }

                case 5 -> {
                    System.out.println("------------------------------------------------------------");
                    System.out.print("Enter new time (HH:mm): ");
                    sx.nextLine();
                    enter = sx.nextLine();
                    System.out.println("------------------------------------------------------------");
                    timeEvent = LocalTime.parse(enter, timeFormat);
                    super.time = timeEvent.format(timeFormat);
                    break;
                }

                case 6 -> {
                    System.out.println("------------------------------------------------------------");
                    System.out.print("Enter new capacity: ");
                    super.capacity = sx.nextInt();
                    System.out.println("------------------------------------------------------------");
                    break;
                }

                case 7 -> {
                    System.out.println("------------------------------------------------------------");
                    System.out.println("Choose new location");
                    System.out.println("------------------------------------------------------------");
                    System.out.println("1 - Court");
                    System.out.println("2 - Library");
                    System.out.println("3 - Parking");
                    System.out.println("4 - Auditorium");
                    System.out.println("5 - Classrooms");
                    System.out.println("6 - Computer lab");
                    System.out.println("7 - Other");
                    System.out.println("------------------------------------------------------------");
                    System.out.print("Enter new option: ");
                    option = sx.nextInt();
                    System.out.println("------------------------------------------------------------");
                    switch (option) {
                        case 1 -> {
                            super.location = "Court";
                            break;
                        }

                        case 2 -> {
                            super.location = "Library";
                            break;
                        }

                        case 3 -> {
                            super.location = "Parking";
                            break;
                        }

                        case 4 -> {
                            super.location = "Auditorium";
                            break;
                        }

                        case 5 -> {
                            super.location = "Classrooms";
                            break;
                        }

                        case 6 -> {
                            super.location = "Computer lab";
                            break;
                        }

                        case 7 -> {
                            super.location = "Other";
                            break;
                        }

                        default -> {
                            System.out.println("------------------------------------------------------------");
                            System.out.println("                     Invalid option");
                            System.out.println("------------------------------------------------------------");
                        }
                    }
                }

                case 8 -> {
                    System.out.println("------------------------------------------------------------");
                    System.out.print("Enter new event capacity: ");
                    super.capacity = sx.nextInt();
                    System.out.println("------------------------------------------------------------");
                    super.costperEvent = super.capacity * super.costPerPerson;
                }

                case 9 -> {
                    System.out.println("------------------------------------------------------------");
                    System.out.print("Enter new cost per person: ");
                    super.costPerPerson = sx.nextFloat();
                    System.out.println("------------------------------------------------------------");
                    super.costperEvent = super.capacity * super.costPerPerson;
                }

                case 10 -> {
                    System.out.println("------------------------------------------------------------");
                    System.out.print("Enter new event budget: ");
                    super.eventBudget = sx.nextFloat();
                    System.out.println("------------------------------------------------------------");
                }

                case 11 -> {
                    System.out.println("------------------------------------------------------------");
                    System.out.print("Enter new ticket price: ");
                    super.ticketPrice = sx.nextFloat();
                    System.out.println("------------------------------------------------------------");
                }

                case 12 -> {
                    System.out.println("------------------------------------------------------------");
                    System.out.println("                Exiting the event modifier");
                    System.out.println("------------------------------------------------------------");
                    break OUTER4;
                }

                default -> {
                    System.out.println("------------------------------------------------------------");
                    System.out.println("                     Invalid option");
                    System.out.println("------------------------------------------------------------");
                    break;
                }
            }
        }
    }

    public void toDeleteEvent() {
        OUTER5:
        while (true) {
            System.out.println("------------------------------------------------------------");
            System.out.println("                 E V E N T    D E L E T E R");
            System.out.println("------------------------------------------------------------");
            System.out.println("What do you want to DO: ");
            System.out.println("------------------------------------------------------------");
            System.out.println("1 - Delete event");
            System.out.println("2 - exit");
            System.out.println("------------------------------------------------------------");
            System.out.print("Enter option: ");
            option = sx.nextInt();
            System.out.println("------------------------------------------------------------");
            switch (option) {
                case 1 -> {
                    super.nameEvent = "No event";
                    super.nameUniversity = "No event";
                    super.typeEvent = "No event";
                    super.time = "No event";
                    super.date = "No event";
                    super.location = "No event";
                    super.capacity = 0;
                    super.costPerPerson = 0;
                    super.costperEvent = 0;
                    super.eventBudget = 0;
                    super.ticketPrice = 0;
                    System.out.println("------------------------------------------------------------");
                    System.out.println("                      Event delete");
                    System.out.println("------------------------------------------------------------");
                    break;
                }

                case 2 -> {
                    System.out.println("------------------------------------------------------------");
                    System.out.println("                Exiting the event deleter");
                    System.out.println("------------------------------------------------------------");
                    break OUTER5;
                }

                default -> {
                    System.out.println("------------------------------------------------------------");
                    System.out.println("                     Invalid option");
                    System.out.println("------------------------------------------------------------");
                    break;
                }
            }
        }
    }
}
