package com.example.lab6_ph43678.model



data class Movie(
    val title: String,
    val year: String,
    val posterUrl: String,
    val duration: Int,
    val releaseDate: String,
    val genre: String,
    val shotDescription: String

) {


    companion object {
        fun getSampleMovies(): MutableList<Movie> {
            val listMovie = mutableListOf<Movie>()
            listMovie.add(Movie("Doraemon","2015","https://i.pinimg.com/474x/7a/7b/b9/7a7bb99065a5caca6056eba25842548c.jpg",145,"25-06-2024","Anime","uhfahuofhauoehfuoaehefuahodfuehafaef"))
            listMovie.add(Movie("Doraemon","2015","https://i.pinimg.com/474x/7a/7b/b9/7a7bb99065a5caca6056eba25842548c.jpg",240,"25-06-2024","Anime","uhfahuofhauoehfuoaehefuahodfuehafaef"))
            listMovie.add(Movie("Doraemon","2015","https://i.pinimg.com/474x/7a/7b/b9/7a7bb99065a5caca6056eba25842548c.jpg",180,"25-06-2024","Anime","uhfahuofhauoehfuoaehefuahodfuehafaef"))
            listMovie.add(Movie("Doraemon","2015","https://i.pinimg.com/474x/7a/7b/b9/7a7bb99065a5caca6056eba25842548c.jpg",235,"25-06-2024","Anime","uhfahuofhauoehfuoaehefuahodfuehafaef"))
            listMovie.add(Movie("Doraemon","2015","https://i.pinimg.com/474x/7a/7b/b9/7a7bb99065a5caca6056eba25842548c.jpg",198,"25-06-2024","Anime","uhfahuofhauoehfuoaehefuahodfuehafaef"))
            return listMovie
        }
    }
}