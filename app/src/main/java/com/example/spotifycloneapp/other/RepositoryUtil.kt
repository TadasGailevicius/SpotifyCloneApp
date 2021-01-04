package com.example.spotifycloneapp.other

import java.lang.Exception

inline fun <T> safeCall(action: () -> Resource<T>) : Resource<T>{
    return try {
        action()
    } catch (e: Exception){
        Resource.error(e.localizedMessage ?: "An unknown error occured", null)
    }
}