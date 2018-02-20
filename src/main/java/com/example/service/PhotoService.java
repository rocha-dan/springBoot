package com.example.service;

import java.util.List;

import com.example.model.Employee;
import com.example.model.Photo;

public interface PhotoService {
	
	public List<Photo> getAllPhotos();
	public Photo getPhotoById(long id);
	public Photo savePhoto(Photo e);
	
}
