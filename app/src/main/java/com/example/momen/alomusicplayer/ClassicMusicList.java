package com.example.momen.alomusicplayer;
// classic music custom class
public class ClassicMusicList {

    private String mSongName;

    private String mArtistName;

    private int mMusicIcon;

    /*
     * Create a new AndroidFlavor object.
     *
     * @param vName is the name of the Android version (e.g. Gingerbread)
     * @param vNumber is the corresponding Android version number (e.g. 2.3-2.7)
     * @param image is drawable reference ID that corresponds to the Android version
     * */
    public ClassicMusicList(String vSong, String vArtist, int musicIcon)
    {
        this.mSongName = vSong;
        this.mArtistName = vArtist;
        this.mMusicIcon = musicIcon;
    }

    /**
     * Get the name of the Android version
     */
    public String getSongName() {
        return mSongName;
    }

    public String getArtistName() {
        return mArtistName;
    }

    public int getMusicIcon() {
        return mMusicIcon;
    }
}
