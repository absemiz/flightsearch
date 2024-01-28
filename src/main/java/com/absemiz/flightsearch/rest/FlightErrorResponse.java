package com.absemiz.flightsearch.rest;

public class FlightErrorResponse
{
    private int m_status;
    private String m_message;

    private long m_timeStamp;

    public FlightErrorResponse()
    {

    }

    public FlightErrorResponse(int status, String message, long timeStamp)
    {
        m_status = status;
        m_message = message;
        m_timeStamp = timeStamp;
    }

    public int getStatus()
    {
        return m_status;
    }

    public void setStatus(int status)
    {
       m_status = status;
    }

    public String getMessage()
    {
        return m_message;
    }

    public void setMessage(String message)
    {
        m_message = message;
    }

    public long getTimeStamp()
    {
        return m_timeStamp;
    }

    public void setTimeStamp(long timeStamp)
    {
        m_timeStamp = timeStamp;
    }
}
