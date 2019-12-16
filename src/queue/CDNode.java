/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author b-hou
 */
public class CDNode {
    private String artist;
    private int tracks;
    private CDNode prev;

    public CDNode(String artist, int tracks, CDNode prev) {
        this.artist = artist;
        this.tracks = tracks;
        this.prev = prev;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getTracks() {
        return tracks;
    }

    public void setTracks(int tracks) {
        this.tracks = tracks;
    }

    public CDNode getPrev() {
        return prev;
    }

    public void setPrev(CDNode prev) {
        this.prev = prev;
    }
    
    
}
