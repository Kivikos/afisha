package ru.netology.manager;

import ru.netology.domain.Film;

public class FilmManager {
    Film[] films = new Film[0];
    int filmsQuantity;

    public FilmManager() {
        this.filmsQuantity = 10;
    }

    public FilmManager(int filmsQuantity) {
        this.filmsQuantity = filmsQuantity;
    }

    public void addFilm(Film film)
    {
        int length = films.length + 1;
        Film[] tmp = new Film[length];
        System.arraycopy(films, 0, tmp, 0, films.length);
        int newFilm = tmp.length - 1;
        tmp[newFilm] = film;
        this.films = tmp;
    }

    public Film[] lastFilm(int filmsQuantity) {
        if (films.length > filmsQuantity) {
            Film[] result = new Film[filmsQuantity];
            for (int i = 0; i < result.length; i++) {
                int index = films.length - i - 1;
                result[i] = this.films[index];
            }
            return result;
        } else {
            Film[] result = new Film[films.length];
            for (int i = 0; i < result.length; i++) {
                int index = films.length - i - 1;
                result[i] = this.films[index];
            }
            return result;
        }
    }
}
