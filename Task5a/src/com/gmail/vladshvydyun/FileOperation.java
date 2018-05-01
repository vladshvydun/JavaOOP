package com.gmail.vladshvydyun;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileOperation {

	public static void copyFile(File in, File out) throws IOException {
		if (in == null || out == null) {
			throw new IllegalArgumentException("Null file pointer");
		}
		try (InputStream is = new FileInputStream(in); 
				OutputStream os = new FileOutputStream(out)) {
			byte[] buffer = new byte[1024 * 1024];
			int readByte = 0;
			for (; (readByte = is.read(buffer)) > 0;) {
				os.write(buffer, 0, readByte);
			}
		} catch (IOException e) {
			throw e;
		}
	}

}
