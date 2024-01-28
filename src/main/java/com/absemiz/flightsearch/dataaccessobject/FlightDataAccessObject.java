package com.absemiz.flightsearch.dataaccessobject;

import com.absemiz.flightsearch.entity.Flight;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FlightDataAccessObject implements IFlightDataAccessObject
{
    private EntityManager m_entityManager;

    @Autowired
    FlightDataAccessObject(EntityManager entityManager)
    {
        m_entityManager = entityManager;
    }
    @Override
    public List<Flight> findAll()
    {
        TypedQuery<Flight> query = m_entityManager.createQuery("from Flight", Flight.class);
        return query.getResultList();
    }

    @Override
    public Flight findByID(int id)
    {
        return m_entityManager.find(Flight.class, id);
    }

    @Override
    public Flight save(Flight flight)
    {
        return m_entityManager.merge(flight);
    }

    @Override
    public void deleteByID(int id)
    {
        m_entityManager.remove(
                findByID(id)
        );
    }
}
