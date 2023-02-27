package com.plcoding.cleanarchitecturenoteapp.feature_note.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.model.Note

/**
 * Created by Eric Rajoelison on 24/02/2023.
 */

@Database(
    entities = [Note::class],
    version = 1
)
abstract class NoteDatabase : RoomDatabase() {

    abstract val noteDao : NoteDao

    companion object {
        const val DATABASE_NAME = "notes_db"
    }
}