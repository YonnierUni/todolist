package com.ProyectToDoList.backend.DTO;

import java.util.List;

public class CategoryDTO {
    Long id;
    String name;
    String description;
    List<NoteDTO> noteDTO;

    public CategoryDTO() {
    }

    public CategoryDTO(Long id, String name, String description, List<NoteDTO> noteDTO) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.noteDTO = noteDTO;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<NoteDTO> getNoteDTO() {
        return noteDTO;
    }

    public void setNoteDTO(List<NoteDTO> noteDTO) {
        this.noteDTO = noteDTO;
    }
}
