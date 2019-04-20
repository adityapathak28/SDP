package com.revauniversity.revasdpapp;
import com.google.firebase.database.IgnoreExtraProperties;

public class Students {

    public String Name;
    public String Email;
    public String Contact;
    public String SRN;
    public String Department;
    public String Year;
    public String Program;

    public Students(){

    }

    public Students(String Name,String Email,String Contact,String SRN,String Department,String Year,String Program)
    {
        this.Name=Name;
        this.Email=Email;
        this.Contact=Contact;
        this.SRN=SRN;
        this.Department=Department;
        this.Year=Year;
        this.Program=Program;
    }

}
