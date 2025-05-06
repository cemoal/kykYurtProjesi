package Src;
import java.util.Scanner;
public class yonetici extends kullanıcı {

	@Override
	public boolean logIn() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void editProfile() {
		Scanner scanner = new Scanner(System.in);
    boolean continueEditing = true;

    System.out.println("Profil düzenleme ekranına hoş geldiniz.");

    while (continueEditing) {
        System.out.println("Hangi bilgiyi değiştirmek istersiniz?");
        System.out.println("1. Telefon Numarası");
        System.out.println("2. Şifre");
        System.out.println("3. E-posta");
        System.out.println("0. Çıkış");
        System.out.print("Seçiminiz: ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Girişten sonra satır sonu karakterini temizlemek için

        switch (choice) {
            case 1:
                System.out.print("Yeni telefon numaranızı girin: ");
                String newTelNo = scanner.nextLine();
                if (!newTelNo.isBlank()) {
                    setTelNo(newTelNo);
                    System.out.println("Telefon numarası başarıyla güncellendi.");
                } else {
                    System.out.println("Telefon numarası boş bırakılamaz.");
                }
                break;

            case 2:
                System.out.print("Yeni şifrenizi girin: ");
                String newPassword = scanner.nextLine();
                if (!newPassword.isBlank()) {
                    setPassword(newPassword);
                    System.out.println("Şifre başarıyla güncellendi.");
                } else {
                    System.out.println("Şifre boş bırakılamaz.");
                }
                break;

            case 3:
                System.out.print("Yeni e-posta adresinizi girin: ");
                String newEmail = scanner.nextLine();
                if (!newEmail.isBlank()) {
                    setEposta(newEmail);
                    System.out.println("E-posta adresi başarıyla güncellendi.");
                } else {
                    System.out.println("E-posta adresi boş bırakılamaz.");
                }
                break;

            case 0:
                continueEditing = false;
                System.out.println("Profil düzenleme işlemi sonlandırıldı.");
                break;

            default:
                System.out.println("Geçersiz bir seçim yaptınız. Lütfen tekrar deneyin.");
        }
    }

    scanner.close();
		
	}

	@Override
	
		public void showProfile() {
		    System.out.println("╔═══════════════════════════╗");
		    System.out.println("║   YÖNETİCİ PROFİLİ        ║");
		    System.out.println("╠═══════════════════════════╣");
		    System.out.println("╠Ad         : " + getName());
		    System.out.println("╠Soyad      : " + getSurname());
		    System.out.println("╠E-posta    : " + getEposta());
		    System.out.println("╠Telefon No : " + getTelNo());
		    System.out.println("╠Memleket   : " + getHomeTown());
		    System.out.println("╚═══════════════════════════╝");
		}

		
	}

	


