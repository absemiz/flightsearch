package com.absemiz.flightsearch.dataaccessobject;

import com.absemiz.flightsearch.entity.Flight;

import java.util.List;

public interface IFlightDataAccessObject
{
    List<Flight> findAll();

    Flight findByID(int id);

    Flight save(Flight flight);

    void deleteByID(int id);

}
