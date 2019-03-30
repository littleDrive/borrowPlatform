package com.borrow.service;

import org.springframework.web.multipart.MultipartFile;

public interface PictureService {

	String storePicture (MultipartFile file);
}
