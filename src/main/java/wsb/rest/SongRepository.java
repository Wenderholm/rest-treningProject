package wsb.rest;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Repository
public class SongRepository {
    Long count = 2L;

    List<Song> songs = new LinkedList<>(Arrays.asList(
            new Song(1L , "yellow", "newSongOne"),
            new Song(2L , "Numb", "linkin Park")
    ));


    List<Song> findAll(){
        return songs;
    }
    Song find(Long id){
        return songs
                .stream()
                .filter(s -> s.getId().equals(id) )
                .findFirst()
                .orElse(null);
    }

    Song create(Song song) {
        song.setId(++count);
        songs.add(song);
        return song;
    }

    Song update(Long id, Song song) {
        Song songToUpdate = find(id);

        if (songToUpdate == null){
            return null;
        }
        songToUpdate.setTitle(song.getTitle());
        songToUpdate.setAuthor(song.getAuthor());
        return songToUpdate;
    }
}
