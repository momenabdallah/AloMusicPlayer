package com.example.momen.alomusicplayer;
//the adapter
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class ClassicListAdapter extends ArrayAdapter<ClassicMusicList> {

    private static final String LOG_TAG = ClassicListAdapter.class.getSimpleName();

    public ClassicListAdapter(Activity context, ArrayList<ClassicMusicList> classicMusicLists) {

        super(context, 0, classicMusicLists);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.classic_list_items, parent, false);
        }
        ClassicMusicList currentClassiMusic = getItem(position);

        TextView nameTextView = listItemView.findViewById(R.id.song_name);
        nameTextView.setText(currentClassiMusic.getSongName());

        TextView artistTextView = listItemView.findViewById(R.id.artist_name);
        artistTextView.setText(currentClassiMusic.getArtistName());

        ImageView iconView = listItemView.findViewById(R.id.list_item_music_icon);
        iconView.setImageResource(currentClassiMusic.getMusicIcon());

        return listItemView;
    }



}
