import java.util.Locale;
public class Default{
    public static void main(String[] args){
        Locale.setDefault(new Locale("en", "US"));
        System.out.println(Locale.getDefault());
    }
}
