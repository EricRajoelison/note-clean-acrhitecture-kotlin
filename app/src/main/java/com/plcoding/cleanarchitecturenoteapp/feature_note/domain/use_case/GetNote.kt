package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.use_case

import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.model.Note
import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.repository.NoteRepository

/**
 * Created by Eric Rajoelison on 25/02/2023.
 */
public class GetNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke (id: Int): Note?{
        return repository.getNoteById(id)
    }

}