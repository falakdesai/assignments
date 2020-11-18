package com.example.custommovieadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.custommovieadapter.adapters.MovieCustomAdapter;
import com.example.custommovieadapter.models.Movie;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView movieListView;
    ArrayList<Movie> movieList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        movieListView = findViewById(R.id.movie_list_view);
        movieList = getMovieList();
        MovieCustomAdapter movieCustomAdapter = new MovieCustomAdapter(movieList);
        movieListView.setAdapter(movieCustomAdapter);
    }

    private ArrayList<Movie> getMovieList() {
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("War","182 Ratings","This movie is based on secret agent of india who is working outside of india and sacrifice their life for nation",R.drawable.war));
        movies.add(new Movie("Maari","567 Ratings","This movie is based on tapori of south india who is handling all the rackets and supply in wrong way but with good heart nature",R.drawable.maari));
        movies.add(new Movie("Dil Bechara","316 Ratings","This movie is based on life that how people ruin their life instead of living like a king",R.drawable.dil_bechara));
        movies.add(new Movie("Robot 2.0","155 Ratings","This movie is based on science fiction AI robot movie who saves lives of peoples from bad people",R.drawable.robot2_0));
        movies.add(new Movie("Sanju","498 Ratings","This movie is based on friendship and the biography of Mr. Sanjay Dutt, an Indian movie actor",R.drawable.sanju));
        return movies;
    }
}