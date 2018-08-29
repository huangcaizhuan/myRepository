package mi.com.designPattern.chainOfResponsibility;
/**
 * 抽象类
 * @author John
 *
 */
public abstract class Leader {
	protected  String name;
	protected Leader nextLeader;//责任链上的后续对象
	public Leader(String name) {
		super();
		this.name = name;
	}
	public  void setNextLeader( Leader nextLeader) {
		 this.nextLeader =  nextLeader;
	}
	/**
	 * 处理请求的核心业务方法
	 * @param request
	 */
	public abstract void hadleRequest(LeaveRequest request);
		
}
