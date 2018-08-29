package mi.com.designPattern.chainOfResponsibility;
/**
 * 请假基本信息
 * @author John
 *
 */
public class LeaveRequest {
	private String empName;
	private int leaveDays;
	private String reson;
	public LeaveRequest(String empName, int leaveDays, String reson) {
		super();
		this.empName = empName;
		this.leaveDays = leaveDays;
		this.reson = reson;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getLeaveDays() {
		return leaveDays;
	}
	public void setLeaveDays(int leaveDays) {
		this.leaveDays = leaveDays;
	}
	public String getReson() {
		return reson;
	}
	public void setReson(String reson) {
		this.reson = reson;
	}
}
