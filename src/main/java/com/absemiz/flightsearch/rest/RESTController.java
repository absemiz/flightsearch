package com.absemiz.flightsearch.rest;

import com.absemiz.flightsearch.dataaccessobject.FlightDataAccessObject;
import com.absemiz.flightsearch.entity.Flight;
import com.absemiz.flightsearch.service.FlightService;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RESTController
{
    private FlightService m_flightService;

    public RESTController(FlightService flightService)
    {
        m_flightService = flightService;
    }

    @GetMapping("/flights")
    public List<Flight> getFlights()
    {
        return m_flightService.findAll();
    }

    @GetMapping("/flights/{flightID}")
    public Flight getFlightByID(@PathVariable int flightID)
    {
        Flight flight =  m_flightService.findByID(flightID);

        if (flight == null)
        {
            throw  new FlightNotFoundException(
                    String.format("Flight id-%d not found.",
                            flightID
                    )
            );
        }

        return flight;
    }

}
