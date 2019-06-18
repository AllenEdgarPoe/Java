package ManagingFile;

import java.io.*;

public class BitmapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:\\temp\\test.bmp");
		
		FileOutputStream os = null;
		BufferedOutputStream bos = null;
		DataOutputStream dos = null;
		
		
		try {
			os = new FileOutputStream(file);
			bos = new BufferedOutputStream(os);
			dos = new DataOutputStream(bos);
			
			//저장 로직.....
			//메타 데이터... 
			dos.writeByte(0x42); //'B'
			dos.writeByte(0x4D); //'M'
			
			//dos.writeInt(30054);
			dos.writeByte((1000*1000+54) >> 0);
			dos.writeByte((1000*1000+54) >> 8);
			dos.writeByte((1000*1000+54) >> 16);
			dos.writeByte((1000*1000+54) >> 24);
			
			
			
			dos.writeShort(0x0000);
			dos.writeShort(0x0000);
			
			//dos.writeInt(0x36);
			dos.writeByte(0x36 >> 0);
			dos.writeByte(0x36 >> 8);
			dos.writeByte(0x36 >> 16);
			dos.writeByte(0x36 >> 24);
			
			//////
			
			//dos.writeInt(0x28);
			dos.writeByte(0x28 >> 0);
			dos.writeByte(0x28 >> 8);
			dos.writeByte(0x28 >> 16);
			dos.writeByte(0x28 >> 24);
			
			
			//dos.writeInt(100);
			dos.writeByte(1000 >> 0);
			dos.writeByte(1000 >> 8);
			dos.writeByte(1000 >> 16);
			dos.writeByte(1000 >> 24);	
		
			
			//dos.writeInt(100);
			
			dos.writeByte(1000 >> 0);
			dos.writeByte(1000 >> 8);
			dos.writeByte(1000 >> 16);
			dos.writeByte(1000 >> 24);
			
			//dos.writeShort(1);
			dos.writeByte(1 >> 0);
			dos.writeByte(1 >> 8);
			
			//dos.writeShort(24);
			dos.writeByte(24 >> 0);
			dos.writeByte(24 >> 8);

			
			dos.writeInt(0);
			
			//dos.writeInt(30000);
			dos.writeByte((3*1000*1000) >> 0);
			dos.writeByte((3*1000*1000) >> 8);
			dos.writeByte((3*1000*1000) >> 16);
			dos.writeByte((3*1000*1000) >> 24);

			
			dos.writeInt(0);
			dos.writeInt(0);
			dos.writeInt(0);
			dos.writeInt(0);
			
			
			//실제 데이터...
			for(int i = 0 ; i < 1000 ; i++) {
				for(int j = 0 ; j < 1000 ; j++) {
					if((int)(Math.sqrt((500-i)*(500-i)+(500-j)*(500-j))) == 100) {
						dos.writeByte(0xFF);
						dos.writeByte(0xFF);
						dos.writeByte(0xFF);
						continue;
					}
					
					dos.writeByte(0x00);
					dos.writeByte(0x00);
					dos.writeByte(0x00);
				}
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				dos.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("ddddddd");
		
	}

}

