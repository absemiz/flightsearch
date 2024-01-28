package com.absemiz.flightsearch.entity;

import java.util.Random;

public class Airport
{
    private static int idCounter = 0;
    private final int m_id;
    private final String m_city;

    public Airport(String city)
    {
        m_id   = idCounter++;
        m_city = city;
    }

    public int getID() { return m_id; }
    public String getCity() { return m_city; }

    public static Airport createRandomAirport()
    {
        String[] cities = {"New York", "London", "Paris", "Tokyo", "Sydney", "Dubai", "Ankara"};

        Random random = new Random();
        String randomCity = cities[random.nextInt(cities.length)];

        return new Airport(randomCity);
    }
}
