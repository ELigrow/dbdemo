package edu.eligrow.dbdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GenreController {

    @Autowired
    private GenreService genreService;

    @RequestMapping("/genres")
    public List<Genre> getGenres() { return genreService.getAllGenres(); }

    @RequestMapping(method = RequestMethod.POST, value="/genre")
    public void addGenre(@RequestBody Genre genre){
        genreService.addGenre(genre);
    }
}
