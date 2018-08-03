import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyDemo {
public static void main(String[] args) throws Exception {
	FileInputStream instream = new FileInputStream("D:/Demo/vsc.exe");
	FileOutputStream outstream = new FileOutputStream("D:/Demo/vsc2.exe");
	 long startTime=System.currentTimeMillis();
	 int ch=0;
	 while(true) {
		 ch=instream.read();
		 if(ch==-1) break;
		 outstream.write(ch);
	 }
	 System.out.println("time: "+(System.currentTimeMillis()-startTime));
	 outstream.close();
	 instream.close();
}
}
