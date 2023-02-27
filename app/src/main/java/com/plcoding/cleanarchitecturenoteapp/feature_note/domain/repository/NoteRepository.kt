package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.repository

import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.model.Note
import kotlinx.coroutines.flow.Flow

/**
 * Created by Eric Rajoelison on 24/02/2023.
 */
interface NoteRepository {

    fun getNotes() : Flow<List<Note>>

    suspend fun  getNoteById (id: Int): Note?

    suspend fun  insertNote (note:Note)

    suspend fun deleteNote(note:Note)

}