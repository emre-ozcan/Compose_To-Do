package com.emreozcan.composeto_do.data.repository

import com.emreozcan.composeto_do.data.ToDoDao
import com.emreozcan.composeto_do.data.models.ToDoTask
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ToDoRepository @Inject constructor(private val toDoDao: ToDoDao) {

    val getAllTasks: Flow<List<ToDoTask>> = toDoDao.getAllTasks()
    val sortByLowPriority: Flow<List<ToDoTask>> = toDoDao.sortByLowPriority()
    val sortByHighPriority: Flow<List<ToDoTask>> = toDoDao.sortByHighPriority()

    fun getSelectedTask(taskId : Int) = toDoDao.getSelectedTask(taskId = taskId)
    fun searchDatabase(searchQuery: String) = toDoDao.searchDatabase(searchQuery = searchQuery)

    suspend fun addTask(toDoTask: ToDoTask) = toDoDao.addTask(toDoTask = toDoTask)
    suspend fun updateTask(toDoTask: ToDoTask) = toDoDao.updateTask(toDoTask = toDoTask)

    suspend fun deleteTask(toDoTask: ToDoTask) = toDoDao.deleteTask(toDoTask = toDoTask)
    suspend fun deleteAllTasks() = toDoDao.deleteAllTasks()

}