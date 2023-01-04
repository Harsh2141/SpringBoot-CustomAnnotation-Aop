package annotation.config;

import org.springframework.stereotype.Component;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
@Component
public class TimeCalculate {
	
	@Around("@annotation(annotation.config.ExecutionTime)")
	public Object trackTime(ProceedingJoinPoint pjp) throws Throwable {
		long stratTime=System.currentTimeMillis();
		System.out.println("------------------>" + stratTime);
		Object obj=pjp.proceed();
		long endTime=System.currentTimeMillis();
		System.out.println("---------------------" + endTime);
		System.out.println("Method name:-> "+pjp.getSignature()+" Time : "+(endTime-stratTime));
		return obj;
	}
}
