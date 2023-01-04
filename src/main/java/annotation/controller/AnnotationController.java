package annotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import annotation.service.AnnotationService;

@RestController
@RequestMapping("/get")
public class AnnotationController {
	
	
	@Autowired
	private AnnotationService annotationService;
	
	@GetMapping("/data")
	public ResponseEntity<?> createOrder(){
		annotationService.getData();
		return new ResponseEntity<>(null, HttpStatus.OK);
	}

}
