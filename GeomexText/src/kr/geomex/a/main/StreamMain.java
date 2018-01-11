package kr.geomex.a.main;

import kr.geomex.streamTest.ByteStream;
import kr.geomex.streamTest.DisTest;
import kr.geomex.streamTest.DosTest;
import kr.geomex.streamTest.FileDir;
import kr.geomex.streamTest.FileDir2;
import kr.geomex.streamTest.FileReaderTest;
import kr.geomex.streamTest.FileStream;
import kr.geomex.streamTest.FileWriterTest;
import kr.geomex.streamTest.FisTest;
import kr.geomex.streamTest.FosTest;
import kr.geomex.streamTest.ObjReadTest;
import kr.geomex.streamTest.ObjTest;

public class StreamMain {
	
	public static void main(String[] args)throws Exception {
	
		/*FileStream f1=new FileStream();
		ByteStream f2=new ByteStream();
		f2.test();
		f1.test();*/
		
		/*FileDir f =new FileDir();
		FileDir2 f1 =new FileDir2();
		f.test();
		f1.test();*/
		
//		FileWriterTest f= new FileWriterTest();
//		FileReaderTest r= new FileReaderTest();
//		f.write("아름다운금수강산에\n"+"백두산은 매우 높구나\n"+"당신은 아직 준비가 덜됬구나\n");
//		r.read();
		
		/*FosTest o= new FosTest();
		FisTest i= new FisTest();
		
		o.write();
		i.read();*/
		
		/*DisTest i= new DisTest();
		DosTest d= new DosTest();
		d.write();
		i.read();*/
		
		ObjTest o= new ObjTest();
		ObjReadTest r= new ObjReadTest();
		o.write();
		r.read();
		
		
		
	}	
}
