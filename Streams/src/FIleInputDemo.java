import java.io.FileInputStream;

public class FIleInputDemo {
public static void main(String[] args) throws Exception {
	String file="D:/Demo/Song.txt";
	FileInputStream instream=new FileInputStream(file);
	
	byte[] bar = new byte[instream.available()];
	instream.read(bar); // reading stream data into byte array
	String content = new String(bar); //converting byte array to String
	System.out.println(content);
	
//	int ch=0;
//	
//	while(true) {
//		ch=instream.read();
//		if(ch==-1) break;
//		System.out.print((char)ch);
//	}
	instream.close();
}
}
