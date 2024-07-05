package exam.http;

import com.google.gson.Gson;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class JsonParseTest {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.setName("Americano");
        coffee.setPrice(1000);
        coffee.setDecaffeinated(false);

        // 직렬화
        Gson gson = new Gson();
        String strJson = gson.toJson(coffee);

        // {"name":"Americano","price":1000,"isDecaffeinated":false}
        System.out.println(strJson);

        // 역직렬화
        Coffee newCoffee = gson.fromJson(strJson, Coffee.class);

        // Coffee(name=Americano, price=1000, isDecaffeinated=false)
        System.out.println(newCoffee);
    }
}

@Setter
@Getter
@ToString
class Coffee {
    private String name;
    private int price;
    private boolean isDecaffeinated;
}
