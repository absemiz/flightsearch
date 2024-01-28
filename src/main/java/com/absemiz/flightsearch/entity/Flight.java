package com.absemiz.flightsearch.entity;

import jakarta.persistence.*;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;


@Entity
@Table(name="flight")
public class Flight {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int m_id;

    @Column(name="departure_city")
    private String m_departureAirport;

    @Column(name="arrival_city")
    private String m_arrivalAirport;

    @Column(name="departure_date")
    private Calendar m_departureDate;

    @Column(name="return_date")
    private Calendar m_returnDate;

    @Column(name="price")
    private double m_price;

    public Flight()
    {

    }

    public Flight(String departureAirport, String arrivalAirport, Calendar departureDate, Calendar returnDate, double price)
    {
        this.m_departureAirport = departureAirport;
        this.m_arrivalAirport = arrivalAirport;
        this.m_departureDate = departureDate;
        this.m_returnDate = returnDate;
        this.m_price = price;
    }

    public int getID()
    {
        return m_id;
    }

    public String getDepartureAirport()
    {
        return m_departureAirport;
    }

    public String getArrivalAirport()
    {
        return m_arrivalAirport;
    }

    public Calendar getDepartureDate()
    {
        return m_departureDate;
    }

    public Calendar getReturnDate()
    {
        return m_returnDate;
    }

    public double getPrice()
    {
        return m_price;
    }

    public void setDepartureDate(Calendar departureDate)
    {
        this.m_departureDate = departureDate;
    }

    public void setReturnDate(Calendar returnDate)
    {
        this.m_returnDate = returnDate;
    }

    public void setPrice(double price)
    {
        this.m_price = price;
    }

    public static Flight createRandomFlight()
    {
        Random random = new Random();

        Calendar departureDate = new GregorianCalendar();
        departureDate.add(Calendar.DAY_OF_MONTH, random.nextInt(30));
        Calendar returnDate = (Calendar) departureDate.clone();
        returnDate.add(Calendar.DAY_OF_MONTH, random.nextInt(7) + 1);

        double price = 100 + random.nextDouble() * 900;

        return new Flight(Airport.createRandomAirport().getCity(), Airport.createRandomAirport().getCity(), departureDate, returnDate, price);
    }

    @Override
    public String toString()
    {
        return "Flight ID: " + m_id + ", Departure Airport: " + m_departureAirport +
                ", Arrival Airport: " + m_arrivalAirport + ", Departure Date: " +
                m_departureDate.getTime() + ", Return Date: " + m_returnDate.getTime() +
                ", Price: " + m_price;
    }
}
