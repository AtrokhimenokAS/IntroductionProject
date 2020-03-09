package ru.itsjava.enums;

public enum Genre {
    //HW: 1. Enums Передать в Жанры фильмов оценку от 1 до 5 через конструктор.
    COMEDY("Комедия",5),
    DRAMA ("Драма",3),
    MELODRAMA ("Мелодрама",2),
    TRAGICOMEDY ("Трагикомедия",2),
    ACTION_MOVIE ("Боевик",4),
    THRILLER ("Триллер",4),
    HORRORS ("Ужасы",1),
    FANTASY ("Фэнтези",4),
    FANTASTIC ("Фантастика",5);

    private String name;
    private int rating;

    Genre(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    //выводить сообщение в зависимости от жанра с помощью метода.
    public String getRatingPrint(){
        if (rating <= 3) {
            return "Ни за что на свете";
        } else if (rating >=4) {
            return "Можно посмотреть";
        } else {
            return "Хороший жанр";
        }
    }
}
