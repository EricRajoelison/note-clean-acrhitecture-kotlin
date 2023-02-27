package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.use_case

/**
 * Created by Eric Rajoelison on 24/02/2023.
 */
data class NoteUseCases (
    val getNotes: GetNotes,
    val deleteNote: DeleteNote,
    val addNote: AddNote,
    val getNote: GetNote
    ){
}