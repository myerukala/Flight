package com.example.JsonExamples;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.List;

    public class TicketDetails {

    private Date departs;
    private List<Tickets> tickets;

    @JsonFormat(pattern = "yyyy-MM-dd hh:mm")
    public Date getDeparts() { return departs; }

    public void setDeparts(Date dateTime) { this.departs = dateTime; }

    public List<Tickets> getTickets() {
        return tickets;
    }

    public void setTickets(List<Tickets> tickets) {
        this.tickets = tickets;
    }

    static class Tickets {

        private List<Passengers> passengers;
        private int price;

        public int getPrice() {
            return price; }

        public void setPrice(int price) { this.price = price; }

        public List<Passengers> getPassengers() {
            return passengers;
        }

        public void setPassengers(List<Passengers> passengers) {
            this.passengers = passengers;
        }
    }

    static class Passengers {
        private String firstName;
        private String lastName;

        public String getFirstName() { return firstName; }

        public void setFirstName(String firstName) { this.firstName = firstName; }

        public String getLastName() { return lastName; }

        public void setLastName(String lastName) { this.lastName = lastName; }
    }
}
