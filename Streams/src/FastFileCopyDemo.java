import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FastFileCopyDemo {

	public static void main(String[] args) throws Exception {
		BufferedInputStream instream = new BufferedInputStream(new FileInputStream("D:/Demo/vsc.exe"));
		BufferedOutputStream outstream = new BufferedOutputStream(new FileOutputStream("D:/Demo/vsc2.exe"));
		long startTime=System.currentTimeMillis();
		int ch=0;
		while(true) {
			ch=instream.read();
			if(ch==-1) break;
			outstream.write(ch);
		}
		
		System.out.println("Time: "+(System.currentTimeMillis()-startTime));
		outstream.close();
		instream.close();

		
	}

}
