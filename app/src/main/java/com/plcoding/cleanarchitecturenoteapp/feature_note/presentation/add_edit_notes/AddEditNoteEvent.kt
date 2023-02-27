package com.plcoding.cleanarchitecturenoteapp.feature_note.presentation.add_edit_notes

import androidx.compose.ui.focus.FocusState

/**
 * Created by Eric Rajoelison on 27/02/2023.
 */
sealed class AddEditNoteEvent {
    data class EnteredTitle(val value: String): AddEditNoteEvent()
    data class ChangeTitleFocus(val focusState: FocusState): AddEditNoteEvent()
    data class EnteredContent(val value: String) : AddEditNoteEvent()
    data class ChangeContentFocus(val focusState: FocusState) : AddEditNoteEvent()
    data class ChangeColor(val color: Int) : AddEditNoteEvent()
    object SaveNote : AddEditNoteEvent()
}

