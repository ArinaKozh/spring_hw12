package ru.gb.hw12.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.gb.hw12.models.Note;

/**
 * Репозиторий для работы с сущностью заметки.
 */
@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
}
