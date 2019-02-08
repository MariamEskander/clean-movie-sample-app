package com.ahmedadel.domain.usecase.movie;

import com.ahmedadel.domain.model.MovieEntity;
import com.ahmedadel.domain.repository.MovieRepository;

import io.reactivex.Single;

public class GetMovieUseCase {

    private MovieRepository movieRepository;

    public GetMovieUseCase(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Single<MovieEntity> getMovie(Integer movieId) {
        return movieRepository.getMovie(movieId);
    }

}
