package com.example.music_project.database;

import androidx.room.*;

import com.example.music_project.models.Album;

@Dao
public interface AlbumDao {
    @Insert
    void insert(Album album);

    @Query("SELECT * FROM Album WHERE album_id = :albumId")
    Album getAlbumById(int albumId);

    @Update
    void update(Album album);

    @Delete
    void delete(Album album);
}