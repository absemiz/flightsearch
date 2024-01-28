package com.absemiz.flightsearch.rest;

public class FlightNotFoundException extends RuntimeException
{
    public FlightNotFoundException(String message)
    {
        super(message);
    }

    public FlightNotFoundException(String message, Throwable cause)
    {
        super(message, cause);
    }

    public FlightNotFoundException(Throwable cause)
    {
        super(cause);
    }
}
