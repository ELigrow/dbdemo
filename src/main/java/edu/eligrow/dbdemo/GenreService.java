package edu.eligrow.dbdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GenreService {
    @Autowired
    private GenreRepository genreRepository;

    public List<Genre> getAllGenres() {
        List<Genre> genres = new ArrayList<>();
        genreRepository.findAll().forEach(genres::add);
        if (genres.size() == 0) {
            genreRepository.save(new Genre("Action-Adventure", 5));
            genreRepository.save(new Genre("Sci-Fi", 4));
            genreRepository.save(new Genre("Comedy", 3));
            genreRepository.save(new Genre("Indie", 2));
            genreRepository.save(new Genre("Romance", 1));
        }
        return genres;
    }

    public Genre getGenre(String id){
        return (Genre)genreRepository.findById(id).orElse(new Genre("Missing Genre", 0));
    }

    public void addGenre(Genre genre){
        genreRepository.save(genre);
    }

    public void updateGenre(Genre genre, String id){
        genreRepository.save(genre);
    }

    public void deleteGenre(String id){
        genreRepository.delete(getGenre(id));
    }
}
