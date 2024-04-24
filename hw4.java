//Kullanıcının username, email, firstname, lastname ve password bilgilerini tutan bir ArrayList kullanarak giriş yapma algoritması yazınız.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class hw4 {
    public static void main(String[] args) {

        List<String> username = new ArrayList<>();
        List<String> firstName = new ArrayList<>();
        List<String> lastName = new ArrayList<>();
        List<String> password = new ArrayList<>();
        List<String> email = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        username.add("benguseker");
        username.add("etiya.akademi");

        email.add("benguseker@gmail.com");
        email.add("etiya.akademi@gmail.com");

        firstName.add("Bengü");
        firstName.add("Etiya");

        lastName.add("Şeker");
        lastName.add("Akademi");

        password.add("bng123");
        password.add("ety456");

        System.out.println("Username giriniz: ");
        String enteredUsername = scanner.nextLine();

        System.out.println("Password giriniz: ");
        String enteredPassword = scanner.nextLine();


        if (username.contains(enteredUsername) && password.contains(enteredPassword)) {
            System.out.println("Sisteme başarıyla giriş yaptınız.");
        } else {
            System.out.println("Hatalı kullanıcı adı veya şifre. Lütfen tekrar deneyin.");

        }

    }
}
