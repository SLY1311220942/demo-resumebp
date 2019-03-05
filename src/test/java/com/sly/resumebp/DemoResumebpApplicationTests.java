package com.sly.resumebp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.junit.Test;
import org.springframework.expression.AccessException;

/*@RunWith(SpringRunner.class)
@SpringBootTest*/
public class DemoResumebpApplicationTests {

	@Test
	public void contextLoads() {
	}

	/**
	 * _普通读写
	 * 
	 * @author sly
	 * @time 2019年3月5日
	 */
	@Test
	public void test01() {
		// 源文件与目标文件
		File sourcefile = new File("D:/test/source_resumebp.txt");
		File targetfile = new File("D:/test/target_resumebp.txt");

		// 输入输出流
		InputStream inputStream = null;
		OutputStream outputStream = null;

		// 数据缓冲区
		byte[] buf = new byte[5];
		int len = 0;
		try {
			inputStream = new FileInputStream(sourcefile);
			outputStream = new FileOutputStream(targetfile);
			while ((len = inputStream.read(buf)) > 0) {
				System.out.println(len + " write data ...");
				outputStream.write(buf, 0, len);
			}

		} catch (Exception e) {
			System.out.println(ExceptionUtils.getStackTrace(e));
		} finally {
			if (outputStream != null) {
				try {
					outputStream.close();
				} catch (IOException e) {
					System.out.println(ExceptionUtils.getStackTrace(e));
				}
			}

			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					System.out.println(ExceptionUtils.getStackTrace(e));
				}
			}

		}
	}

	/**
	 * _模拟传输中断后继续传输
	 * 
	 * @author sly
	 * @time 2019年3月5日
	 */
	@Test
	public void test02() {
		// 源文件与目标文件
		File sourcefile = new File("D:/test/source_resumebp.txt");
		File targetfile = new File("D:/test/target_resumebp.txt");

		// 输入输出流
		InputStream inputStream = null;
		OutputStream outputStream = null;

		// 数据缓冲区
		byte[] buf = new byte[5];
		int len = 0;
		// 记录传输位置
		int position = 0;
		try {
			inputStream = new FileInputStream(sourcefile);
			outputStream = new FileOutputStream(targetfile);

			while ((len = inputStream.read(buf)) > 0) {
				// 传输了3段内容后忘了中断
				if (position == 3) {
					throw new AccessException("传输中断!");
				}
				System.out.println(len + " write data ...");
				outputStream.write(buf, 0, len);
				position++;
			}

		} catch (AccessException e) {
			keepGoing(sourcefile, targetfile, position);
		} catch (Exception e) {
			System.out.println(ExceptionUtils.getStackTrace(e));
		} finally {
			if (outputStream != null) {
				try {
					outputStream.close();
				} catch (IOException e) {
					System.out.println(ExceptionUtils.getStackTrace(e));
				}
			}

			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					System.out.println(ExceptionUtils.getStackTrace(e));
				}
			}

		}
	}

	/**
	 * _继续传输
	 * 
	 * @param sourcefile
	 * @param targetfile
	 * @param position
	 * @author sly
	 * @time 2019年3月5日
	 */
	public void keepGoing(File sourcefile, File targetfile, int position) {
		try {
			// 线程休眠30秒
			Thread.sleep(30000);
		} catch (Exception e) {
			System.out.println(ExceptionUtils.getStackTrace(e));
		}
		
		RandomAccessFile readFile = null;
		RandomAccessFile writeFile = null;
		try {
			readFile = new RandomAccessFile(sourcefile, "r");
			writeFile = new RandomAccessFile(targetfile, "rw");

			readFile.seek(5 * position);
			writeFile.seek(5 * position);
			
			byte[] buf = new byte[5];
			int len = 0;
			while ((len = readFile.read(buf)) > 0) {
				writeFile.write(buf, 0, len);
			}
		} catch (Exception e) {
			System.out.println(ExceptionUtils.getStackTrace(e));
		} finally {
			if(readFile != null) {
				try {
					readFile.close();
				} catch (IOException e) {
					System.out.println(ExceptionUtils.getStackTrace(e));
				}
			}
			if(writeFile != null) {
				try {
					writeFile.close();
				} catch (IOException e) {
					System.out.println(ExceptionUtils.getStackTrace(e));
				}
			}
		}
	}
}
