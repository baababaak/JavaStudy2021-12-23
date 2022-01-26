package a10_문자열;

public class Quiz01 {

	public static void main(String[] args) {
		String message = "junil:안녕하세요@jun:반갑습니다.@junil:김준일입니다.";
		/*
		int index = message.indexOf("@");
		String data = message.substring(0, index); // junil:안녕하세요
		message = message.substring(index + 1); // jun:반갑습니다.@junil:김준일입니다.
		int dataIndex = data.indexOf(":");
		String username = data.substring(0, dataIndex);
		String content = data.substring(dataIndex + 1);
		/////////////////////////////////////////////////
		index = message.indexOf("@");
		data = message.substring(0, index); // jun:반갑습니다.
		message = message.substring(index + 1); // junil:김준일입니다.
		dataIndex = data.indexOf(":");
		username = data.substring(0, dataIndex);
		content = data.substring(dataIndex + 1);
		/////////////////////////////////////////////////
		index = message.indexOf("@");
		data = message.substring(0, index); // jun:반갑습니다.
		message = message.substring(index + 1); // junil:김준일입니다.
		dataIndex = data.indexOf(":");
		username = data.substring(0, dataIndex);
		content = data.substring(dataIndex + 1);
		*/		
		
		while(true) {
			int index = 0;
			String data = message;
			
			if(message.contains("@")) { // "@"를 포함하고 있으면
				index = message.indexOf("@");
				data = message.substring(0, index);
				message = message.substring(index + 1);
			}else {
				message = null;
			}
			int dataIndex = data.indexOf(":");
			String username = data.substring(0,dataIndex);
			String content = data.substring(dataIndex + 1);			
			System.out.println("아이디: " + username);
			System.out.println("내용: " + content);
			if(message == null) {
				break;
			}

		}
		
		

	}

}
