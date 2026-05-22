package com.christabelj.notes.repository;

import com.christabelj.notes.model.Note;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
@RequiredArgsConstructor
public class NoteRepository {
    private final Map<UUID, Note> notes = new HashMap<>();

    // check if item exists in a map (not needed atm)
//    private boolean existsById(UUID id){
//        return notes.containsKey(id);
//    }

    // READ METHODS
    // return list of ALL notes
    public List<Note> findAll(){
        return new ArrayList<>(notes.values());
    }

    // return ONE note by id
    public Note findById(UUID id){
        return notes.get(id);
    }

    // CREATE / UPDATE METHODS
    public Note save(Note note){
        // CREATE path if null
        if (note.getId() == null) {
            note.setId(UUID.randomUUID());
        }

        // works for both create + update
        notes.put(note.getId(), note);
        return note;

    }

    // DELETE METHOD
    public void deleteById(UUID id){
        notes.remove(id);
    }
}
