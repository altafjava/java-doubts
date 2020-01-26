package com.altafjava.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.altafjava.dto.FormWrapper;

@RestController
@CrossOrigin(origins = "*")
public class JavaDoubtsController {

	@PostMapping("/ask-question")
	public void askQuestion(@ModelAttribute FormWrapper formWrapper) {
		String question = formWrapper.getQuestion();
		System.out.println("question =" + question);
		System.out.println("link=" + formWrapper.getLink());
		System.out.println("screenshot=" + formWrapper.getScreenshot().getName());
		System.out.println("file=" + formWrapper.getFile().getOriginalFilename());

	}

//	private void saveUploadedFile(MultipartFile file) throws IOException {
//		if (!file.isEmpty()) {
//			byte[] bytes = file.getBytes();
//			Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());
//			Files.write(path, bytes);
//		}
//	}
}
