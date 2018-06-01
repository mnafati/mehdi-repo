package projectgit;




import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;



@ComponentScan
@SpringBootApplication
@EnableAutoConfiguration
public class Main {
	
	static int numA=10;
	static int numB=-5;
	static int numC=0;
	
	public static void main(String[] args) {	
		System.out.println("Modification");

		if (numA>numB) {
			numC=numA+numB;
		}
	}
}
