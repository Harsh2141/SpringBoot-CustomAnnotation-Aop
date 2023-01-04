package annotation.service;

import org.springframework.stereotype.Service;

import annotation.config.ExecutionTime;

@Service
public class AnnotationService {
	
	@ExecutionTime
	public void getData() {
		long stratTime=System.currentTimeMillis();
		System.out.println(stratTime);
		double sum=0;
		for(double i =0.0 ; i<1000000000.0 ; i++) {
			sum = sum + i;
		}
		long endTime=System.currentTimeMillis();
		System.out.println(endTime);
		System.out.println("++++++++++" + (endTime-stratTime));
		
	}

}
