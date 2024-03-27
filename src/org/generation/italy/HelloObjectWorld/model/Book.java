package org.generation.italy.HelloObjectWorld.model;

public class Book {
    public String title;
    public String genre;
    public double cost;
    public int pages;
    // se il libro ha un numero di pagine superiore a 200 e il genere è diverso dalla stringa "comico",
    // questo metodo dovrà ritornare la stringa palloso, altrimenti dovrà tornare la stringa "divertente", 
    //questo metodo si chiamerà get.bookType
    public Book(String title, String genre, double cost, int pages) {
        this.title = title;
        this.genre = genre;
        this.cost = cost;
        this.pages = pages;
    }
    public String getBookType() {
        if(pages>200 && !"comico".equals(genre)){
            return "palloso";
        }
        return "divertente";
    }
    // fare metodo per lunghezza titolo, quanti caratteri ha

    public int titleLength() {
        return title.length();
    }
}
