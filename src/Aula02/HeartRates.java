package Aula02;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class HeartRates {

    private String name;
    private String lastname;
    private Integer month;
    private Integer day;
    private Integer year;

    public HeartRates(String name, String lastname, Integer year, Integer month, Integer day) {
        this.name = name;
        this.lastname = lastname;
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setLastname(String lastname){
        this.lastname = lastname;
    }

    public void setYear(Integer year){
        this.year = year;
    }

    public void setMonth(Integer month){
        this.month = month;
    }

    public void setDay(Integer day){
        this.day = day;
    }

    public String getName(){
        return this.name;
    }

    public String getLastname(){
        return this.lastname;
    }

    public Integer getYear(){
        return this.year;
    }

    public Integer getMonth(){
        return this.month;
    }

    public Integer getDay(){
        return this.day;
    }

    protected Integer getAge(){
        Calendar date = new GregorianCalendar();
        date.setTime(new Date());

        return date.get(Calendar.YEAR) - this.year;
    }

    protected Integer getMaxFrequency(){
        return 220 - this.getAge();
    }

    protected double[] getTargetFrequency(){
        Integer maxFreq = this.getMaxFrequency();
        double[] interval = new double[2];
        interval[0] = maxFreq * 0.5;
        interval[1] = maxFreq * 0.85;
        return interval;
    }

}
