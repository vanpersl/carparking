package com.infly.carparking.action;

import java.io.File;

import com.opensymphony.xwork2.ActionSupport;

public class SingleUploadAction extends ActionSupport {
	private File file;
	private String fileName;
	private String uploadContentType;
	
	public File getUpload() {
		return file;
	}
	public void setUpload(File upload) {
		this.file = upload;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getUploadContentType() {
		return uploadContentType;
	}
	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}
	
	public String execute() throws Exception{
		System.out.println("");
		java.io.InputStream is = new java.io.FileInputStream(file);
		java.io.OutputStream os = new java.io.FileOutputStream("e:\\upload\\" + fileName);
		byte buffer[] = new byte[1024 * 1024];
		int count = 0;
		while ((count = is.read(buffer)) > 0){
			os.write(buffer, 0, count);
		}
		os.close();
		is.close();
		return "SUCCESS";
	}
}
