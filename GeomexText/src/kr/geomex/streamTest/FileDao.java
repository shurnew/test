package kr.geomex.streamTest;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FileDao {
	private String filePath;
	private File file;
	private RandomAccessFile randomAccessFile;
	private int recordCount = 0;
	public static final int RECORD_LENGTH = 48;
	public static final int RECORD_COUNT_LENGTH = 4;
	public static final int NAME_LENGTH = 10;
	public static final int TELEPHONE_LENGTH = 26;

	public FileDao(String filePath) throws Exception {

		this.filePath = filePath;
		this.file = new File(filePath);
		try {
			randomAccessFile = new RandomAccessFile(file, "rw");
			if (randomAccessFile.length() != 0) {

				recordCount = randomAccessFile.readInt();
			} else {
				System.out.println("처음으로 실행하여 파일에 등록된 친구없음");
			}

		} catch (IOException e) {
			e.printStackTrace();
			throw new Exception("파일 처리 오류");
		}
	}

	public RandomAccessFile getRandomAccessFile() {

		return randomAccessFile;
	}

	public int getRecordCount() {

		return recordCount;
	}

	public void saveRecord(Friend friend) throws Exception {

		randomAccessFile.seek((recordCount * RECORD_LENGTH) + RECORD_COUNT_LENGTH);

		String name = friend.getName();
		int age = friend.getAge();
		double weight = friend.getWeight();
		String telephone = friend.getTelephone();

		int charCount = name.length();
		// 이름 저장10바이트
		for (int i = 0; i < (NAME_LENGTH / 2); i++) {

			randomAccessFile.writeChar((i < charCount ? name.charAt(i) : ' '));
		}
		// 나이저장4바이트
		randomAccessFile.writeInt(age);
		// 몸무게 저장8바이트
		randomAccessFile.writeDouble(weight);
		// 전화번호저장26바이트
		charCount = telephone.length();
		for (int i = 0; i < (TELEPHONE_LENGTH / 2); i++) {
			randomAccessFile.writeChar((i < charCount ? telephone.charAt(i) : ' '));

		}
		randomAccessFile.seek(0);
		randomAccessFile.writeInt(++recordCount);
	}

	public List<Friend> getRecords() throws Exception {
		ArrayList<Friend> list = new ArrayList<Friend>();
		for (int i = 0; i < recordCount; i++) {

			Friend friend = getRecord(i);
			list.add(friend);
		}
		return list;
	}

	private Friend getRecord(int index) throws IOException {
		Friend friend = null;
		String name = "";

		randomAccessFile.seek((index * RECORD_LENGTH) + RECORD_COUNT_LENGTH);

		for (int i = 0; i < (NAME_LENGTH / 2); i++) {
			name += randomAccessFile.readChar();
		}
		name = name.trim();
		int age = 0;
		age = randomAccessFile.readInt();
		double weight = 0.0;
		weight = randomAccessFile.readDouble();

		String telephone = "";
		for (int i = 0; i < (TELEPHONE_LENGTH / 2); i++) {
			telephone += randomAccessFile.readChar();
		}
		telephone = telephone.trim();
		friend = new Friend(name, age, weight, telephone);
		return friend;
	}

	public void close() {

		try {
			if (randomAccessFile != null) {
				randomAccessFile.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
