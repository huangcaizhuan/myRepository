package mi.com.myThread;

import java.util.ArrayList;
import java.util.List;

class sendMsgThread extends Thread{
	List<UserEntity> userList;
	public sendMsgThread(List<UserEntity> list) {
		this.userList = list;
	}
	@Override
	public void run() {
		for(int i=0;i<userList.size();i++) {
			System.out.println("线程"+this.getId()+"发送短信给："+userList.get(i).getUserName());
		}
	}
}

public class Send {
	public static void main(String[] args) {
		List<List<UserEntity>> splitList= ListUtils.splitList(initUser(), 40);
		for(int i=0;i<splitList.size();i++) {
			new sendMsgThread(splitList.get(i)).start();
		}
	}
	
	public static List<UserEntity> initUser(){
		List<UserEntity> userList = new ArrayList<UserEntity>();
		UserEntity user;
		for(int i=0;i<140;i++) {
			user = new UserEntity();
			user.setUserId("id:"+i);
			user.setUserName("name:"+i);
			userList.add(user);
		}
		return userList;
	}
}
