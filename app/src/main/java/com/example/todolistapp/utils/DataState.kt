package com.example.todolistapp.utils

sealed class DataState<out R> {
    class Success<out T>(val data:T):DataState<T>()
    class Loading:DataState<Nothing>()
    class Error:DataState<Nothing>()

}