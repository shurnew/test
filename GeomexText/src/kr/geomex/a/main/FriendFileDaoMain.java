package kr.geomex.a.main;

import java.util.ArrayList;

import kr.geomex.streamTest.FileDao;
import kr.geomex.streamTest.Friend;

public class FriendFileDaoMain {

	public static void main(String[] args) {
		FileDao fileManager = null;

		try {
			fileManager= new FileDao("C:/friend.dat");
			/*fileManager.saveRecord(new Friend("�質��", 20, 58.4, "010-4856-8756"));
			fileManager.saveRecord(new Friend("�۳���", 25, 60.4, "010-1238-4813"));
			fileManager.saveRecord(new Friend("�ų���", 22, 55.4, "010-8752-1384"));
			fileManager.saveRecord(new Friend("������", 21, 72.4, "010-8768-1478"));*/
			System.out.println("���������� ����Ǿ����ϴ�");
		} catch (Exception e) {
			System.out.println("��Ͻ� ������ �߻��Ͽ����ϴ�"+e);
		}
		System.out.println("*********��ϵ� ģ���� �� ( ��"+fileManager.getRecordCount()+"��)***********");
		try {
			ArrayList<Friend>list = (ArrayList<Friend>)fileManager.getRecords();
			for(Friend friend :list) {
				System.out.println(friend);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("����Ʈ ��½� ������ �߻��Ͽ����ϴ�"+e);
		}
		fileManager.close();
	}
}
