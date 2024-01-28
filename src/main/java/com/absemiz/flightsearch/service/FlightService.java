package com.absemiz.flightsearch.service;

import com.absemiz.flightsearch.dataaccessobject.FlightDataAccessObject;
import com.absemiz.flightsearch.entity.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FlightService implements IFlightService
{
    private FlightDataAccessObject m_fdao;

    @Autowired
    public FlightService(FlightDataAccessObject fdao)
    {
        m_fdao = fdao;
    }

    @Override
    public List<Flight> findAll()
    {
        return m_fdao.findAll();
    }

    @Override
    public Flight findByID(int id) {
        return m_fdao.findByID(id);
    }

    @Transactional
    @Override
    public Flight save(Flight flight)
    {
        return m_fdao.save(flight);
    }

    @Transactional
    @Override
    public void deleteByID(int id)
    {
        m_fdao.deleteByID(id);
    }
}
