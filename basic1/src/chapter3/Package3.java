package chapter3;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

public class Package3 {
	public static void main(String[] args) {
		
		// Random 클래스 : 난수를 생성하는 클래스
		Random random = new Random();
		System.out.println(random.nextInt()); // 1975061301 (음수, 양수 구분 없이 랜덤)
		// 범위 제약
		System.out.println(random.nextInt(10)); // 2 (0 ~ 9까지 랜덤)
		System.out.println(random.nextInt(10) + 1); // 5 (1 ~ 10까지 랜덤)
		
		// SEED 지정
		random = new Random(1);
		System.out.println(random.nextInt()); // -1155869325
		System.out.println(random.nextInt()); // 431529176
		System.out.println(random.nextInt(45)); // 37
	
		// UUID 클래스 : 고유한 식별자를 만들기 위해 사용하는 랜덤한 문자열
		String uuid = UUID.randomUUID().toString();
		System.out.println(uuid); // ace9b6de-1f93-4ef8-89d2-bc101039f94b(랜덤)
		
//		-----------------------------------------------------------------------
		
		// Date 클래스 : 날짜를 다루는 클래스
		// Date 클래스의 대부분의 메서드는 Java 1.1 부터 사용하지 않도록 권장
		Date dateNow = new Date();
		System.out.println(dateNow); // Wed Jul 17 09:41:09 KST 2024(실행시 반영)
		System.out.println(dateNow.getDate()); // 17(실행시 반영)
		
		// LocalDateTime 클래스 : Java 8 부터 Date를 대체하기 위해 사용되는 클래스
		// LocalDate 클래스, LocalTime 클래스, LocalDateTime 클래스
	
		// 현재 날짜 및 시간의 인스턴스 생성
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now); // 2024-07-17T09:41:09.387899500(실행시 반영)
		// 특정 날짜 및 시간의 인스턴스 생성
		LocalDateTime date1 = LocalDateTime.of(2024, 7, 9, 9, 30, 0);
		System.out.println(date1); // 2024-07-09T09:30(실행시 반영)
		
		// 특정 날짜 및 시간의 요소 불러오기
		// getXXX();
		int year = now.getYear();
		System.out.println(year); // 2024(실행시 반영)
		int month = now.getMonthValue();
		System.out.println(month); // 7(실행시 반영)
		int day = now.getDayOfMonth();
		System.out.println(day); // 17(실행시 반영)
		
		// 특정 날짜 및 시간의 요소 변경하기
		// withXXX();
		// 인스턴스가 직접 변경되지 않고 변경한 값을 반환
//		now.withYear(2025);
		now = now.withYear(2025);
		System.out.println(now); // 2025-07-17T09:45:55.639188100(실행시 반영)
		
		// 날짜 계산하기
		// 특정 요소에 값을 더하거나 빼기
		// plusXXX();, minusXXX();
		// 인스턴스가 직접 변경되지 않고 변경한 값을 반환
//		now.plusDays(20).minusHours(22);
		now = now.plusDays(20).minusHours(22);
		System.out.println(now); // 2025-08-05T11:49:52.970178900(실행시 반영)
		
		// LocalDateTime을 Date로 변경
		// Date 클래스의 from 메서드를 이용
		now.atZone(ZoneId.systemDefault());
		Date localToDate = Date.from(now.atZone(ZoneId.systemDefault()).toInstant());
		System.out.println(localToDate); // Tue Aug 05 12:21:39 KST 2025
		
		// Date를 LocalDateTime으로 변경
		// Date 인스턴스의 toInstant(), toLocalDateTime();
		LocalDateTime dateToLocal = localToDate.toInstant()
									.atZone(ZoneId.systemDefault())
									.toLocalDateTime();
		System.out.println(dateToLocal); // 2025-08-05T12:21:39.645
		
		// Date를 String으로 변경
		// SimpleDateFormat 클래스를 사용하여 지정한 포멧의 문자열로 변경 가능
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
		String strDate = simpleDateFormat.format(dateNow);
		System.out.println(strDate); // 24. 7. 17. 오전 10:21
		
		// y : 연도, M : 월, d : 일, a : 오전오후
		// H : 시간(24), h : 시간(12), m : 분, s : 초, E : 요일
		SimpleDateFormat computerFormat = new SimpleDateFormat("a hh:mm yyyy-MM-dd");
		String computerDate = computerFormat.format(dateNow);
		System.out.println(computerDate); // 오전 10:26 2024-07-17(실행시 반영)
		
		// LocalDateTime을 String으로 변경
		computerDate = now.format(DateTimeFormatter.ofPattern("a hh:mm yyyy-MM-dd"));
		System.out.println(computerDate); // 오후 12:29 2025-08-05
	}
}
