package com.zch.commons;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Collection;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.apache.commons.io.filefilter.EmptyFileFilter;

public class TraversFile {
	public static void main(String[] args) {
      //此处输入根文件夹
			Collection<File> files=FileUtils.listFilesAndDirs(new File("G:\\迅雷下载"), 
					EmptyFileFilter.NOT_EMPTY, DirectoryFileFilter.INSTANCE);
			for (File file : files) {
				double len1=FileUtils.sizeOf(file);
        //输出文件大小单位是GB，若想MB则少一个1024，以此类推
				len1/=(1024*1024*1024);
				DecimalFormat df=new DecimalFormat("#.00");
				//System.out.println(df.format(money));
				if(file.isDirectory())
					//输出markdown目录的#
					//System.out.println("#"+file.getName());
					System.out.println("目录:"+file.getName());
				else
				System.out.println(file.getName()+" 大小  "+df.format(len1)+"GB");
		}

	}
}
