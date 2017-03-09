package edu.zjucst.quatrabigdata.utils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class StreamUtils {
	public static void closeStream(Closeable c){
		try {
			if(c!=null) c.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void write2File(String content, String path) {
		BufferedWriter bufin = null;
		try {
			bufin = new BufferedWriter(new FileWriter(path,true));
			bufin.write(content);
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally{
			StreamUtils.closeStream(bufin);
			
		}
		
	}
	
	/**
	 * 读取txt文件
	 * 
	 * @param filePath
	 */
	public static String readTxtFile(String filePath) {
		String strBeans = "";
		try {
			String encoding = "UTF-8";
			File file = new File(filePath);
			if (file.isFile() && file.exists()) { // 判断文件是否存在
				InputStreamReader read = new InputStreamReader(
						new FileInputStream(file), encoding);// 考虑到编码格式
				BufferedReader bufferedReader = new BufferedReader(read);
				String lineTxt = null;
				while ((lineTxt = bufferedReader.readLine()) != null) {
					strBeans+=lineTxt+"\n";
				}
				read.close();
			} else {
				System.out.println("找不到指定的文件");
			}
		} catch (Exception e) {
			System.out.println("读取文件内容出错");
			e.printStackTrace();
		}
		return strBeans;
	}
}
