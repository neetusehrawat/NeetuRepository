import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetInputDataRuntimeBufferdReader {
	
	static String name;
	static int a;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
		System.out.println("Enter String");
		name = br.readLine();
		System.out.println("String" + '=' + name );
		
		
		System.out.println("Enter Integer");
		a= Integer.parseInt(br.readLine());
		System.out.println(a);		
		
		//name=System.console().readLine();  // console method only outside of an ide
		//System.out.println("String" + ' ' + name );
		
		

	}

}
