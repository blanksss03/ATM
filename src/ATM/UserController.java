package ATM;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class UserController {
    static void saveUser(User user) {
        JSONObject obj = new JSONObject();
        obj.put("name", user.getName());
        obj.put("money", user.getMoney());
        obj.put("AccountNumber", user.getAccountNumber());

        try {
            FileWriter file = new FileWriter("./" + user.getName() + ".json");
            file.write(obj.toJSONString());
            file.flush();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static User loadUser(String name) {
        JSONParser parser = new JSONParser();

        User user = new User();
        try {
            FileReader reader = new FileReader("./" + name + ".json");
            Object obj = parser.parse(reader);
            JSONObject jsonObject = (JSONObject)obj;

            reader.close();

            user.setName(jsonObject.get("name").toString());
            user.insertMoney(Integer.parseInt(jsonObject.get("money").toString()));
            user.setAccountNumber(jsonObject.get("AccountNumber").toString());
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        return user;
    }
}
