package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.use_case

import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.model.Note
import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.repository.NoteRepository

/**
 * Created by Eric Rajoelison on 24/02/2023.
 */
class DeleteNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke (note: Note){
        repository.deleteNote(note)
    }
}