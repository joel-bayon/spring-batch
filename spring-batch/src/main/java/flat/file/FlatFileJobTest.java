package flat.file;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class FlatFileJobTest {
	@Autowired
	private Job job;
	@Autowired
	private JobLauncher jobLauncher;
	
	public void run() throws Exception {
	JobExecution execution = jobLauncher.run(job, new JobParameters());
	System.out.println("Job is " + execution.getExitStatus().getExitCode());
	}
	
	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext spring = new ClassPathXmlApplicationContext("flat/file/*.xml");
		spring.getBean(FlatFileJobTest.class).run();
		spring.close();
		
	}
}
