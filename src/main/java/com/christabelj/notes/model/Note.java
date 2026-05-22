package com.christabelj.notes.model;

import lombok.Data;

// import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class Note {
    private UUID id;
    private String title;
    private String content;
    // future: private LocalDateTime createdAt;
}
