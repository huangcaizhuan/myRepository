package mi.com.designPattern.chainOfResponsibility;

/**
 * 副总经理类
 * @author John
 *
 */
public class GenernalManager2 extends Leader{

	public GenernalManager2(String name) {
		super(name);
	}

	@Override
	public void hadleRequest(LeaveRequest request) {
		if(request.getLeaveDays() < 20) {
			System.out.println("员工："+request.getEmpName()+"，请假天数："+request.getLeaveDays()+",理由："+request.getReson());
			System.out.println("副总经理："+this.name+"审批通过");
		}else {
			if(this.nextLeader != null){
				this.nextLeader.hadleRequest(request);
			}
		}
	}

}