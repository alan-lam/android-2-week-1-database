package com.ucsdextandroid2.todoroom

import androidx.lifecycle.LiveData
import androidx.room.*

/**
 * Created by rjaylward on 2019-07-05
 */

@Dao
interface NotesDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertNote(note: Note)

    @Delete
    fun deleteNote(note: Note)

    @Query("SELECT * FROM notes")
    fun getAllNotes(): List<Note>

    @Query("SELECT * FROM notes ORDER BY datetime DESC")
    fun getAllNotesLiveData(): LiveData<List<Note>>

}
