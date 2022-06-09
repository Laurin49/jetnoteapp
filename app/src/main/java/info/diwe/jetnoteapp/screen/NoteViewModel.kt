package info.diwe.jetnoteapp.screen

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import info.diwe.jetnoteapp.data.NotesDataSource
import info.diwe.jetnoteapp.model.Note

class NoteViewModel: ViewModel() {

    private var noteList = mutableStateListOf<Note>()

    init {
        noteList.addAll(NotesDataSource().loadNotes())
    }

    fun addNote(note: Note) { noteList.add(note) }
    fun removeNote(note: Note) { noteList.remove(note) }
    fun getAllNotes(): List<Note> { return noteList }

}