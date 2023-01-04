package annotation;

import java.util.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnnotationApplication {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		SpringApplication.run(AnnotationApplication.class, args);
	}

}
