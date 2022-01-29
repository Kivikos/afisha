package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Film;

import static org.junit.jupiter.api.Assertions.*;

class FilmManagerTest {
    Film first = new Film(1,"First film", "Action", "ImageUrl", true);
    Film second = new Film(2,"Second film", "Comedy", "ImageUrl", false);
    Film third = new Film(3,"Third film", "Drama", "ImageUrl", false);
    Film fourth = new Film(4,"Fourth film", "Autobiography", "ImageUrl", false);
    Film fifth = new Film(5,"Fifth film", "Horror", "ImageUrl", false);
    Film sixth = new Film(6,"Sixth film", "Thriller", "ImageUrl", false);
    Film seventh = new Film(7,"Seventh film", "Opera", "ImageUrl", false);
    Film eight = new Film(8,"Eighth film", "Cartoon", "ImageUrl", true);
    Film ninth = new Film(9,"Ninth film", "Fantasy", "ImageUrl", false);
    Film tenth = new Film(10,"Tenth film", "Detective", "ImageUrl", true);
    Film eleven = new Film(11,"Eleven film", "Story", "ImageUrl", true);
    Film twelve = new Film(12,"Twelve film", "Science fiction", "ImageUrl", false);
    Film thirteenth = new Film(13,"Thirteenth film", "Documentary", "ImageUrl", false);
    Film fourteenth = new Film(14,"Fourteenth", "Adventure", "ImageUrl", false);
    Film fifteenth = new Film(15,"Fifteenth", "Mystic", "ImageUrl", false);

    @Test
    public void shouldAdd() {
        FilmManager manager = new FilmManager();
        manager.addFilm(first);

        Film[] expected = new Film[]{first};
        Film[] actual = manager.lastFilm(10);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldChangeDefaultLengthOfArray() {
        FilmManager manager = new FilmManager(20);
        Film[] expected = new Film[]{};
        Film[] actual = manager.lastFilm(20);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowFilmsWhenUnder10() {
        FilmManager manager = new FilmManager();
        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(fourth);
        manager.addFilm(fifth);
        manager.addFilm(sixth);
        manager.addFilm(seventh);
        manager.addFilm(eight);
        manager.addFilm(ninth);
        manager.addFilm(tenth);
        manager.addFilm(eleven);
        manager.addFilm(twelve);
        manager.addFilm(thirteenth);
        manager.addFilm(fourteenth);
        manager.addFilm(fifteenth);

        Film[] actual = manager.lastFilm(5);
        Film[] expected = new Film[]{fifteenth, fourteenth, thirteenth, twelve, eleven};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowFilmsWhenMoreThen10() {
        FilmManager manager = new FilmManager();
        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(fourth);
        manager.addFilm(fifth);
        manager.addFilm(sixth);
        manager.addFilm(seventh);
        manager.addFilm(eight);
        manager.addFilm(ninth);
        manager.addFilm(tenth);
        manager.addFilm(eleven);
        manager.addFilm(twelve);
        manager.addFilm(thirteenth);
        manager.addFilm(fourteenth);
        manager.addFilm(fifteenth);

        Film[] actual = manager.lastFilm(11);
        Film[] expected = new Film[]{fifteenth, fourteenth, thirteenth, twelve, eleven, tenth, ninth, eight, seventh, sixth, fifth};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowFilmsWhenEmpty() {
        FilmManager manager = new FilmManager();
        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(fourth);
        manager.addFilm(fifth);
        manager.addFilm(sixth);
        manager.addFilm(seventh);
        manager.addFilm(eight);
        manager.addFilm(ninth);
        manager.addFilm(tenth);
        manager.addFilm(eleven);
        manager.addFilm(twelve);
        manager.addFilm(thirteenth);
        manager.addFilm(fourteenth);
        manager.addFilm(fifteenth);

        Film[] actual = manager.lastFilm(0);
        Film[] expected = new Film[]{};

        assertArrayEquals(expected, actual);
    }
}