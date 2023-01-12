package practice02_soldier;

public class MainClass {

	public static void main(String[] args) {  // has a도 사용되긴 하지만 대부분 is a로 상속함
		
		Soldier soldier = new Soldier();
		
		
		soldier.reload(1);
		soldier.shoot();
		
		
	}

}
