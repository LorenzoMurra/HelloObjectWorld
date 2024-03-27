package org.generation.italy.HelloObjectWorld.model;

import java.time.LocalDate;
import java.time.Period;

public class Student {
    public String firstname = "Gino";
    public String lastname;
    public LocalDate birthDate;
    public boolean female;
    public Book[] textbooks = new Book[5];  
    public int numBooks;

    public Student(){

    }
    public Student(String firstname, String ln, LocalDate bD, boolean f){
        this.firstname = firstname;
        lastname = ln;
        birthDate = bD;
        female = f;
    }
    public int getAge(){
        // return Period.between(birthDate, LocalDate.now()), getYears();
        LocalDate today = LocalDate.now();
        Period agePeriod = Period.between(birthDate, today);
        int age = agePeriod.getYears();
        return age;
    }
    public void greet() {

        System.out.printf("Ciao, io sono %s %s e sono %s%n", firstname, this.lastname, this.female?"una programmatrice Java" : "uno shampista");

    }
    public String[] getFavouriteLanguages(){
        String[] languages;
        int age = getAge();
        if(age > 40) {
            languages = new String[]{"Java", "C++"};
        } else {
            languages = new String[]{"Java script", "Type script"};
        }
        return languages;
    }
    public boolean addBook(Book book) {
        for(int i=0; i<textbooks.length; i++) {
            if(textbooks[i]==null) {
                textbooks[i]=book;
                numBooks++;
                return true;
            }
        }
        return false;
    }
    public void printLibraries() {
        if(numBooks==0) {
            System.out.println("Bestia, che ignorante che sono!");
        } else {
            for(int i=0; i<textbooks.length; i++) {
                if(textbooks[i]!=null) {
                    System.out.println(textbooks[i].title);                    
                }
            }
        }
    }
}