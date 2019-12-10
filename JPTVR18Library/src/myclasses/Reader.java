/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author ShinSais
 */
public class Reader implements Serializable {
    private String Fname;
    private String Lname;
    private int day;
    private int mounth;
    private int year;
    private String number;
    private String allDateBurn;

    public Reader() {
    }

    public Reader(String Fname, String Lname, int day, int mounth, int year, String number) {
        this.Fname = Fname;
        this.Lname = Lname;
        this.day = day;
        this.mounth = mounth;
        this.year = year;
        this.number = number;
        this.allDateBurn = this.day + "." + this.mounth + "." + this.year;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMounth() {
        return mounth;
    }

    public void setMounth(int mounth) {
        this.mounth = mounth;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAllDateBurn() {
        return allDateBurn;
    }

    public void setAllDateBurn(String allDateBurn) {
        this.allDateBurn = allDateBurn;
    }

    
    
    @Override
    public String toString() {
        return "Reader{" + "Fname=" + Fname + ", Lname=" + Lname + ", day=" + day + ", mounth=" + mounth + ", year=" + year + ", number=" + number + ", allDateBurn=" + allDateBurn + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.Fname);
        hash = 79 * hash + Objects.hashCode(this.Lname);
        hash = 79 * hash + this.day;
        hash = 79 * hash + this.mounth;
        hash = 79 * hash + this.year;
        hash = 79 * hash + Objects.hashCode(this.number);
        hash = 79 * hash + Objects.hashCode(this.allDateBurn);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Reader other = (Reader) obj;
        if (this.day != other.day) {
            return false;
        }
        if (this.mounth != other.mounth) {
            return false;
        }
        if (this.year != other.year) {
            return false;
        }
        if (!Objects.equals(this.Fname, other.Fname)) {
            return false;
        }
        if (!Objects.equals(this.Lname, other.Lname)) {
            return false;
        }
        if (!Objects.equals(this.number, other.number)) {
            return false;
        }
        if (!Objects.equals(this.allDateBurn, other.allDateBurn)) {
            return false;
        }
        return true;
    }
    
    
    
}
