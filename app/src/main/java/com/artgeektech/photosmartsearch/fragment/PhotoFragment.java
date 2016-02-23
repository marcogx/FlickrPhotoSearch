package com.artgeektech.photosmartsearch.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.artgeektech.photosmartsearch.R;
import com.artgeektech.photosmartsearch.model.GalleryItem;
import com.bumptech.glide.Glide;

/**
 * A simple {@link Fragment} subclass.
 */
public class PhotoFragment extends Fragment {

    public static final String TAG = PhotoFragment.class.getSimpleName();

    private GalleryItem mItem;
    private ImageView mPhoto;

    public PhotoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_photo, container, false);
        mItem = (GalleryItem) getActivity().getIntent().getSerializableExtra("item");
        mPhoto = (ImageView) view.findViewById(R.id.photo);
        Glide.with(this).load(mItem.getUrl()).thumbnail(0.5f).into(mPhoto);
        return view;
    }

}
