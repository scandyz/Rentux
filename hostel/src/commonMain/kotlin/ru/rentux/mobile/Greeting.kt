package ru.rentux.mobile

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Hello from Rentux, ${platform.name}! First launch!!!"
    }
}