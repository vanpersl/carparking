package com.infly.carparking.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class UploadAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3786386470075630983L;
	private final static String UPPATH = "e:/upload/";
	private List<File> file; 
	private List<String> fileFileName; 
	private List<String> fileContentType;

	public List<File> getFile() {
		return file;
	}

	public void setFile(List<File> file) {
		this.file = file;
	}

	public List<String> getFileFileName() {
		return fileFileName;
	}

	public void setFileFileName(List<String> fileFileName) {
		this.fileFileName = fileFileName;
	}

	public List<String> getFileContentType() {
		return fileContentType;
	}

	public void setFileContentType(List<String> fileContentType) {
		this.fileContentType = fileContentType;
	}

	public String execute() throws Exception {
		for (int i = 0; i < file.size(); i++) {
			uploadFile(i);
		}
		return "success";
	}

	private void uploadFile(int i) throws FileNotFoundException, IOException {
		try {
			String fileName = fileFileName.get(i).toString();
			System.out.println(fileName);
			File destnationFile = new File(UPPATH + fileName);
			if (!destnationFile.exists()) {
				destnationFile.createNewFile();
			}
			InputStream in = new FileInputStream(file.get(i));
			OutputStream out = new FileOutputStream(destnationFile);
			byte[] buffer = new byte[1024 * 1024];
			int length;
			while ((length = in.read(buffer)) > 0) {
				out.write(buffer, 0, length);
			}
			out.close();
			in.close();
			file.get(i).delete();
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
