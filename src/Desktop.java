
public class Desktop implements Hardware,Software{
	@Override
	public void softwareResources() {
		System.out.println("WINDOWS 10");
		}

	@Override
	public void hardwareResources() {
		System.out.println("1TB HARD DISK");
		
	}
	private void DesktopModel() {
		System.out.println("HCL");

	}
	public static void main(String[] args) {
		Desktop cc =new Desktop();
		cc.softwareResources();
		cc.hardwareResources();
		cc.DesktopModel();
	}
}
