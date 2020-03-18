package Aula02;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class HealthProfile extends HeartRates {
    private String gender;
    private double height;
    private double weight;


    public HealthProfile(String name, String lastname, Integer year, Integer month, Integer day, String gender, double height, double weight) {
        super(name, lastname, year, month, day);

        this.gender = gender;
        this.height = height;
        this.weight = weight;
    }

    protected double getIMC(){
        return weight / (height * height);
    }
}
