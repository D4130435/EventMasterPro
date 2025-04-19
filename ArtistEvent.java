/*
Esta clase la dejé sin Setters para que la forma de acceder
y modificar los atributos del artista sea por medio del método
toModifyArtist
 */

/*
Todas los valores deben indicarse en USD(dólares)
por ejemplo 520, 1000, 215...
*/

package com.mycompany.eventmasterpro;

import java.util.Scanner;

public class ArtistEvent {

    String artistname;
    String cellphone;
    String genre;
    float hours, costPerHour, totalCost;
    int option;

    Scanner sx = new Scanner(System.in);

    public ArtistEvent(String _artistname, String _cellphone, String _genre, float _costPerHour) {
        this.artistname = _artistname;
        this.cellphone = _cellphone;
        this.genre = _genre;
        this.costPerHour = _costPerHour;
    }

    public ArtistEvent() {
    }

    public String getArtistname() {
        return artistname;
    }

    public String getCellphone() {
        return cellphone;
    }

    public String getGenre() {
        return genre;
    }

    public float getHours() {
        return hours;
    }

    public float getCostPerHour() {
        return costPerHour;
    }

    public float getTotalCost() {
        return totalCost;
    }
    
    public void toCreateArtist() {
        OUTER1:
        while (true) {
            System.out.println("------------------------------------------------------------");
            System.out.println("               A R T I S T    C R E A T O R");
            System.out.println("------------------------------------------------------------");
            System.out.println("1 - Create new artist");
            System.out.println("2 - Exit");
            System.out.println("------------------------------------------------------------");
            System.out.print("Enter option: ");
            option = sx.nextInt();
            System.out.println("------------------------------------------------------------");
            switch (option) {
                case 1 -> {
                    System.out.println("------------------------------------------------------------");
                    System.out.print("Enter artist name: ");
                    sx.nextLine();
                    artistname = sx.nextLine();
                    System.out.println("------------------------------------------------------------");
                    System.out.println("------------------------------------------------------------");
                    System.out.print("Enter cellphone: ");
                    cellphone = sx.nextLine();
                    System.out.println("------------------------------------------------------------");
                    System.out.println("------------------------------------------------------------");
                    System.out.print("Enter genre: ");
                    genre = sx.nextLine();
                    System.out.println("------------------------------------------------------------");
                    System.out.println("------------------------------------------------------------");
                    System.out.print("Enter hours: ");
                    hours = sx.nextFloat();
                    System.out.println("------------------------------------------------------------");
                    System.out.println("------------------------------------------------------------");
                    System.out.print("Enter cost per hour: ");
                    costPerHour = sx.nextFloat();
                    System.out.println("------------------------------------------------------------");
                    totalCost = hours * costPerHour;
                }
                case 2 -> {
                    System.out.println("------------------------------------------------------------");
                    System.out.println("                Exiting the artist creator");
                    System.out.println("------------------------------------------------------------");
                    break OUTER1;
                }
                default -> {
                    System.out.println("------------------------------------------------------------");
                    System.out.println("                     Invalid option");
                    System.out.println("------------------------------------------------------------");
                }
            }
        }

    }

    public void toModifyArtist() {
        OUTER2:
        while (true) {
            System.out.println("------------------------------------------------------------");
            System.out.println("               A R T I S T    M O D I F I E R");
            System.out.println("------------------------------------------------------------");
            System.out.println("What do you want to modify: ");
            System.out.println("------------------------------------------------------------");
            System.out.println("1 - Artist name");
            System.out.println("2 - Cellphone");
            System.out.println("3 - Genre");
            System.out.println("4 - Hours");
            System.out.println("5 - Cost per hours");
            System.out.println("6 - Exit");
            System.out.println("------------------------------------------------------------");
            System.out.print("Enter option: ");
            option = sx.nextInt();
            System.out.println("------------------------------------------------------------");
            switch (option) {
                case 1 -> {
                    System.out.println("------------------------------------------------------------");
                    System.out.print("Enter new artist name: ");
                    sx.nextLine();
                    artistname = sx.nextLine();
                    System.out.println("------------------------------------------------------------");
                }
                case 2 -> {
                    System.out.println("------------------------------------------------------------");
                    System.out.print("Enter new cellphone: ");
                    sx.nextLine();
                    cellphone = sx.nextLine();
                    System.out.println("------------------------------------------------------------");
                }
                case 3 -> {
                    System.out.println("------------------------------------------------------------");
                    System.out.print("Enter new genre: ");
                    sx.nextLine();
                    genre = sx.nextLine();
                    System.out.println("------------------------------------------------------------");
                }
                case 4 -> {
                    System.out.println("------------------------------------------------------------");
                    System.out.print("Enter new hours: ");
                    hours = sx.nextFloat();
                    System.out.println("------------------------------------------------------------");
                    totalCost = hours * costPerHour;
                }
                case 5 -> {
                    System.out.println("------------------------------------------------------------");
                    System.out.print("Enter new cost per hour: ");
                    costPerHour = sx.nextFloat();
                    System.out.println("------------------------------------------------------------");
                    totalCost = hours * costPerHour;
                }
                case 6 -> {
                    System.out.println("------------------------------------------------------------");
                    System.out.println("               Exiting the artist modifier");
                    System.out.println("------------------------------------------------------------");
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

    public void toDeleteArtist() {
        OUTER3:
        while (true) {
            System.out.println("------------------------------------------------------------");
            System.out.println("                A R T I S T    D E L E T E R");
            System.out.println("------------------------------------------------------------");
            System.out.println("What do you want to DO: ");
            System.out.println("------------------------------------------------------------");
            System.out.println("1 - Delete artist");
            System.out.println("2 - exit");
            System.out.println("------------------------------------------------------------");
            System.out.print("Enter option: ");
            option = sx.nextInt();
            System.out.println("------------------------------------------------------------");
            switch (option) {
                case 1 -> {
                    artistname = "No artist";
                    cellphone = "No cellphone";
                    genre = "No genre";
                    hours = 0;
                    costPerHour = 0;
                    totalCost = 0;
                    System.out.println("------------------------------------------------------------");
                    System.out.println("                      Event delete");
                    System.out.println("------------------------------------------------------------");
                }
                case 2 -> {
                    System.out.println("------------------------------------------------------------");
                    System.out.println("               Exiting the artist deleter");
                    System.out.println("------------------------------------------------------------");
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
}
