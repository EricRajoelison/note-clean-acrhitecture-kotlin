package com.plcoding.cleanarchitecturenoteapp.feature_note.presentation.util

/**
 * Created by Eric Rajoelison on 27/02/2023.
 */
sealed class Screen(val route: String){
    object NoteScreen : Screen ("notes_screen")
    object AddEditNoteScreen : Screen ("add_edit_note_screen")
}
