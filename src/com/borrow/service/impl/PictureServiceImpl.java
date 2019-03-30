package com.borrow.service.impl;

import org.joda.time.DateTime;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.borrow.common.utils.FtpUtil;
import com.borrow.common.utils.IDUtils;
import com.borrow.service.PictureService;

/*
 * 图片服务
 * 把图片上传到服务器，并把图片在服务器上的路径返回
 */
@Service
public class PictureServiceImpl implements PictureService {

	@Override
	public String storePicture(MultipartFile file) {
		
//		把图片上传到服务器，并返回图片url
		//取文件扩展名
		String originalFilename = file.getOriginalFilename();
		String ext = originalFilename.substring(originalFilename.lastIndexOf("."));
		//生成新文件名
		//可以是时间+随机数生成文件名
		String imageName = IDUtils.genImageName();
		//把图片上传到ftp服务器（图片服务器）
		//文件在服务器的存放路径，应该使用日期分隔的目录结构
		DateTime dateTime = new DateTime();
		String filePath = dateTime.toString("/yyyy/MM/dd");
		try {
			FtpUtil.uploadFile("8.9.31.166", 21, "ftpuser", "13724199470", 
					"/home/ftpuser/www/images/temp", filePath, imageName + ext, file.getInputStream());
			String pictureUrl = "http://8.9.31.166/images/temp" + filePath + "/" + imageName + ext;
			return pictureUrl;
			
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
	}

}
