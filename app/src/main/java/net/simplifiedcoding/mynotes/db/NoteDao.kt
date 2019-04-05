package net.simplifiedcoding.mynotes.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface NoteDao {

    @Insert
    fun addNote(note: Note)

    @Query("SELECT * FROM note")
    fun getAllNotes() : List<Note>

    @Insert
    fun addMultipleNotes(vararg note: Note)
}