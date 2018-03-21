package com.mufidjamaluddin.listview;

/**
 * Created by mufidjamaluddin on 21/03/2018.
 */

public class TempatWisata
{
    private String title;
    private String description;
   // private String imagefile_name;

    public TempatWisata(){}

    public TempatWisata(String title, String description)
    {
        this.title = title;
        this.description = description;
     //   this.imagefile_name = imagefile_name;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

}
