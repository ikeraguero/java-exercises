// Create a program that implements a playlist of songs.


// To start you off, implement the following classes:

// 1.  Album

//     -  It has three fields, two Strings called name and artist, and an ArrayList that holds objects of type Song called songs.

//     -  A constructor that accepts two Strings (name of the album and artist). It initialises the fields and instantiates songs.

//     -  And three methods, they are:

//         -  addSong(), has two parameters of type String (title of song), double (duration of song) and returns a boolean. Returns true if the song was added successfully or false otherwise.

//         -  findSong(), has one parameter of type String (title of song) and returns a Song. Returns the Song if it exists, null if it doesn't exists.

//         -  addToPlayList(), has two parameters of type int (track number of song in album) and LinkedList (the playlist) that holds objects of type Song, and returns a boolean. Returns true if it exists and it was added successfully using the track number, or false otherwise.

//         -  addToPlayList(), has two parameters of type String (title of song) and LinkedList (the playlist) that holds objects of type Song, and returns a boolean. Returns true if it exists and it was added successfully using the name of the song, or false otherwise.


// 2.  Song

//     -   It has two fields, a String called title and a double called duration.

//     -  A constructor that accepts a String (title of the song) and a double (duration of the song). It initialises title and duration.

//     -  And two methods, they are:

//         -  getTitle(), getter for title.

//         -  toString(), Songs overriding toString method. Returns a String in the following format: "title: duration"


import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
   private String name;
   private String artist;
   private ArrayList<Song> songs;
   
   public Album(String name, String artist) {
       this.name = name;
       this.artist = artist;
       this.songs = new ArrayList<>();
   }
   
   public boolean addSong(String title, double duration) {
        Song song = new Song(title, duration);
        if(findSong(title) == null) {
            songs.add(new Song(title, duration));
            return true;
        }
        return false;
   } 
   
   private Song findSong(String title) {
       for(Song song : songs) {
           if(song.getTitle().equals(title)) {
               return song;
           }
       }
       return null;
   }
   
   public boolean addToPlayList(int track, LinkedList<Song> playlist) {
       int index = track-1;
       if((index >= 0) && (index <= songs.size())) {
           playlist.add(songs.get(index));
            return true;
       }
       return false;
        
   }
   
   public boolean addToPlayList(String title, LinkedList<Song> playlist) {
       if(findSong(title) != null) {
           playlist.add(findSong(title));
           return true;
       }
       return false;
   }
   
   
   
}