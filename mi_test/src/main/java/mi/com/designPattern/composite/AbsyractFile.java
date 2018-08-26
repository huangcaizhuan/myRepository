package mi.com.designPattern.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public interface AbsyractFile {
	void killVirus();
}
class ImageFile implements AbsyractFile{
	private String name;
	public ImageFile(String name) {
		super();
		this.name = name;
	}
	@Override
	public void killVirus() {
		System.out.println("----图像处理："+name+",进行操作");
	}
	
}

class TxtFile implements AbsyractFile{
	private String name;
	public TxtFile(String name) {
		super();
		this.name = name;
	}
	@Override
	public void killVirus() {
		System.out.println("---文本处理："+name+",进行操作");
	}
	
}

class VideoFile implements AbsyractFile{
	private String name;
	public VideoFile(String name) {
		super();
		this.name = name;
	}
	@Override
	public void killVirus() {
		System.out.println("---视频处理："+name+",进行操作");
	}
	
}

class Folder implements AbsyractFile{

	private String name;
	private List<AbsyractFile> list = new ArrayList<AbsyractFile>();
	
	public Folder(String name) {
		super();
		this.name = name;
	}
	
	void add(AbsyractFile file) {
		list.add(file);
	}
	private void remove(AbsyractFile file) {
		list.remove(file);
	}
	public AbsyractFile getChild(int index) {
		return list.get(index);
	}
	
	@Override
	public void killVirus() {
		System.out.println(".文件夹："+name+",进行查杀");
		for(AbsyractFile file:list) {
			file.killVirus();
		}
	}
	
}







