package authentication;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Repsitory {
    public List<User> users;
    public List <User> getData(){
        try{
            FileReader reader = new FileReader("user.json");
            Type objectType = new TypeToken<List<User>>(){
            }.getType();
            users = new Gson().fromJson(reader, objectType);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        return users;
    }
}
