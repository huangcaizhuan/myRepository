package mi.com.myThread;

import java.util.ArrayList;
import java.util.List;

/**
 * 通过传入list和数量，返回一个list<List>数量传入数量的集合
 * @author John
 *
 */
public class ListUtils {
	static public <T> List<List<T>> splitList(List<T> list,int pageSize){
		int litSize = list.size();
		int page =(litSize + (pageSize-1))/pageSize;
		List<List<T>>  listArray = new ArrayList<List<T>>();
		for(int i=0;i<page;i++) {
			List<T> subList = new ArrayList<T>();
			for(int j=0;j<litSize;j++) {
				int pageIndex =((j+i) + (pageSize-1))/pageSize;
				if(pageIndex == i+1) {
					subList.add(list.get(j));
				}
				if((j+i)== (j+1)*pageSize) {
					break;
				}
			}
			listArray.add(subList);
		}
		return  listArray;
	}
}
