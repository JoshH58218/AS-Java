package file_io_tests;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
	
	public static void main(String[]args){
		BufferedReader Br=null;
		
		try{
			String sCurrentLine;
			Br = new BufferedReader(new FileReader("C://testing.txt"));
			
			while((sCurrentLine=Br.readLine()) !=null){
				System.out.println(sCurrentLine);
			}
			
		} catch (IOException e){
			e.printStackTrace();
		} finally{
			try{
				if (Br !=null)Br.close();
			}catch(IOException ex){
				ex.printStackTrace();
			}
		}
	}

}
