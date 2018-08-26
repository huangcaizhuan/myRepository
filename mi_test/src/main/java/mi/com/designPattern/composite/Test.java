package mi.com.designPattern.composite;

public class Test {
	public static void main(String[] args) {
		AbsyractFile f2,f3,f4,f5,f6;
		Folder f1 = new Folder("我的收藏");
		
		f2 = new ImageFile("头像");
		f3 = new TxtFile("hello.txt");
		f1.add(f2);
		f1.add(f3);
		
		//f2.killVirus();
		//f1.killVirus();
		
		Folder f11 = new Folder("我的电影");
		f4 = new VideoFile("笑傲江湖.avi");
		f5 = new VideoFile("笑傲江湖.avi");
		f11.add(f4);
		f11.add(f5);
		f1.add(f11);
		
		f1.killVirus();
	}
}
