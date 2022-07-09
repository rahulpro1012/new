package com.example.notes

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData

class NoteRepository(private val noteDao: NoteDao){
    val allNotes: LiveData<List<Notes>> = noteDao.getAllNotes()

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert(note:Notes){
        noteDao.insert(note)
    }

    @WorkerThread
    suspend fun delete(note:Notes){
        noteDao.delete(note)
    }
}