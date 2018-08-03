import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

public class FastestFileCopy {

	public static void main(String[] args) throws Exception{
		FileChannel inChannel=null;
		FileChannel outChannel=null;
		long startTime=System.currentTimeMillis();
		try {
			
			inChannel=new FileInputStream("D:/Demo/vsc.exe").getChannel();
			outChannel = new FileOutputStream("D:/Demo/vsc2.exe").getChannel();
			outChannel.transferFrom(inChannel, 0, inChannel.size());
						
		} catch(Exception e) {
			e.getMessage();
			
		}System.out.println("Time: "+(System.currentTimeMillis()-startTime));
		inChannel.close();
		outChannel.close();
	}

}
