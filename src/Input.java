import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Input {
	private Student[] array;
	private Scanner sc;
	private File file;
	private BufferedReader br;

	public Input(Student[] array) { // 생성자
		this.array = array; // 파라미터로 주소가 넘어온다
		// array 스캐너 초기화
		this.file = new File("C:/Temp/sungjuk_utf8.dat");
		try {
			this.br = new BufferedReader(new FileReader(this.file));
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		}

	}

	public int fileInput() {
		int count = 0;
		String line = null;
		while (true) { // 시작과 끝을 알 수 없을때 while 문
			count++;
			try {
				line = this.br.readLine();
				if (line == null)
					break;
//				System.out.println(line);
				String [] lines = line.split("\\s+"); // 스페이스 한개 이상일 때 잘라서
				System.out.println(lines[0]);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return count - 1;
	}

	// 파일처리를 하기 위한 준비물

	public int input() {
		String io = null; // 지역변수는 항상 초기화
		int count = 0;
		do {
			count++;
			System.out.print("Hakbun : ");
			String hakbun = this.sc.nextLine();
			System.out.print("Name : ");
			String name = this.sc.nextLine();
			System.out.print("Korean : ");
			int kor = this.sc.nextInt();
			System.out.print("English : ");
			int eng = this.sc.nextInt();
			System.out.print("Math : ");
			int mat = this.sc.nextInt();
			System.out.print("EDPS : ");
			int edp = this.sc.nextInt();
			this.sc.nextLine(); // 버퍼 날리기

			this.array[count - 1] = new Student(hakbun, name, kor, eng, mat, edp);
			System.out.print("계속(I/O) ? : ");
			io = this.sc.next();
			this.sc.nextLine(); // 버퍼 날리기
		} while (io.equals("I") || io.equals("i"));
		return count;
	}
}
