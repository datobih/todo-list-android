package com.example.todolistapp.retrofit.dto

import com.example.todolistapp.model.Task

data class UserDTO(val email:String,val fullname:String,
                   var profilePicture:String,val tasks: List<TaskDTO>?)