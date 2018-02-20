package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Photo;
import com.example.repository.PhotoRepository;

@Service("photoService")
public class PhotoServiceImpl implements PhotoService {

	@Autowired
	private PhotoRepository photoRepository;

	public List<Photo> getAllPhoto() {
		return photoRepository.findAll();
	}

	public Photo getPhotoById(long id) {
		return photoRepository.findOne(id);
	}

	public Photo savePhoto(Photo e) {
		return photoRepository.save(e);
	}

	@Override
	public List<Photo> getAllPhotos() {
		return photoRepository.findAll();
	}

}
