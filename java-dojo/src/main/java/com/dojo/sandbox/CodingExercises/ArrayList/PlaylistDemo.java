package com.dojo.sandbox.CodingExercises.ArrayList;

import java.util.ArrayList;

public class PlaylistDemo {
    static ArrayList<String> playlist = new ArrayList<>();
    
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

    public static void removeSongByIndex(int index) {
        if (index >= 0 && index < playlist.size()) {
            playlist.remove(index);
        } else {
            System.out.println("Invalid index. No song removed.");
        }
    }

    public static void removeSongByName(String song) {
        if (playlist.contains(song)) {
            playlist.remove(song);
        } else {
            System.out.println("Song not found. No song removed.");
        }
    }

    public static String getSongByIndex(int index) {
        if (index >= 0 && index < playlist.size()) {
            return playlist.get(index);
        } else {
            return "Invalid index.";
        }
    }

    public static int getSongIndexByName(String song) {
        return playlist.indexOf(song);
    }

    public static void swapSong(String currentSong, int position) {
        if (position >= 0 && position < playlist.size() && playlist.contains(currentSong)) {
            int oldSongsNewPosition = getSongIndexByName(currentSong);
            String oldSongsName = playlist.set(position, currentSong);
            playlist.set(oldSongsNewPosition, oldSongsName);
        } else {
            System.out.println("Invalid operation. Song or position not valid.");
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