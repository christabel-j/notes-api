package com.christabelj.notes.controller;

import com.christabelj.notes.model.Note;
import com.christabelj.notes.service.NoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/api/v1/notes")
public class NoteController {
    private final NoteService noteService;

    @PostMapping
    public ResponseEntity<Note> createNote(@RequestBody Note note) {
        noteService.createNote(note);

        return ResponseEntity.status(HttpStatus.CREATED).body(note);
    }

    @GetMapping
    public ResponseEntity<List<Note>> getNotes(){
        List<Note> notes = noteService.getAllNotes();

        return ResponseEntity.ok(notes);
    }

    @GetMapping(path = "/{noteId}")
    ResponseEntity<Note> getNoteById(@PathVariable UUID noteId){
        Note note = noteService.getNoteById(noteId);

        return ResponseEntity.ok(note);
    }

    @DeleteMapping(path = "/{noteId}")
    public ResponseEntity<Void> deleteNote(
            @PathVariable UUID noteId
    ) {
        noteService.deleteNote(noteId);

        // Return an HTTP 204 NO CONTENT.
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping(path = "/{noteId}")
    public ResponseEntity<Note> updateNote(@PathVariable UUID noteId,
                                           @RequestBody Note note){
        note.setId(noteId);
        noteService.updateNote(note);
        return ResponseEntity.ok(note);
    }
}
