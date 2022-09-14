import java.net.*;
import java.util.Scanner;

public class p734ip {
    public static void main(String[] args) {
        InetAddress addr1 = null, addr2 = null;
        System.out.print("호스트 이름이 뭐라고 했지? : ");
        Scanner in = new Scanner(System.in);
        String url = in.nextLine();

        try {
            addr1 = InetAddress.getByName(url);
            addr2 = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
        }

        System.out.print(url + "의 IP 주소 : ");
        System.out.println(addr1.getHostAddress());
        System.out.print("로컬 IP 주소 : ");
        System.out.println(addr2.getHostAddress());
    }
}