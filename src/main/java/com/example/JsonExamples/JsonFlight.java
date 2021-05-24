package com.example.JsonExamples;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@JsonInclude(JsonInclude.Include.NON_NULL)
public class JsonFlight {

    @GetMapping("/flights/flight")
     public TicketDetails getPersonsTickets(){
       Date myDate ;
       Calendar cal = Calendar.getInstance();
       cal.set(Calendar.MONTH, 03);
       cal.set(Calendar.DATE, 21);
       cal.set(Calendar.YEAR, 2017);
       cal.set(Calendar.HOUR,14);
       cal.set(Calendar.MINUTE,34);
       myDate = cal.getTime();

        TicketDetails tDetails = new TicketDetails();
        TicketDetails.Tickets tks = new TicketDetails.Tickets();
        TicketDetails.Passengers pgr = new TicketDetails.Passengers();

        tDetails.setDeparts(myDate);
        pgr.setFirstName("Madhavi");
        pgr.setLastName("Yerukala");

        List<TicketDetails.Passengers> passenger = new ArrayList<>();
        passenger.add(pgr);

        tks.setPrice(200);
        tks.setPassengers(passenger);

        List<TicketDetails.Tickets> tickets = new ArrayList<>();
        tickets.add(tks);

        tDetails.setTickets(tickets);

        return tDetails;
    }
}
