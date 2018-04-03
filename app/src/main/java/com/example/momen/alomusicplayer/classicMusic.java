package com.example.momen.alomusicplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
//classi music main activity
public class classicMusic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classic_music);

        ArrayList<ClassicMusicList> classicMusicLists = new ArrayList<ClassicMusicList>();
        classicMusicLists.add(new ClassicMusicList(
                "Symphony No. 5: I", "Beethoven", R.drawable.ic_album));
        classicMusicLists.add(new ClassicMusicList(
                "1812 Overture", "Tchaikovsky", R.drawable.ic_album));
        classicMusicLists.add(new ClassicMusicList(
                "Canon In D", "Pachelbel", R.drawable.ic_album));
        classicMusicLists.add(new ClassicMusicList(
                "Blue Danube", "Strauss", R.drawable.ic_album));
        classicMusicLists.add(new ClassicMusicList(
                "William Tell Overture", "Rossini", R.drawable.ic_album));
        classicMusicLists.add(new ClassicMusicList(
                "Rhapsody In Blue", "Gershwin", R.drawable.ic_album));
        classicMusicLists.add(new ClassicMusicList(
                "Moonlight Sonata", "Beethoven", R.drawable.ic_album));
        classicMusicLists.add(new ClassicMusicList(
                "Over The Waves", "Rosas", R.drawable.ic_album));
    }
        ClassicListAdapter varClassicAdpater = new ClassicListAdapter(this,classicMusicLists);
}
