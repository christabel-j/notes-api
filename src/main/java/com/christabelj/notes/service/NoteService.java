package com.christabelj.notes.service;

import com.christabelj.notes.model.Note;
import java.util.List;
import java.util.UUID;


public interface NoteService {

    List<Note> getAllNotes();

    Note getNoteById(UUID id);

    Note createNote(Note note);

    Note updateNote(Note note);

    void deleteNote(UUID id);
}
