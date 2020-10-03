package cualtos.examples;

public class OperationCode {
	private MachineCode operationCode;
	
	public OperationCode(String InputCode) {
		this.operationCode = setOperationCode(InputCode);
	}
	
	public MachineCode setOperationCode(String InputCode) {
		return MachineCode.valueOf(InputCode.toUpperCase());
	}
}
