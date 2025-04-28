package Src;

import java.util.Random;
import java.util.Scanner;

public class ogrenci extends kullanıcı {
	Scanner scanner = new Scanner(System.in);
	private String sex;
	private String addres;
	private String department;
	private int dayOff;
	private int roomNo;
	private int penaltyNo; // 3 tane disiplin suçu işlenirse yurttan atılacak
	private String dormytoryName;

	public String getDormytoryName() {
		return dormytoryName;
	}

	public void setDormytoryName(String dormytoryName) {
		this.dormytoryName = dormytoryName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAddres() {
		return addres;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getDayOff() {
		return dayOff;
	}

	public void setDayOff(int dayOff) {
		this.dayOff = dayOff;
	}

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public int getPenaltyNo() {
		return penaltyNo;
	}

	public void setPenaltyNo(int penaltyNo) {
		this.penaltyNo = penaltyNo;
	}

	public void izinAl() {
		if (dayOff == 0) {
			System.out.println("Bu dönemlik izin hakkınız dolmuştur");
		} else {
			System.out.println("ne kadar izin almak istiyorsunuz");
			int izin = scanner.nextInt();
			System.out.println(izin + " kadar gün izin hakkınızdan düşülmüştür");
			dayOff -= izin;
		}
	}

	public void yurtNakilTalebi() {

	}

	public void becais() {

	}

	public void istekVeSikayet() {

	}

	public void yurtKayitSilme() {
		
		
	}
	public void yurtBasvurma() {
		if(getDormytoryName()==null) {
			//Random bir yurt ver veya seçenek sun hangi yurda gitmek istediğiyle ilgili
	}
		}
	public void yemegiGoster() {
		
	}
	public void izinTalebi() {
		
	}

	@Override
	public boolean logIn() {
		// Dosya işlemleri gerekli
		return false;
	}

	@Override
	public void editProfile() {
		// Dosya işlemleri gerekli
		
	}

	@Override
	public void showProfile() {
		System.out.println("╔═══════════════════════════╗");
	    System.out.println("║       PROFİL BİLGİLERİ     ║");
	    System.out.println("╠═══════════════════════════╣");
	    System.out.println("║ İsim       : "+getName());
	    System.out.println("║ Soyisim    : "+getSurname());
	    System.out.println("║ Cinsiyet   : "+getSex());
	    System.out.println("║ Adres      : "+getAddres() );
	    System.out.println("║ Bölüm      : "+getDepartment());
	    System.out.println("║ İzin hakkı : "+getDayOff());
	    System.out.println("║ Oda no     : "+getRoomNo());
	    System.out.println("║ Disiplin no: "+getPenaltyNo());
	    System.out.println("║ Yurt ismi  : "+getDormytoryName());
	    System.out.println("║ E-posta  :   "+getEposta());
	    System.out.println("║ Telefon  :   "+getTelNo());
	    System.out.println("╚═══════════════════════════╝");
	}
		
	


	}
	

	

}
