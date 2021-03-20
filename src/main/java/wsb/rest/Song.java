package wsb.rest;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.hateoas.EntityModel;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

//dodaje gettery, settery i konsturktor bezargumentowy automatycznie
@Getter
@Setter
@NoArgsConstructor

public class Song {
    Long id;
    String title;
    String author;

    public Song(Long id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public Song(String title, String author) {
        this.title = title;
        this.author = author;
    }

}
