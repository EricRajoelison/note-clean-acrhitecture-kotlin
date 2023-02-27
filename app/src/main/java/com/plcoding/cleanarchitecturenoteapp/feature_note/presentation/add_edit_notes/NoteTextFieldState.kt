package com.plcoding.cleanarchitecturenoteapp.feature_note.presentation.add_edit_notes

/**
 * Created by Eric Rajoelison on 27/02/2023.
 */
data class NoteTextFieldState(
    val text : String = "",
    val hint : String = "",
    val isHintVisible : Boolean = true
)