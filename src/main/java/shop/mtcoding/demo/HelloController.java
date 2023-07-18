package shop.mtcoding.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController // 응답되는 데이터를 리턴
public class HelloController {

    // http://localhost/8080/ 마지막 슬래시(/)는 생략가능
    @GetMapping("/")
    public String home(){

        return "home";
    }

    // http://localhost/8080/hello 리플렉션이 구현되어 있으므로 이렇게 사용함.
    @GetMapping("/hello")
    public String hello(){

        return "<h1>hello</h1><br>asdfqwer";
    }

    // http://localhost/8080/check 리플렉션이 구현되어 있으므로 이렇게 사용함.
    @GetMapping("/check")
    public void check(){
        System.out.println("check 호출됨.");
    }

    // http://localhost/8080/random/number 리플렉션이 구현되어 있으므로 이렇게 사용함.
    @GetMapping("/random/number")
    public String sadfqwer(){   // 리플렉션을 사용하므로 메소드명은 아무렇게 줘도 불러와서 사용함.
        Random r = new Random();
        // 문자랑 숫자를 더하면 결합이 일어나서 문자로 형 변환이 일어난다.
//        int num = r.nextInt(5); 
        // 랩퍼 클래스를 사용하여 .toString() 사용해서 문자열로 변환
        Integer num = r.nextInt(5);

        return "<h1>"+ num.toString() + "</h1>";
    }
}
