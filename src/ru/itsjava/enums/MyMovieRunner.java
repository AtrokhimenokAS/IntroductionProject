package ru.itsjava.enums;

import java.util.ArrayList;
import java.util.List;

public class MyMovieRunner {
    public static void main(String[] args) {
        //Создать список из 10 фильмов.
        ArrayList <Film> myFilms = new ArrayList();
        myFilms.add(new Film("О чем говорят мужчины",Genre.COMEDY));
        myFilms.add(new Film("Фантастические твари",Genre.FANTASY));
        myFilms.add(new Film("Рэй",Genre.DRAMA));
        myFilms.add(new Film("Спеши любить",Genre.MELODRAMA));
        myFilms.add(new Film("Крепкий орешек",Genre.ACTION_MOVIE));
        myFilms.add(new Film("Матрица",Genre.FANTASTIC));
        myFilms.add(new Film("Техаская резня бензопилой",Genre.HORRORS));
        myFilms.add(new Film("Схватка",Genre.THRILLER));
        myFilms.add(new Film("Шоу Трумена",Genre.TRAGICOMEDY));
        myFilms.add(new Film("Трудный ребенок",Genre.COMEDY));

        //вывести только те фильмы, оценка жанров которых больше 3
        for (Film films : myFilms) {
            if (films.getGenre().getRating() > 3) {
                System.out.println(films);
            }
        }
    }
}
