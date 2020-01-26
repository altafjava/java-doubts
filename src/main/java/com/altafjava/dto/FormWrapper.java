package com.altafjava.dto;

import org.springframework.web.multipart.MultipartFile;

public class FormWrapper {
	private String question;
	private String link;
	private MultipartFile screenshot;
	private MultipartFile file;

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public MultipartFile getScreenshot() {
		return screenshot;
	}

	public void setScreenshot(MultipartFile screenshot) {
		this.screenshot = screenshot;
	}

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

}
