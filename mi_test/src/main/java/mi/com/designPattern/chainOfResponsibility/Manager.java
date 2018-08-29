package mi.com.designPattern.chainOfResponsibility;

/**
 * 主任类
 * @author John
 *
 */
public class Manager extends Leader{

	public Manager(String name) {
		super(name);
	}

	@Override
	public void hadleRequest(LeaveRequest request) {
		if(request.getLeaveDays() < 10) {
			System.out.println("员工："+request.getEmpName()+"，请假天数："+request.getLeaveDays()+",理由："+request.getReson());
			System.out.println("经理："+this.name+"审批通过");
		}else {
			if(this.nextLeader != null){
				this.nextLeader.hadleRequest(request);
			}
		}
	}

}
