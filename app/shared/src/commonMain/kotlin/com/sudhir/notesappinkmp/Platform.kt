package com.sudhir.notesappinkmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform