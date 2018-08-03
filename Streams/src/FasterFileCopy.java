import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FasterFileCopy {
	public static void main(String[] args) throws Exception {
		FileInputStream fin = new FileInputStream("D:/Demo/vsc.exe");
		FileOutputStream fout = new FileOutputStream("D:/Demo/vsc2.exe");
		
		FileChannel inc = fin.getChannel();
		FileChannel outc = fout.getChannel();
		
		ByteBuffer bb = ByteBuffer.allocateDirect(1024);
		
		long startTime = System.currentTimeMillis();
		while(true) {
			int c = inc.read(bb);
			if(c == -1) break;
			bb.flip();
			outc.write(bb);
			bb.clear();
		}
		System.out.println("Time: "+(System.currentTimeMillis() - startTime));
	}

}
