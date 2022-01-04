package com.emreozcan.composeto_do.data

import androidx.room.Database
import com.emreozcan.composeto_do.data.models.ToDoTask

@Database(entities = [ToDoTask::class],version = 1,exportSchema = false)
abstract class ToDoDatabase {

    abstract fun toDoDao(): ToDoDao

}