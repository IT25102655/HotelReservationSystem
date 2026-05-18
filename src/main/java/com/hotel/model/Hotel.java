package com.hotel.model;

public class Hotel {

    //private variables(Encapsulation)
    private int    id;
    private String hotelName;
    private String location;
    private String contactNumber;
    private String email;
    private String description;
    private String facilities;
    private String image;
    private int    starRating;

    //getter method for id
    public int    getId()            {
        return id;
    }

    //settor method for id
    public void   setId(int id)      { 
        this.id = id;
    }

    //getter method for hotel name
    public String getHotelName()                   {
        return hotelName;
    }

    //setter method for hotel name
    public void   setHotelName(String hotelName)   {
        this.hotelName = hotelName; 
    }

    //getter for location
    public String getLocation()                    {
        return location; 
    }

    //setter for location
    public void   setLocation(String location)     {
        this.location = location;
    }

    //getter for contact number
    public String getContactNumber()                       { 
        return contactNumber;
    }

    //setter for contact number
    public void   setContactNumber(String contactNumber)   { 
        this.contactNumber = contactNumber;
    }

    //getter for email
    public String getEmail()                 {
        return email;
    }

    //setter for email
    public void   setEmail(String email)     {
        this.email = email;
    }

    //getter for description
    public String getDescription()                   {
        return description;
    }

    //setter for description
    public void   setDescription(String description) {
        this.description = description;
    }

    //getter for facilities
    public String getFacilities()                    {
        return facilities;
    }

    //setter for facilities
    public void   setFacilities(String facilities)   {
        this.facilities = facilities;
    }

    //getter for image
    public String getImage()             {
        return image;
    }

    //setter for image
    public void   setImage(String image) {
        this.image = image;
    }

    //getter for star rating
    public int  getStarRating()                  {
        return starRating;
    }

    //setter for star rating
    public void setStarRating(int starRating)    {
        this.starRating = starRating;
    }

    /** Convenience: returns repeated "★" string for JSP display. */
    public String getStarString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Math.min(starRating, 5); i++) sb.append("★");
        return sb.toString();
    }
}
