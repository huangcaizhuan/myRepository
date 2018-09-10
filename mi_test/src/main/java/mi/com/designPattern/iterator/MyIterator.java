package mi.com.designPattern.iterator;

/**
 * 自定义迭代接口
 * @author John
 *
 */
public interface MyIterator {
	void first();
	void next();
	boolean hasNext();
	
	boolean isFirst();
	boolean isLast();
	
	Object getCurrentObj();
}
