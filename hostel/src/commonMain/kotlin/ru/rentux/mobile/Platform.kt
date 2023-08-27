package ru.rentux.mobile

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform