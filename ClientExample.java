package sec10;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientExample {
	public static void main(String[] args) {
		try {
			//Socket ������ ���ÿ� localhost�� 50001 port�� ���� ��û;
			Socket socket = new Socket("localhost", 50001);
			
			System.out.println( "[Ŭ���̾�Ʈ] ���� ����");
			
			// Socket �ݱ�
			socket.close();
			System.out.println("[Ŭ���̾�Ʈ] ���� ����");
		} catch (UnknownHostException e) {
			// IP ǥ�� ����� �߸��Ǿ��� ���
		} catch (IOException e) {
			// �ش� ��Ʈ�� ������ ������ �� ���� ���
		}

	}

}
