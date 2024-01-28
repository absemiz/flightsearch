package com.absemiz.flightsearch.service;

import java.util.List;
import com.absemiz.flightsearch.entity.Flight;

public interface IFlightService
{
    List<Flight> findAll();

    Flight findByID(int id);

    Flight save(Flight flight);

    void deleteByID(int id);
}
