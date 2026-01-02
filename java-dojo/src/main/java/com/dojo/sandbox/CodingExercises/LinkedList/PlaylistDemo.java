package com.armando.sandbox.CodingExercises.LinkedList;

import java.util.LinkedList;

public class PlaylistDemo {
    static LinkedList<String> playlist = new LinkedList<>();
    public static void main(String[] args) {
        System.out.println("Adding songs to the playlist...");
        addSong("Song A");
        addSong("Song B");
        addSong("Song C");
        addSong("Song D");
        System.out.println("Current playlist: " + playlist);

        System.out.println("\nRemoving a song by name (Song B)...");
        removeSongByName("Song B");
        System.out.println("Current playlist: " + playlist);

        System.out.println("\nMarking 'Song C' as the favorite and moving it to the top...");
        markFavoriteSongMovedToTop("Song C");
        System.out.println("Current playlist: " + playlist);

        System.out.println("\nMarking 'Song A' as the least favorite and moving it to the bottom...");
        leastFavoriteSongMovedToBottom("Song A");
        System.out.println("Current playlist: " + playlist);

        System.out.println("\nRearranging 'Song D' to position 1...");
        swapSong("Song D", 1);
        System.out.println("Current playlist: " + playlist);
    }

    public static void addSong(String song) {
        playlist.add(song);
    }

    public static boolean isInPlaylist(String song) {
        return playlist.contains(song);
    }

    public static void removeSongByName(String song) {
        if(isInPlaylist(song)) playlist.remove(song);
        else System.out.println("Song did not exist, no removal happened");
    }

    public static int getSongIndexByName(String song) {
        return playlist.indexOf(song);
    }

    public static void swapSong(String currentSong, int position) {
        if(position >= 0 && position < playlist.size() && playlist.contains(currentSong)) {
            int oldSongsNewPosition = getSongIndexByName(currentSong);
            String oldSongName = playlist.set(position, currentSong);
    
            playlist.set(oldSongsNewPosition, oldSongName);
        } else {
            System.out.println("Invalid operation. Song or position not valid");
        }
    }

    public static void markFavoriteSongMovedToTop(String favoriteSong) {
        swapSong(favoriteSong, 0);
    }

    public static void leastFavoriteSongMovedToBottom(String leastFavoriteSong) {
        swapSong(leastFavoriteSong, playlist.size() - 1);
    }

}

/*
 * Exercise (Optional)
Create a text-based Java program that simulates a music playlist application where the user can do the following:
  [] add a song to the list
  [] remove a song from the list
  [] re-arrange the songs on the list
  [] mark a song as their favorite and move it to the top of the list
  [] mark a song as their least favorite and move it to the bottom of the list
 */