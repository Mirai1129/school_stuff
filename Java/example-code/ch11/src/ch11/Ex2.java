package ch11;

import java.util.Scanner;
import ch11.Airplane;

class Fighter extends Airplane { // 戰鬥機類別
	public static int num;       // 目前戰鬥機的數目	
	private String machineGun;   // 機槍	
	private String missile;      // 飛彈
	private String rocket;       // 火箭
	
	public Fighter() { // 建構子
		num++;
	}
	
	//設定戰鬥機武器
	public void setWeapon(String machineGun, String missile, String rocket) {
		this.machineGun = machineGun;
		this.missile = missile;
		this.rocket = rocket;		
	}

	public void showData() {		
		super.showData();
		System.out.print(" 飛機外觀:" + shape + "\n機槍:" + machineGun );
		System.out.print(" 飛彈:" + missile + " 火箭:" + rocket);
	}
}

public class Ex2 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);		
		Fighter afighter = new Fighter();
		System.out.println("請輸入戰鬥機物件afighter之相關資訊:");		
		System.out.print("製造商:");
		afighter.manufacter = keyin.next();
		System.out.print("飛機型號:");
		afighter.type = keyin.next();
		System.out.print("飛機編號:");
		afighter.id= keyin.next();;
		System.out.print("引擎號碼:");
		String engineId= keyin.next();
		afighter.setEngineId(engineId);		
		System.out.print("飛行員人數:");
		afighter.pilotNum = keyin.nextInt();
		System.out.print("油箱容量(L):");
		afighter.fuelTank = keyin.nextInt();
		System.out.print("飛機外觀:");
		afighter.shape = keyin.next();		
		System.out.print("機槍名稱:");
		String machineGun= keyin.next();
		System.out.print("飛彈名稱:");
		String missile= keyin.next();
		System.out.print("火箭名稱:");
		String rocket= keyin.next();
		afighter.setWeapon(machineGun, missile, rocket);
		System.out.println("\n戰鬥機物件afighter之相關資訊如下:");		
		afighter.showData();		
		System.out.print("目前戰鬥機的數目:" + Fighter.num);
		System.out.print(" 目前飛機的數目:" + Airplane.num);
		System.out.println(" 目前飛行器的數目:" + FlightVehicle.num);
		keyin.close();
	}
}
