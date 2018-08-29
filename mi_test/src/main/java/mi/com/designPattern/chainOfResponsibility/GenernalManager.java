package mi.com.designPattern.chainOfResponsibility;

/**
 * 总经理类
 * @author John
 *
 */
public class GenernalManager extends Leader{

	public GenernalManager(String name) {
		super(name);
	}

	@Override
	public void hadleRequest(LeaveRequest request) {
		if(request.getLeaveDays() < 30) {
			System.out.println("员工："+request.getEmpName()+"，请假天数："+request.getLeaveDays()+",理由："+request.getReson());
			System.out.println("总经理："+this.name+"审批通过");
		}else {
			if(this.nextLeader != null){
				System.out.println("30天是不可能的");
			}
		}
	}

}