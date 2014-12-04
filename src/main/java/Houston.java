import com.google.common.base.Joiner;

public class Houston {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a Houston");
        Joiner j = Joiner.on("; ").skipNulls();
        System.out.println(j.join("Foo", null, "Bar"));
    }
}

