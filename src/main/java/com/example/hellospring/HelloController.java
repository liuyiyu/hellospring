package com.example.hellospring;

import org.apache.commons.io.FileUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import software.amazon.awssdk.services.s3.S3Client;

import java.io.File;
import java.io.IOException;

@RestController

public class HelloController {

	@RequestMapping("/")
	public String index() {
		return "Greetings from Azure Spring Cloud!";
	}


	@RequestMapping("/getData")
	public String getData() {


		return "Data";
	}


	@RequestMapping("/getS3Data")
	public String getS3Data() {

		S3Client client = S3Client.builder().build();

		return "S3Data";
	}

	public void genOutput()  {
		File myfile = new File("C:\\myfile.txt");
		try {
			FileUtils.touch(myfile);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

	}

}