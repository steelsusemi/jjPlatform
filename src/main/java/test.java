//
//import java.math.BigDecimal;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.TreeMap;
//import java.util.stream.Collectors;
//import java.util.stream.IntStream;
//import java.util.stream.Stream;
//
//import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//import com.jjPForm.core.account.vo.TestVo;
//
//public class test {
//
//	public static void main(String[] args) throws Exception {
//		
////		String encryptKey = "ztxHSTBWuMmdi/Eu9yN1vzGAUEOD5JZPq2ayFr5lzwI=";
////		System.out.println("encryptKey = " + encryptKey);
////		String algorithmKey = "PBEWithMD5AndDES";
////		System.out.println("algorithmKey = " + algorithmKey);
////
////		StandardPBEStringEncryptor pbeEnc = new StandardPBEStringEncryptor();
////		pbeEnc.setAlgorithm(algorithmKey);
////		pbeEnc.setPassword(encryptKey); 
////		
////		String driveEnc = pbeEnc.encrypt("org.mariadb.jdbc.Driver");
////		String urlEnc = pbeEnc.encrypt("jdbc:log4jdbc:mysql://127.0.0.1:3306/adminBoot?autoReconnect=true&verifyServerCertificate=false&useSSL=false");
//////		String urlEnc = pbeEnc.encrypt("jdbc:sqlserver://192.168.0.10:3727;databasename=UGIWEB");
////		String userNameEnc = pbeEnc.encrypt("adminBoot");
////		String passwordEnc = pbeEnc.encrypt("akfls5315!@");
////		System.out.println("driveEnc = " + driveEnc);
////		System.out.println("urlEnc = " + urlEnc);
////		System.out.println("userNameEnc = " + userNameEnc);
////		System.out.println("passwordEnc = " + passwordEnc);
////		
////		String driveDes = pbeEnc.decrypt("2WjH49gRjNsABn364PImTQzyYL9hyAcCdpIZVaXwFPw=");
////		String urlDes = pbeEnc.decrypt(urlEnc);
////		String userNameDes = pbeEnc.decrypt(userNameEnc);
////		String passwordDes = pbeEnc.decrypt(passwordEnc);
////		System.out.println("driveDes = " + driveDes);
////		System.out.println("urlDes = " + urlDes);
////		System.out.println("userNameDes = " + userNameDes);
////		System.out.println("passwordDes = " + passwordDes);
//		
////		List<Integer> ages = new ArrayList<Integer>();
////		ages.add(1);
////		ages.add(2);
////		ages.add(3);//1,2,3
////		System.out.println(ages.stream().filter(x -> x>1).noneMatch(x->x>2));//false
////		ages.stream().filter(x -> x>1).forEach(x->System.out.println(x));//false
////		
////		List<String> names = Arrays.asList("jeong", "pro", "jdk", "java");
////		long b = names.parallelStream().filter(x -> x.contains("o")).count();
////
////		Stream<String> a = names.stream().filter(x -> x.contains("o")).map(x-> x.concat("s"));
////		a.forEach(x -> System.out.println(b+" : "+x));
//		
//		//샘플 데이터
////		List<Map<Object, Object>> list = new ArrayList<Map<Object, Object>>();
////		Map<Object, Object> req = new HashMap<Object, Object>();
////		req.put("id", "admin");
////		req.put("text", "ab");
////		req.put("type", "A");
////		req.put("tot", 1);
////		list.add(req);
////		req = new HashMap<Object, Object>();
////		req.put("id", "test");
////		req.put("text", "hello");
////		req.put("type", "B");
////		req.put("tot", 2);
////		list.add(req);
////		req = new HashMap<Object, Object>();
////		req.put("id", "admin2");
////		req.put("text", "GOOD");
////		req.put("type", "A");
////		req.put("tot", 3);
////		list.add(req);
////		req = new HashMap<Object, Object>();
////		req.put("id", "root");
////		req.put("text", "ab");
////		req.put("type", "C");
////		req.put("tot", 4);
////		list.add(req);
////		req = new HashMap<Object, Object>();
////		req.put("id", "admin2");
////		req.put("text", "GOOD");
////		req.put("type", "A");
////		req.put("tot", 5);
////		list.add(req);	
//		
//		List<String> list = new ArrayList<>();
//        list.add("aaaca");
//        list.add("aaa");
//        list.add("aaa");
//        list.add("bbbcccs");
//        list.add("ccc");
//
//        Map<Object, Long> map = new HashMap<>();
//
////        for(String target : list){
////            Integer num = map.get(target);
////            if(num == null){
////                map.put(target, 1);
////            } else {
////                map.put(target, num+1);
////            }
////        }
//        
//        map = list.stream()
//        	.collect(Collectors.groupingBy( arg -> arg, HashMap::new, Collectors.counting()));
//        
//        System.out.println(map);
//        
//		
//		List<TestVo> testList =
//	            Arrays.asList(
//	                      new TestVo("admin", "ab", "A"  	, new BigDecimal(1), new BigDecimal(1))
//	                    , new TestVo("test", "hello", "B"	, new BigDecimal(2), new BigDecimal(2))
//	                    , new TestVo("admin2", "GOOD", "A"	, new BigDecimal(3), new BigDecimal(3))
//	                    , new TestVo("root", "ab", "C"		, new BigDecimal(4), new BigDecimal(4))
//	                    , new TestVo("admin3", "GOOD", "A"	, new BigDecimal(5), new BigDecimal(5))
//	            );
//		
////		Stream<HashMap<Object, Object>> list2 = list.stream().filter(oo-> oo.get("type").toString().equals("A") );
//	    Map<String, BigDecimal> groupingByResult = testList.stream()
//		           .collect(Collectors.groupingBy(
//		        		   				TestVo::getType
//		        		   				, TreeMap::new
//		        		   				, Collectors.reducing(BigDecimal.ZERO, x -> x.getTot(), (x,y) -> x.add(y))
//		        		   				)
//		        		   );
////		           .collect(toList());
//	    System.out.println(groupingByResult);
////			//원본 list 내용 출력
////			list.stream().forEach(System.out::println);
////
////			//람다로 풀어쓴 모습
////			list.stream().forEach( target->{
////				System.out.println(target);
////			});
//			
//			//type이 A인 내용만 가져오기
////			Stream<HashMap<Object, Object>> list2 = list.stream().filter(oo-> oo.get("type").toString().equals("A") );
////		    List<TestVo> groupingByResult = testList.stream()
////			           .collect(groupingBy(dnc -> TestVo::getType, TreeMap::new, summingLong(dnc::tot)))
////			           .collect(toList());;
////			
////			System.out.print("groupingByResult >>"+ groupingByResult);
////			list2.forEach(System.out::println);
////			
//////			필터를 통한 대상 합(count) 구하기
////			long count = list.stream().filter( oo-> oo.get("type").toString().equals("A") ).count();
////			System.out.println("count : " + count);
//			
//			//NEW 라는 키와 A라는 값을 추가하기
////			List<HashMap<Object, Object>> list3 = list.stream().map( oo-> {oo.put("NEW", "A"); return oo;} ).collect(Collectors.toList());
////			list3.forEach(System.out::println);
//			
////			//map 객체를 숫자로, 총 합
////			int mapToInt = list.stream().mapToInt(HashMap::size).sum();
////			System.out.println(mapToInt);
////
////			//flatmap을 통해 1개의 단일 원소로 반환
////			Stream<Object> list4 = list.stream().flatMap(x-> x.keySet().parallelStream());
////			list4.forEach(System.out::println);  //map이 1개의 list안에 들어간 모양으로 출력
//			
//			//distinct를 활용한 중복 제거
////			Stream<HashMap<Object, Object>> list5 = list.stream().distinct();
////			list5.forEach(System.out::println);
//			
//			//일반정렬, 통상 map 객체가 아닌 문자, 숫자 대상으로 자주 사용.
////			list.stream().sorted();
////			list.forEach(System.out::println);
//			
//			//Map객체에 대한 정렬
////			list.sort(Comparator.comparing(
////				m -> m.get("id").toString(), 
////				Comparator.nullsLast(Comparator.naturalOrder()))
////			);
////			list.forEach(System.out::println);
//			
//			List<String> fruits = Arrays.asList("pear", "apple", "grapes", null, "orange");
//			fruits.sort(Comparator.nullsLast(Comparator.reverseOrder()));
//			System.out.println(fruits); 
//			
//			// 0~1000까지의 값 중 500이상이며 짝수이면서 5의 배수인 수의 합을 구하라
//			System.out.println(
//			      IntStream.range(0, 1001)
//			            .skip(500)
//			            .filter(i-> i%2==0)
//			            .filter(i-> i%5==0)
//			            .sum()
//			);
//			
//	}
////	final String username = "whwncjs95@gmail.com";
////	final String password = "akfls5315";
////
////	Properties prop = new Properties();prop.put("mail.smtp.host","smtp.gmail.com");prop.put("mail.smtp.port","587");prop.put("mail.smtp.auth","true");prop.put("mail.smtp.socketFactory.port","587");prop.put("mail.smtp.starttls.enable","true");
//////		prop.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
////
////	Session session = Session.getInstance(prop, new javax.mail.Authenticator() {
////			@Override
////			protected PasswordAuthentication getPasswordAuthentication() {
////				return new PasswordAuthentication(username, password);
////			}
////		});
////
////		try {
////
////	Message message = new MimeMessage(
////			session);message.setFrom(new InternetAddress("99000101@lgl.com"));message.setRecipients(Message.RecipientType.TO,InternetAddress.parse("whwncjs95@gmail.com, whwncjs95@gmail.com"));message.setSubject("Testing Gmail SSL");message.setText("Dear Mail Crawler,"+"\n\n Please do not spam my email!");
////
////	Transport.send(message);
////
////	System.out.println("Done");
////
////	}catch(
////	MessagingException e)
////	{
////		e.printStackTrace();
////	}
//	
//}
//
