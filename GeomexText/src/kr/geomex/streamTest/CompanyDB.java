package kr.geomex.streamTest;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class CompanyDB {

	private String filePath;
	private File file;
	private int recordCount = 0;
	public static final int RECORD_LENGTH = 40;
	public static final int NAME_LENGTH = 10;
	public static final int TELEPHONE_LENGTH = 26;
	public static final int RECORD_COUNT_LENGTH = 4;
	RandomAccessFile randomAccessFile = null;

	public CompanyDB(String filePath) throws Exception {
		this.filePath = filePath;
		this.file = new File(filePath);
		try {
			randomAccessFile = new RandomAccessFile(file, "rw");
			if (randomAccessFile.length() != 0) {
				recordCount = randomAccessFile.readInt();
			} else {
				System.out.println("등록된 고객 정보없음");
			}
		} catch (IOException e) {
			System.out.println("파일 등록오류");
		}
	}

	public void setDataBase(Customer cm) throws Exception {
		randomAccessFile.seek((recordCount * RECORD_LENGTH) + RECORD_COUNT_LENGTH);
		String name = cm.name;
		int age = cm.age;
		String tele = cm.tele;
		int charCount = name.length();

		for (int i = 0; i < (NAME_LENGTH / 2); i++) {
			randomAccessFile.writeChar((i < charCount ? name.charAt(i) : ' '));
		}

		randomAccessFile.writeInt(age);
		charCount = tele.length();
		for (int i = 0; i < (TELEPHONE_LENGTH / 2); i++) {
			randomAccessFile.writeChar((i < charCount ? tele.charAt(i) : ' '));
		}
		randomAccessFile.seek(0);
		randomAccessFile.writeInt(++recordCount);
	}

	public List<Customer> getRecords() throws Exception {
		ArrayList<Customer> list = new ArrayList<Customer>();
		for (int i = 0; i < recordCount; i++) {
			Customer customer = getDataBase(i);
			list.add(customer);
		}
		return list;
	}

	public Customer getDataBase(int index) throws IOException {
		Customer cunstomer = null;
		String name = "";
		String telephone = "";
		int age = 0;
		randomAccessFile.seek((index * RECORD_LENGTH) + RECORD_COUNT_LENGTH);
		for (int i = 0; i < (NAME_LENGTH / 2); i++) {
			name += randomAccessFile.readChar();
		}
		name = name.trim();
		age = randomAccessFile.readInt();

		for (int i = 0; i < (TELEPHONE_LENGTH / 2); i++) {
			telephone += randomAccessFile.readChar();
		}
		telephone = telephone.trim();

		cunstomer = new Customer(name, age, telephone);
		return cunstomer;
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
