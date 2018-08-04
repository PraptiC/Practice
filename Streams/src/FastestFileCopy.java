import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

public class FastestFileCopy {

	public static void main(String[] args) throws Exception{
		FileChannel inChannel=null;
		FileChannel outChannel=null;
		long startTime=System.currentTimeMillis();
		long position = 0;
		long count = inChannel.size();
		try {
			
			inChannel=new FileInputStream("D:/Demo/vsc.exe").getChannel();
			outChannel = new FileOutputStream("D:/Demo/vsc2.exe").getChannel();
			outChannel.transferFrom(inChannel, position, count);
			/*
			 * The parameters position and count tell 
			 * where in the destination file to start writing (position), 
			 * and how many bytes to transfer maximally (count).
			 * 
			 */
						
		} catch(Exception e) {
			e.getMessage();
			
		}System.out.println("Time: "+(System.currentTimeMillis()-startTime));
		inChannel.close();
		outChannel.close();
	}

}
