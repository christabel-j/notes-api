package com.christabelj.notes.service.impl;

import com.christabelj.notes.exception.NoteNotFoundException;
import com.christabelj.notes.model.Note;
import com.christabelj.notes.repository.NoteRepository;
import com.christabelj.notes.service.NoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class NoteServiceImpl implements NoteService {

    private final NoteRepository noteRepository;

    @Override
    public List<Note> getAllNotes() {
        return noteRepository.findAll();
    }

    @Override
    public Note getNoteById(UUID id) {

        Note note = noteRepository.findById(id);

        if (note == null) {
            throw new NoteNotFoundException("Error: Note not found with id: " + id);
        }

        return note;
    }

    @Override
    public Note createNote(Note note) {
        return noteRepository.save(note);
    }

    @Override
    public Note updateNote(Note note) {
        return noteRepository.save(note);
    }

    @Override
    public void deleteNote(UUID id) {
        noteRepository.deleteById(id);
    }
}
