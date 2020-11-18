package com.example.custommovieadapter.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.custommovieadapter.R;
import com.example.custommovieadapter.models.Movie;
import com.google.android.material.textview.MaterialTextView;

import java.util.ArrayList;

public class MovieCustomAdapter extends BaseAdapter {

    ArrayList<Movie> movies;

    public MovieCustomAdapter(ArrayList<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public int getCount() {
        return movies.size();
    }

    @Override
    public Movie getItem(int position) {
        return movies.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        MovieViewHolder movieViewHolder;

        if (convertView == null){
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_row_layout, null);
            movieViewHolder = new MovieViewHolder(convertView);
            convertView.setTag(movieViewHolder);
        } else {
            movieViewHolder = (MovieViewHolder) convertView.getTag();
        }

        Movie movie = getItem(position);
        movieViewHolder.tvMovieTitle.setText(movie.getMovieTitle());
        movieViewHolder.tvMovieRating.setText(movie.getMovieRating());
        movieViewHolder.tvMovieDescription.setText(movie.getMovieDescription());
        movieViewHolder.ivMovieImage.setImageResource(movie.getMovieImage());

        return convertView;
    }



    class MovieViewHolder {

        private MaterialTextView tvMovieTitle;
        private MaterialTextView tvMovieRating;
        private MaterialTextView tvMovieDescription;
        private ImageView ivMovieImage;

        public MovieViewHolder(View view) {
            tvMovieTitle = view.findViewById(R.id.tv_movie_title);
            tvMovieRating = view.findViewById(R.id.tv_movie_rating);
            tvMovieDescription = view.findViewById(R.id.tv_movie_desc);
            ivMovieImage = view.findViewById(R.id.iv_movie_image);
        }
    }

}
