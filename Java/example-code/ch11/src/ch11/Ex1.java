package ch11;

import java.util.Scanner;

class FlightVehicle { // 飛行器類別
	public static int num;  // 目前飛行器的數目
	protected String shape; // 飛行器外觀

	public FlightVehicle() { // 建構子		
		num++;
	}
}

class Airplane extends FlightVehicle { // 飛機類別
	public static int num;    // 目前飛機的數目
	public String manufacter; // 製造商
	public String type;       // 飛機型號
	public String id;         // 飛機編號
	private String engineId;  // 飛機引擎號碼
	public int pilotNum;      // 飛行員人數	
	protected int fuelTank;   // 飛機油箱容量(L)
	public Airplane() { // 建構子
		num++;
	}
	
	// 設定引擎號碼
	public void setEngineId(String engineId) {		
		this.engineId = engineId;		
	}

	public void showData() {
		System.out.println("製造商:" + manufacter + " 飛機型號:" + type);
		System.out.println("飛機編號:" + id + " 引擎號碼:" + engineId);
		System.out.print("飛行員人數:" + pilotNum + " 油箱容量(L):" + fuelTank);
	}
}

public class Ex1 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
        Airplane aplane = new Airplane();
        System.out.println("請輸入飛機物件aplane之相關資訊:");
		System.out.print("製造商:");
		aplane.manufacter = keyin.next();
		System.out.print("飛機型號:");
		aplane.type = keyin.next();
		System.out.print("飛機編號:");
		aplane.id= keyin.next();
		System.out.print("引擎號碼:");
		String engineId= keyin.next();
		aplane.setEngineId(engineId);		
		System.out.print("飛行員人數:");
		aplane.pilotNum = keyin.nextInt();
		System.out.print("油箱容量(L):");
		aplane.fuelTank = keyin.nextInt();
		System.out.print("飛機外觀:");
		aplane.shape = keyin.next();		
		System.out.println("\n飛機物件aplane之相關資訊如下:");		
		aplane.showData();
		System.out.println(" 飛機外觀:" + aplane.shape);
		System.out.print("目前飛機的數目:" + Airplane.num);
		System.out.println(" 目前飛行器的數目:" + FlightVehicle.num);
		keyin.close();
	}
}
