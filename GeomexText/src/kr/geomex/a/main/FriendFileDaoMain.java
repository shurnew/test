package kr.geomex.a.main;

import java.util.ArrayList;

import kr.geomex.streamTest.FileDao;
import kr.geomex.streamTest.Friend;

public class FriendFileDaoMain {

	public static void main(String[] args) {
		FileDao fileManager = null;

		try {
			fileManager= new FileDao("C:/friend.dat");
			/*fileManager.saveRecord(new Friend("김나무", 20, 58.4, "010-4856-8756"));
			fileManager.saveRecord(new Friend("송나무", 25, 60.4, "010-1238-4813"));
			fileManager.saveRecord(new Friend("신나무", 22, 55.4, "010-8752-1384"));
			fileManager.saveRecord(new Friend("정나무", 21, 72.4, "010-8768-1478"));*/
			System.out.println("정상적으로 저장되었습니다");
		} catch (Exception e) {
			System.out.println("등록시 에러가 발생하였습니다"+e);
		}
		System.out.println("*********등록된 친구의 수 ( 총"+fileManager.getRecordCount()+"명)***********");
		try {
			ArrayList<Friend>list = (ArrayList<Friend>)fileManager.getRecords();
			for(Friend friend :list) {
				System.out.println(friend);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("리스트 출력시 에러가 발생하였습니다"+e);
		}
		fileManager.close();
	}
}
