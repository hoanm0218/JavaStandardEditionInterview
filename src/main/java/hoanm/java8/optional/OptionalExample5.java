package hoanm.java8.optional;

import java.util.Optional;

/**
 * Phương thức filter() :
 * Nếu như có giá trị hiện diện trong đối tượng Optional này và giá trị của nó khớp với Predicate truyền vào, nó sẽ trả
 * về một Optional chứa giá trị đó, mặc khác sẽ trả về một Optional rỗng.
 */
public class OptionalExample5 {
    public static void main(String[] args) {
        Optional<String> me = Optional.of("UniDev");
        Optional<String> emptyOptional = Optional.empty();

        //Filter on Optional
        System.out.println(me.filter(g -> g.equals("UNIDEV"))); //Optional.empty
        System.out.println(me.filter(g -> g.equalsIgnoreCase("UniDev"))); //Optional[UniDev]
        System.out.println(emptyOptional.filter(g -> g.equalsIgnoreCase("UniDev"))); //Optional.empty
    }
}
