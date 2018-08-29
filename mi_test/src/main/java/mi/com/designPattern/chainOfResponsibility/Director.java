package mi.com.designPattern.chainOfResponsibility;

/**
 * 主任类
 * @author John
 *
 */
public class Director extends Leader{

	public Director(String name) {
		super(name);
	}

	@Override
	public void hadleRequest(LeaveRequest request) {
		if(request.getLeaveDays() < 3) {
			System.out.println("员工："+request.getEmpName()+"，请假天数："+request.getLeaveDays()+",理由："+request.getReson());
			System.out.println("主任："+this.name+"审批通过");
		}else {
			if(this.nextLeader != null){
				this.nextLeader.hadleRequest(request);
			}
		}
	}

}
