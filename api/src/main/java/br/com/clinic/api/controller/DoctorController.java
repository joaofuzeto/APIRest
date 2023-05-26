package br.com.clinic.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.clinic.api.doctor.DoctorsData;

@RestController
@RequestMapping("/doctors")
public class DoctorController {
	
	@PostMapping
	public void register(@RequestBody DoctorsData data) {
		System.out.println(data);
	}

}
