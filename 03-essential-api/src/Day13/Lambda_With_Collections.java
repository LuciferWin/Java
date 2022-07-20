package Day13;

import java.util.List;

public class Lambda_With_Collections {
	public static void main(String[] args) {
		List<String> Languages = List.of("Html", "Javascript", "css", "Java", "Php");
//		Languages.forEach(null);
//		for(String lang : Languages) {
//			System.out.println(lang);
//		}
		
		Languages.forEach(lang -> System.out.println(lang));
		
		System.out.println("---------- Contain 'Java'----------");
		Languages.forEach(lang -> {
			if(lang.contains("Java"))
				System.out.println(lang);
		});
	}
}
